package com.example.cleanarcitacter1.persentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanarcitacter1.data.entity.ToDoEntity
import com.example.cleanarcitacter1.domain.todo.GetToDoListUseCase
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/*
* 필요한 UseCase
*
* 1. [GetToDOListUseCase]
* 2. [UpdateToDoUseCase]
* 3. [DeleteAllToDoItemUseCase]
*
* */

internal class ListViewModel (
    private val getToDoListUseCase: GetToDoListUseCase
): ViewModel() {
    private val _toDoListLiveData = MutableLiveData<List<ToDoEntity>?>()
    val todoListLiveData: MutableLiveData<List<ToDoEntity>?> = _toDoListLiveData

    fun fetchData(): Job = viewModelScope.launch {
        _toDoListLiveData.postValue(getToDoListUseCase())
    }
}