package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Themes {
    public List<String> theme = new ArrayList<String>();
    public List<Questions> questions;

    Themes(){
        this.theme.add("Fruits");
        this.theme.add("Géographie");
        this.theme.add("Entertainment");
        this.theme.add("Arts & Literature");
        this.theme.add("Science & Nature");
        this.theme.add("Sports");
        this.theme.add("Economie");
        this.theme.add("Jeux Vidéos");
        this.theme.add("Cinéma");
        this.theme.add("Culture");
    }

    public List getSpecificNumberOfThemes(int cpt){
        final int[] ints = new Random().ints(0, 10).distinct().limit(cpt).toArray();
        List<String> myList = new ArrayList<>();

        for (int i = 0; i < this.theme.size(); i++) {
            if(Helpers.contains(ints, i)){
                myList.add((String) this.theme.get(i));
            }
        }

        return myList;
    }

    public void listAllThemes(){
        for (int i = 0; i < this.theme.size(); i++) {
            System.out.println(i + " - " + theme.get(i));
        }
    }

    public List getThemes(){
        return this.theme;
    }
}

