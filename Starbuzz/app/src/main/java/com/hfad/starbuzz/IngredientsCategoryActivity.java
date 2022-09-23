package com.hfad.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IngredientsCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listIngredients = getListView();
        ArrayAdapter<Ingredients> listAdapter = new ArrayAdapter<Ingredients>(
                this, android.R.layout.simple_list_item_1, Ingredients.ingredients);
        listIngredients.setAdapter(listAdapter);
    }
    @Override
    //implement the onListItemClick method so that DrinkActivity is launched when the user clickson an item in the list view
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(IngredientsCategoryActivity.this, IngredientsActivity.class);
        intent.putExtra(IngredientsActivity.EXTRA_INGREDIENTSNO, (int) id);
        startActivity(intent);
    }
}