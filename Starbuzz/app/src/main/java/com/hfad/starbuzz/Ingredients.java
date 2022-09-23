package com.hfad.starbuzz;

public class Ingredients{
    //each drink has a name, description and image ID
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of Food
    public static final Ingredients[] ingredients = {
            new Ingredients("Garlic","Garlic is a species of bulbous flowering plant in the genus Allium. Its close relatives include the onion, shallot, leek, chive, Welsh onion and Chinese onion", R.drawable.garlic),
            new Ingredients("Onions","The onion, also known as the bulb onion or common onion, is a vegetable that is the most widely cultivated species of the genus Allium", R.drawable.onion),
            new Ingredients("Tomatoes","An edible berry of the plant 'Solanum lycopersicum',", R.drawable.tomato),
    };
    //each drink has a nname, description and image resource
    private Ingredients(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }

}