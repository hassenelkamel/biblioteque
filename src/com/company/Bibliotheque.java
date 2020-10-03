package com.company;

import com.company.entity.*;

import java.util.ArrayList;
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

    private Document[] chercherDocument(String titre, Document[] docs) {
        int k = 0;
        List<Integer> found = new ArrayList<>();
        for(int i=0;i<docs.length;i++) {
            if(docs[i].getTitre().indexOf(titre)!=-1){
                k++;
                found.add(i);
            }
        }
        Document[] res = new Document[k];
        int i=0;
        for(Integer f:found){
            res[i] = docs[f];
            i++;
        }
        return res;
    }

    private void listerDocuments(Document[] doc){
       for (int i=0;i<doc.length;i++ ){
            if(doc[i].empruntable() && ((Livre) doc[i]).getAdherent()!=null){
                System.out.println("document livre imprimé:************** " + doc[i].getTitre() +" "+  ((Livre) doc[i]).getAdherent().getNom() + " "+ ((Livre) doc[i]).getAdherent().getPrenom());
            } else {
                System.out.println("document imprimé:**************** " + doc[i].getTitre() );
            }
        }

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
        docs[3] = new Livre("Systèmes multi-agents","Ferber J.",ad1);
        for (int i=0;i<n;i++ ){
            System.out.println("document "+docs[i].getTitre());
            bibli.ajouterDocument(docs[i]);
            System.out.println("/*************** "+bibli.ajouterDocument(docs[i]).get(0).getTitre());
        }

        Livre livreEmp =  new Livre("Systèmes multi-agents","Ferber J.");
        Adherent adEmp = new Adherent("yahia","sboui");
        adEmp.emprunter(livreEmp,adEmp);
        //adEmp.rendre(livreEmp);
        // Question 4:
        Document[] trouve = bibli.chercherDocument("Misérables",docs);
        for (int i=0;i<trouve.length;i++ ){
            System.out.println("document "+trouve[i].getTitre());
        }
        // Question 5
        bibli.listerDocuments(docs);

    }
}
