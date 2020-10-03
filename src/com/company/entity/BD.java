package com.company.entity;

public class BD extends Volume {
    private String dessinateur;
    public BD(){

    }

    public BD(String titre, String auteur, String dessinateur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }

    public String getDessinateur() {
        return dessinateur;
    }

    public void setDessinateur(String dessinateur) {
        this.dessinateur = dessinateur;
    }
}
