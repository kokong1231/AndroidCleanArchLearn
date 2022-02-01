package com.example.cleanarcitacter1.viewmodel.todo

import com.example.cleanarcitacter1.data.entity.ToDoEntity
import com.example.cleanarcitacter1.domain.todo.InsertToDoListUseCase
import com.example.cleanarcitacter1.persentation.list.ListViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import org.koin.core.inject

/*
* [ListViewModel]을 테스트하기 위한 Unit Test Class
*
* 1. initData()
* 2. test viewModel fetch
* 3. test item update
* 4. test Item Delete All
*
* */

@ExperimentalCoroutinesApi
internal class ListViewModelTest: ViewModelTest() {

    private val viewModel: ListViewModel by inject()

    private val insertToDoListUseCase: InsertToDoListUseCase by inject()

    private val mockList = (0 until 10).map {
        ToDoEntity(
            id = it.toLong(),
            title = "title $it",
            description = "description $it",
            hasCompleted = false
        )
    }

    /*
    *
    * 1. InsertTodoListUseCase
    * 2. GetTodoItemUseCase
    *
    * */

    @Before
    fun init() {
        initData()
    }

    private fun initData() = runBlockingTest {
        insertToDoListUseCase(mockList)
    }

    // Test : 입력된 데이터를 불러와서 검증한다.
    @Test
    fun `test viewModel fetch`(): Unit = runBlockingTest {
        val testObservable = viewModel.todoListLiveData.test()
        viewModel.fetchData()
        testObservable.assertValueSequence(
            listOf(
                mockList
            )
        )
    }
}