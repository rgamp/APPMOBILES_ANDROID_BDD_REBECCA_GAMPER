package com.example.becca.appmob_gamper_bdd;

/**
 * Created by BECCA on 15/03/2017.
 */

public class Chapitre {

    private int id;
    private String name;
    private String description;

    public Chapitre(){}

    public Chapitre(String name,String description){
        this.name = name;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        return "ID : " + id + "\nNom : " + name + "\nDescription : " + description;
    }
}
