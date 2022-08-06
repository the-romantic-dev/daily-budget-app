package com.dahy.daily_budget_app.model

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager


class DAO(val sharedPreferences: SharedPreferences): Repository {
    val KEY_TOTAL_BUDGET = "TOTAL_BUDGET"


    override fun getTotalBudget(): Int {
        return sharedPreferences.getInt(KEY_TOTAL_BUDGET, 0)
    }

    override fun setTotalBudget(value: Int) {
        sharedPreferences.edit {
            putInt(KEY_TOTAL_BUDGET, value)
        }
    }
}