package com.hfad.starbuzz;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class FoodActivity extends Activity {
    public static final String EXTRA_FOODNO = "foodNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        //Get the drink from the intent
        int foodNo = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);
        Food food = Food.food[foodNo];
        //Populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
        //Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(food.getName());
        //Populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(food.getDescription());
    }
}