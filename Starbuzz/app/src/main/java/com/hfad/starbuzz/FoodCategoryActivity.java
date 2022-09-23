package com.hfad.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listFood = getListView();
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(
                this, android.R.layout.simple_list_item_1, Food.food);
        listFood.setAdapter(listAdapter);
    }
    @Override
    //implement the onListItemClick method so that DrinkActivity is launched when the user clickson an item in the list view
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOODNO, (int) id);
        startActivity(intent);
    }
}