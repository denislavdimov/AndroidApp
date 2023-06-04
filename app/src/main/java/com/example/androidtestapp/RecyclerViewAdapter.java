package com.example.androidtestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Income> incomesList;

    public RecyclerViewAdapter(Context context, List<Income> incomesList) {
        this.context = context;
        this.incomesList = incomesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_income, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleIncomeView.setText(incomesList.get(position).getCategory());
        holder.actualIncomeView.setText(incomesList.get(position).getMoneyIncome());
    }

    @Override
    public int getItemCount() {
        return incomesList.size();
    }
}
