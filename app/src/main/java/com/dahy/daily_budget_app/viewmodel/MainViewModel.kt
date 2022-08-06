package com.dahy.daily_budget_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dahy.daily_budget_app.model.Repository

class MainViewModel: ViewModel() {

    val totalBudget: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(0)
    }
}