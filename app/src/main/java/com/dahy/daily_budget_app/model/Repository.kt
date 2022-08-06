package com.dahy.daily_budget_app.model

interface Repository {

    fun getTotalBudget(): Int

    fun setTotalBudget(value: Int)

}