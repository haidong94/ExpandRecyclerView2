package com.example.dong.expandrecyclerview2;

/**
 * Created by DONG on 29-Dec-17.
 */

public class Ingredient {
    private String mName;
    private boolean mIsVegetarian;

    public Ingredient(String name, boolean isVegetarian) {
        mName = name;
        mIsVegetarian = isVegetarian;
    }

    public String getName() {
        return mName;
    }

    public boolean isVegetarian() {
        return mIsVegetarian;
    }
}
