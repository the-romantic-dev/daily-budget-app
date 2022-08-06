package com.dahy.daily_budget_app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.dahy.daily_budget_app.R
import com.dahy.daily_budget_app.databinding.FragmentMainBinding
import com.dahy.daily_budget_app.viewmodel.MainViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var fab: FloatingActionButton
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        binding.viewModel = viewModel

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab = view.findViewById(R.id.fab_main)
        val navController = findNavController()
        fab.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_addExpenseDialogFragment)
        }
    }
}