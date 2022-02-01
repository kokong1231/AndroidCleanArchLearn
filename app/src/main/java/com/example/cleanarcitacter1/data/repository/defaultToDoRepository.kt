package com.example.cleanarcitacter1.data.repository

import com.example.cleanarcitacter1.data.entity.ToDoEntity

class defaultToDoRepository: ToDoRepository {
    override suspend fun getToDoList(): List<ToDoEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun insertToDoList(toDoList: List<ToDoEntity>) {
        TODO("Not yet implemented")
    }
}