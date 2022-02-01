package com.example.cleanarcitacter1.data.repository

import com.example.cleanarcitacter1.data.entity.ToDoEntity

/*
*
* 1. insertToDoList
* 2. getToDoList
*
* */

interface ToDoRepository {

    suspend fun getToDoList(): List<ToDoEntity>

    suspend fun insertToDoList(toDoList: List<ToDoEntity>)

}