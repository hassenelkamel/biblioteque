package com.company;

import com.company.entity.*;

import java.util.List;
import java.util.Vector;

public class Bibliotheque {
    /* c'est une relation d'agregation avec adherent
        càd : une bibliotheque peut avoir 1..* adherents mais l'inverse n'est pas possible
     */
    private Vector<Adherent> adherents;

    private Vector<Document> documents;

    public Bibliotheque() {
    }

    public Bibliotheque(Vector<Adherent> adherents) {
        this.adherents = adherents;
    }

    public Vector<Adherent> getAdherents() {
        return adherents;
    }

    public void setAdherents(Vector<Adherent> adherents) {
        this.adherents = adherents;
    }

    private Vector<Adherent> ajouterAdherent(Adherent adherent) {
        Vector<Adherent> adherents = new Vector<>();
        adherents.add(adherent);
        return adherents;
    }

    private Vector<Document> ajouterDocument(Document doc) {
        Vector<Document> documents = new Vector<>();
        documents.add(doc);
        return documents;
    }

    public static void main(String[] args) {
        // write your code here
        Bibliotheque bibli = new Bibliotheque();
        Adherent ad = new Adherent("Ali", "Ben");
        bibli.ajouterAdherent(ad);
        Adherent ad1 = new Adherent("Am", "Salah");
        bibli.ajouterAdherent(ad1);
        System.out.println("/*********************" + bibli.ajouterAdherent(ad).get(0).getNom());

        int n=4;
        Document[] docs = new Document[n];
        docs[0] = new Livre("Misérables","Hugo V.");
        docs[1] = new Journal("Dr Dobbs",new Date(10,2003)); // 10 représente le mois de septembre
        docs[2] = new BD("Thorgal: La galère noire","Van Hamme", "Rosinsky");
        docs[3] = new Livre("Systèmes multi-agents","Ferber J.");
        for (int i=0;i<n;i++ ){
            System.out.println("document "+docs[i].getTitre());
            bibli.ajouterDocument(docs[i]);
            System.out.println("/*************** "+bibli.ajouterDocument(docs[i]).get(0).getTitre());
        }

        Livre livreEmp =  new Livre("Systèmes multi-agents","Ferber J.");
        Adherent adEmp = new Adherent("yahia","sboui");
        adEmp.emprunter(livreEmp,adEmp);
        adEmp.rendre(livreEmp);
    }
}
