package com.dahy.daily_budget_app.view

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.dahy.daily_budget_app.R
import com.dahy.daily_budget_app.viewmodel.MainViewModel

class ManageBudgetFragment : Fragment(R.layout.fragment_manage_budget) {

    private lateinit var totalBudgetEditBtn: ImageView
    private lateinit var totalBudgetEditText: EditText
    private lateinit var totalBudgetValue: TextView
    private val viewModel: MainViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        totalBudgetValue = view.findViewById(R.id.total_budget_value)
        totalBudgetValue.text = "${viewModel.totalBudget.value}₽"
        totalBudgetEditBtn = view.findViewById(R.id.total_budget_edit_btn)
        totalBudgetEditText = view.findViewById(R.id.total_budget_edit_text)

        totalBudgetEditBtn.setOnClickListener {
            if (!totalBudgetEditText.isVisible) {
                totalBudgetEditText.visibility = View.VISIBLE
                totalBudgetEditText.text.clear()
                totalBudgetEditText.text.insert(0, viewModel.totalBudget.value.toString())
                totalBudgetValue.visibility = View.GONE
                totalBudgetEditBtn.setImageResource(R.drawable.icon_check)
            } else {
                viewModel.totalBudget.value = totalBudgetEditText.text.toString().toInt()
                totalBudgetEditText.visibility = View.GONE
                totalBudgetValue.visibility = View.VISIBLE
                totalBudgetEditBtn.setImageResource(R.drawable.icon_edit)

            }
        }

        viewModel.totalBudget.observe(viewLifecycleOwner) {
            totalBudgetValue.text = "$it₽"
        }



    }
}