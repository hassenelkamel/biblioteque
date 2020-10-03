package com.company.entity;

public class Livre extends Volume {
    Adherent adherent;
    public Livre() {

    }

    public Livre(String titre, String auteur) {
        super(titre, auteur);
    }

    public Livre(String titre, String auteur, Adherent adherent) {
        super(titre, auteur);
        this.adherent = adherent;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public boolean empruntable(){
        return true;
    }


}
