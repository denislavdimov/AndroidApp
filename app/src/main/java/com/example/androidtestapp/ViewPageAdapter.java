package com.example.androidtestapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.androidtestapp.Fragments.ExpensesFragment;
import com.example.androidtestapp.Fragments.IncomeFragment;

public class ViewPageAdapter extends FragmentStateAdapter {

    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return  new ExpensesFragment();
            default:
                return new IncomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
