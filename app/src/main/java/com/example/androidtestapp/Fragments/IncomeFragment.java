package com.example.androidtestapp.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidtestapp.Income;
import com.example.androidtestapp.R;
import com.example.androidtestapp.RecyclerViewAdapter;
import com.example.androidtestapp.ViewPageAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class IncomeFragment extends Fragment {

    FloatingActionButton floatingActionButton;
    RecyclerViewAdapter adapter;
    public List<Income> incomeList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      return inflater.inflate(R.layout.fragment_income, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView1 = view.findViewById(R.id.recyclerViewIncome);
        adapter = new RecyclerViewAdapter(getContext(), incomeList);


        incomeList.add(new Income("Income", "2300"));
//        incomeList.add(new Income("Income", "300"));

        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView1.setAdapter(adapter);
    }
}