package com.example.androidtestapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidtestapp.Fragments.IncomeFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private IncomeFragment incomeFragment;

    int incomeAmount = 2000;
    String incomeTest;
    TextView incomeText;

    public MainActivity() {
        incomeFragment = new IncomeFragment();
    }

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fabButton);
        fab = (FloatingActionButton) findViewById(R.id.fabButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        List<Income> list = incomeFragment.incomeList;
        incomeText = findViewById(R.id.readonly_Income);

//        for (int i = 0; i < list.size(); i++) {
//            String money = list.get(i).getMoneyIncome();
//            incomeTest = money;
//        }


        if (list.size() > 0) {
            incomeTest = list.get(0).getMoneyIncome();
            incomeText.setText(incomeTest);
        }


    }
    public void openNewActivity(){
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }
}