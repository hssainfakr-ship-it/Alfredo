package com.alfredo.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.alfredo.models.Question
import com.alfredo.models.UserProgress
import com.alfredo.models.Achievement
import com.alfredo.models.QuizResult

@Dao
interface QuestionDao {
    @Insert
    suspend fun insertQuestion(question: Question)

    @Insert
    suspend fun insertQuestions(questions: List<Question>)

    @Query("SELECT * FROM questions WHERE subject = :subject ORDER BY RANDOM() LIMIT :limit")
    suspend fun getRandomQuestionsBySubject(subject: String, limit: Int): List<Question>

    @Query("SELECT * FROM questions ORDER BY RANDOM() LIMIT :limit")
    suspend fun getRandomQuestions(limit: Int): List<Question>

    @Query("SELECT COUNT(*) FROM questions")
    suspend fun getTotalCount(): Int
}

@Dao
interface UserProgressDao {
    @Insert
    suspend fun insert(progress: UserProgress)

    @Query("SELECT * FROM user_progress WHERE id = 1")
    suspend fun getProgress(): UserProgress?

    @Update
    suspend fun update(progress: UserProgress)

    @Query("UPDATE user_progress SET xp = xp + :amount WHERE id = 1")
    suspend fun addXP(amount: Int)

    @Query("UPDATE user_progress SET correctAnswers = correctAnswers + 1, questionsAnswered = questionsAnswered + 1 WHERE id = 1")
    suspend fun incrementCorrectAnswer()

    @Query("UPDATE user_progress SET incorrectAnswers = incorrectAnswers + 1, questionsAnswered = questionsAnswered + 1 WHERE id = 1")
    suspend fun incrementWrongAnswer()
}

@Dao
interface AchievementDao {
    @Insert
    suspend fun insert(achievement: Achievement)

    @Query("SELECT * FROM achievements")
    suspend fun getAll(): List<Achievement>

    @Query("SELECT * FROM achievements WHERE isUnlocked = 1")
    suspend fun getUnlocked(): List<Achievement>

    @Query("UPDATE achievements SET isUnlocked = 1 WHERE achievementId = :id")
    suspend fun unlock(id: String)
}

@Dao
interface QuizResultDao {
    @Insert
    suspend fun insert(result: QuizResult)

    @Query("SELECT * FROM quiz_results ORDER BY completedAt DESC LIMIT 10")
    suspend fun getRecent(): List<QuizResult>

    @Query("SELECT COUNT(*) FROM quiz_results")
    suspend fun getTotalCompleted(): Int
}
