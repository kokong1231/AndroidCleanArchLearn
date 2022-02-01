package com.example.cleanarcitacter1.di

import com.example.cleanarcitacter1.data.repository.ToDoRepository
import com.example.cleanarcitacter1.data.repository.testToDoRepository
import com.example.cleanarcitacter1.domain.todo.GetToDoListUseCase
import com.example.cleanarcitacter1.domain.todo.InsertToDoListUseCase
import com.example.cleanarcitacter1.persentation.list.ListViewModel
import org.koin.android.experimental.dsl.viewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val appTestModule = module {
    // ViewModel
    viewModel { ListViewModel(get ()) }

    // UseCase
    factory { GetToDoListUseCase(get ()) }
    factory { InsertToDoListUseCase(get ()) }

    // Repository
    single<ToDoRepository> {
        testToDoRepository()
    }
}