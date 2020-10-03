package com.company.entity;

public class Volume extends Document {
    private String auteur;
    public Volume() {

    }

    public Volume(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
