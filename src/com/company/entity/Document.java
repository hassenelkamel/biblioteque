package com.company.entity;

public class Document {
    private String titre;

    public Document() {
    }

    public Document(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public boolean empruntable(){
        return false;
    }
}
