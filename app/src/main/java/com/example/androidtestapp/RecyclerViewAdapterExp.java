package com.example.androidtestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapterExp extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Expenses> expensesList;

    public RecyclerViewAdapterExp(Context context, List<Expenses> expensesList) {
        this.context = context;
        this.expensesList = expensesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_expenses, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleExpensesView.setText(expensesList.get(position).getCategory());
        holder.expensesView.setText(expensesList.get(position).getMoneyExpenses());
    }

    @Override
    public int getItemCount() {
        return  expensesList.size();
    }
}
