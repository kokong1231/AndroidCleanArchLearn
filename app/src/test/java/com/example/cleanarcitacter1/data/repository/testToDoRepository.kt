package com.example.cleanarcitacter1.data.repository

import com.example.cleanarcitacter1.data.entity.ToDoEntity

class testToDoRepository: ToDoRepository {

    private val toDoList: MutableList<ToDoEntity> = mutableListOf()

    override suspend fun getToDoList(): List<ToDoEntity> {
        return toDoList
    }

    override suspend fun insertToDoList(toDoList: List<ToDoEntity>) {
        this.toDoList.addAll(toDoList)
    }
}