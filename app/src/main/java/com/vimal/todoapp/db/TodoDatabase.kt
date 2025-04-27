package com.vimal.todoapp.db

import androidx.room.Database
import com.vimal.todoapp.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase {
    companion object{
        const val NAME = "Todo_DB"
    }

    abstract fun getTodoDao(): TodoDao
}