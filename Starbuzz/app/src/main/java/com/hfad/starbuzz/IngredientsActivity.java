package com.hfad.starbuzz;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class IngredientsActivity extends Activity {
    public static final String EXTRA_INGREDIENTSNO = "ingredientsNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        //Get the drink from the intent
        int ingredientsNo = (Integer) getIntent().getExtras().get(EXTRA_INGREDIENTSNO);
        Ingredients ingredients = Ingredients.ingredients[ingredientsNo];
        //Populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(ingredients.getImageResourceId());
        photo.setContentDescription(ingredients.getName());
        //Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(ingredients.getName());
        //Populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(ingredients.getDescription());
    }
}