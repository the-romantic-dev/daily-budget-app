package com.dahy.daily_budget_app.view

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment
import com.dahy.daily_budget_app.R

class AddExpenseDialogFragment(): DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val inflater = requireActivity().layoutInflater

            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setView(inflater.inflate(R.layout.dialog_add_expense, null))
                .setPositiveButton("OK") { dialog, id ->
                    Log.d("dahy639", "$dialog and $id")
                }
                .setNegativeButton("Cancel") { dialog, id ->
                    Log.d("dahy639", "$dialog and $id")
                }
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")

    }
}