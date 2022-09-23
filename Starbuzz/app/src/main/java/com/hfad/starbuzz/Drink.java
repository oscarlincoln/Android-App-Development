package com.hfad.starbuzz;

public class Drink{
    //each drink has a name, description and image ID
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte","A couple of espressoshot with steemed milk", R.drawable.latte),
            new Drink("Cappuccino","Espresso,hot milk,and a steemed milk foam", R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans roasted and brewed fresh", R.drawable.filter),
    };
    //each drink has a nname, description and image resource
    private Drink(String name, String description, int imageResourceId){
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