package com.company.entity;

import java.util.Vector;

public class Adherent {
    private String prenom ="";
    private String nom="";
    private Vector<Livre> livres;


    // Constructeur par défaut
    public Adherent() {
    }

    public Adherent(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Adherent(String prenom, String nom, Vector<Livre> livres) {
        this.prenom = prenom;
        this.nom = nom;
        this.livres = livres;
    }

    public Vector<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Vector<Livre> livres) {
        this.livres = livres;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void emprunter(Livre l,Adherent ad) {
        if (l.getAdherent()==null) {
            l.setAdherent(ad);
            System.out.println("Nom de livre ****"+l.getTitre());
            System.out.println("Nom de l'adherent *********"+l.getAdherent().getPrenom());
        }
    }

    public void rendre(Livre l) {
        if (l.getAdherent()!=null) {
            l.setAdherent(null);
            System.out.println("Nom de livre ****"+l.getTitre());
            System.out.println("Nom de l'adherent *********"+l.getAdherent());
        }
    }
}
