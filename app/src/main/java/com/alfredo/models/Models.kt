package com.alfredo.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val subject: String,
    val difficulty: Int,
    val questionText: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val correctAnswer: String,
    val explanation: String,
    val createdAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "user_progress")
data class UserProgress(
    @PrimaryKey val id: Int = 1,
    var xp: Int = 0,
    var level: Int = 1,
    var questionsAnswered: Int = 0,
    var correctAnswers: Int = 0,
    var incorrectAnswers: Int = 0,
    var currentStreak: Int = 0,
    var maxStreak: Int = 0
)

@Entity(tableName = "achievements")
data class Achievement(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val achievementId: String,
    val title: String,
    val description: String,
    var isUnlocked: Boolean = false,
    val xpReward: Int = 0
)

@Entity(tableName = "quiz_results")
data class QuizResult(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val quizType: String,
    val subject: String,
    val totalQuestions: Int,
    val correctAnswers: Int,
    val score: Float = 0f,
    val timeSpent: Long,
    val xpEarned: Int = 0,
    val completedAt: Long = System.currentTimeMillis()
)
