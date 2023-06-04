package com.example.androidtestapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView titleIncomeView, actualIncomeView;
    TextView titleExpensesView, expensesView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        titleIncomeView = itemView.findViewById(R.id.incomeTitle);
        actualIncomeView = itemView.findViewById(R.id.actualIncome);

        titleExpensesView = itemView.findViewById(R.id.expensesTitle);
        expensesView = itemView.findViewById(R.id.actualExpenses);
    }
}
