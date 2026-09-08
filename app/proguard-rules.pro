-keep class com.alfredo.models.** { *; }
-keep class com.alfredo.database.** { *; }
-keep class * extends java.io.Serializable { *; }

# Room
-dontwarn androidx.room.** 
-keep class androidx.room.** { *; }
