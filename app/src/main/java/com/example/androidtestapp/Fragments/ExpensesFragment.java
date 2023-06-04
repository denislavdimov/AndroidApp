package com.example.androidtestapp.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidtestapp.Expenses;
import com.example.androidtestapp.Income;
import com.example.androidtestapp.R;
import com.example.androidtestapp.RecyclerViewAdapter;
import com.example.androidtestapp.RecyclerViewAdapterExp;

import java.util.ArrayList;
import java.util.List;

public class ExpensesFragment extends Fragment {
    RecyclerViewAdapterExp adapter;
    List<Expenses> expensesList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_expenses, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView1 = view.findViewById(R.id.recyclerViewExpenses);
        adapter = new RecyclerViewAdapterExp(getContext(), expensesList);


        List<Income> incomes = new ArrayList<Income>();
        expensesList.add(new Expenses("Expenses", "250"));

        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView1.setAdapter(adapter);
    }
}