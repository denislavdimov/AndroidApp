package com.example.androidtestapp;

import java.io.Serializable;

public class Income implements Serializable {
    String Category;
    String MoneyIncome;

    public Income(String category, String moneyIncome) {
        Category = category;
        MoneyIncome = moneyIncome;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getMoneyIncome() {
        return MoneyIncome;
    }

    public void setMoneyIncome(String moneyIncome) {
        MoneyIncome = moneyIncome;
    }
}
