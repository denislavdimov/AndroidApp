package com.example.androidtestapp;

import java.io.Serializable;

public class Expenses implements Serializable {
    String Category;
    String MoneyLeft;

    public Expenses(String category, String moneyLeft) {
        Category = category;
        MoneyLeft = moneyLeft;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getMoneyExpenses() {
        return MoneyLeft;
    }

    public void setMoneyIncome(String moneyLeft) {
        MoneyLeft = moneyLeft;
    }
}
