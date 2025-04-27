package com.vimal.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo (
    var id: Int,
    var title: String,
    var createdAt: Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getTestTodo() : List<Todo> {
    return listOf<Todo>(
        Todo(1, "First Todo", Date.from(Instant.now())),
        Todo(2, "Second Todo", Date.from(Instant.now())),
        Todo(3, "Third Todo", Date.from(Instant.now())),
        Todo(4, "Fourth Todo", Date.from(Instant.now())),
    )
}