package com.example.cleanarcitacter1.data.entity

data class ToDoEntity (
    val id: Long = 0,
    val title: String,
    val description: String,
    val hasCompleted: Boolean = false
)
