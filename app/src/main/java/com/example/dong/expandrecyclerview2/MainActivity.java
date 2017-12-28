package com.example.dong.expandrecyclerview2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecipeAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ingredient beef = new Ingredient("beef", false);
        Ingredient cheese = new Ingredient("cheese", true);
        Ingredient salsa = new Ingredient("salsa", true);
        Ingredient tortilla = new Ingredient("tortilla", true);
        Ingredient ketchup = new Ingredient("ketchup", true);
        Ingredient bun = new Ingredient("bun", true);

        Recipe taco = new Recipe("taco", Arrays.asList(beef, cheese, salsa, tortilla));
        Recipe quesadilla = new Recipe("quesadilla", Arrays.asList(cheese, tortilla));
        Recipe burger = new Recipe("burger", Arrays.asList(beef, cheese, ketchup, bun));
        final List<Recipe> recipes = Arrays.asList(taco, quesadilla, burger);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new RecipeAdapter(this, recipes);
        mAdapter.expandAllParents();


        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mAdapter.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mAdapter.onRestoreInstanceState(savedInstanceState);
    }

}
