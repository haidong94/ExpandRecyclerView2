package com.example.dong.expandrecyclerview2;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;

/**
 * Created by DONG on 29-Dec-17.
 */

public class IngredientViewHolder extends ChildViewHolder {

    private TextView tvChild;

    public IngredientViewHolder(View itemView) {
        super(itemView);
        tvChild = itemView.findViewById(R.id.tvChild);
    }

    public void bind(String name) {
        tvChild.setText(name);
    }
}