package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        //create an onItemClickListener
        //OnItemClickListener is a nested class with the AdapterView class. a ListView is a subclass of AdapterView
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //since drinks is the first item in the list, it is then at position 0
               if (position == 0){
                   Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                   startActivity(intent);
               }else if(position == 1){
                   Intent intent = new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
                   startActivity(intent);
               }else if(position == 2){
                    Intent intent = new Intent(TopLevelActivity.this, IngredientsCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        //add the listener to the listview
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);//adding listener to the list view
    }
}