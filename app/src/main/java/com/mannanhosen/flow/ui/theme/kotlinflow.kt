package com.mannanhosen.flow.ui.theme

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

fun kotlinflow() {
    CoroutineScope(Dispatchers.Main).launch {
        val data: Flow<Int> = producer()
        data.collect{
            Log.d("asdfdfsa", "Received: $it")
        }
    }
}

    fun producer() = flow<Int> {
        val list = listOf(1, 2, 3, 4, 5)
        list.forEach {
            delay(1000)
            emit(it)
        }
    }


