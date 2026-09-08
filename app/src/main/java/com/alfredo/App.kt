package com.alfredo

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.alfredo.database.AlfredoDatabase

class App : Application() {
    companion object {
        private lateinit var instance: App
        fun getInstance(): App = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        createNotificationChannels()
        initializeDatabase()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val dailyChannel = NotificationChannel(
                "daily_challenge",
                "التحديات اليومية",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "إشعارات التحديات اليومية"
            }

            val achievementChannel = NotificationChannel(
                "achievements",
                "الإنجازات",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "إشعارات الإنجازات الجديدة"
            }

            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(dailyChannel)
            manager?.createNotificationChannel(achievementChannel)
        }
    }

    private fun initializeDatabase() {
        AlfredoDatabase.getInstance(this)
    }
}
