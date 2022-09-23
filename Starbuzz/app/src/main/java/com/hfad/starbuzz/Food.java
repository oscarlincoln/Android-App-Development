package com.hfad.starbuzz;

public class Food{
    //each drink has a name, description and image ID
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of Food
    public static final Food[] food = {
            new Food("Meat","Meat is animal flesh that is eaten as food. Humans have hunted, farmed, and scavenged animals for meat since prehistoric times", R.drawable.meat),
            new Food("Beans","A bean is the seed of one of several genera of the flowering plant family Fabaceae, which are used as vegetables for human or animal food", R.drawable.beans),
            new Food("Rice","Rice is the seed of the grass species Oryza sativa or less commonly Oryza glaberrima.", R.drawable.rice),
    };
    //each drink has a nname, description and image resource
    private Food(String name, String description, int imageResourceId){
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