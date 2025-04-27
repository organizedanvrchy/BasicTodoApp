package com.vimal.todoapp.db

import androidx.room.TypeConverter
import java.util.Date

class Converters {

    @TypeConverter
    fun fromData(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun toData(time: Long): Date {
        return Date(time)
    }
}