package com.example.cleanarcitacter1.domain.todo

import com.example.cleanarcitacter1.data.entity.ToDoEntity
import com.example.cleanarcitacter1.data.repository.ToDoRepository
import com.example.cleanarcitacter1.domain.UseCase

internal class InsertToDoListUseCase (
    private val toDoRepository: ToDoRepository
): UseCase {
    suspend operator fun invoke(toDoList: List<ToDoEntity>) {
        return toDoRepository.insertToDoList(toDoList)
    }
}