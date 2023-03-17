package com.afpa.www.bean;

public class Compte {
    private String typeDeCompte;
    private String nom;
    private int id;
    private double soldeCompteClassique=0;
    private double soldeCompteLivretA=0;
    private double soldecompteEpargneLogement=0;

    public Compte(String typeDeCompte, String nom, int id, double soldeCompteClassique, double soldeCompteLivretA, double soldecompteEpargneLogement) {
        this.typeDeCompte = typeDeCompte;
        this.nom = nom;
        this.id = id;
        this.soldeCompteClassique = soldeCompteClassique;
        this.soldeCompteLivretA = soldeCompteLivretA;
        this.soldecompteEpargneLogement = soldecompteEpargneLogement;
    }

    public String getTypeDeCompte() {
        return typeDeCompte;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public double getSoldeCompteClassique() {
        return soldeCompteClassique;
    }
    public void setSoldeCompteClassique(double soldeCompteClassique) {
        this.soldeCompteClassique = soldeCompteClassique;
    }
    public double getSoldeCompteLivretA() {
        return soldeCompteLivretA;
    }
    public void setSoldeCompteLivretA(double soldeCompteLivretA) {
        this.soldeCompteLivretA = soldeCompteLivretA;
    }

    public double getSoldecompteEpargneLogement() {
        return soldecompteEpargneLogement;
    }

    public void setSoldecompteEpargneLogement(double soldecompteEpargneLogement) {
        this.soldecompteEpargneLogement = soldecompteEpargneLogement;
    }

    public void depotCompteClassique(double depotArgentClassique){
        this.soldeCompteClassique = this.soldeCompteClassique + depotArgentClassique;
    }
    public void depotCompteLivretA(double depotArgentLivretA){
        this.soldeCompteLivretA = this.soldeCompteLivretA + depotArgentLivretA;
    }
    public void depotCompteEpargneLogement(double depotArgentEpargne){
        this.soldecompteEpargneLogement = this.soldecompteEpargneLogement + depotArgentEpargne;
    }
    public void retraitCompteClassique(double retraitArgentClassique) {
        if (soldeCompteClassique > retraitArgentClassique - 200){
            this.soldeCompteClassique = this.soldeCompteClassique - retraitArgentClassique;
        } else {
            System.out.println("Solde insuffisant");
        }
    }
    public void retraitCompteLivretA(double retraitArgentLivretA){
        if (soldeCompteLivretA > retraitArgentLivretA) {
            this.soldeCompteLivretA = this.soldeCompteLivretA - retraitArgentLivretA;
        } else {
            System.out.println("Solde insuffisant");
        }
    }
    public void retraitCompteEpargneLogement(double retraitArgentEpargne){
        if (soldecompteEpargneLogement > retraitArgentEpargne) {
            this.soldecompteEpargneLogement = this.soldecompteEpargneLogement - retraitArgentEpargne;
        } else{
            System.out.println("Solde insuffisant");
        }
    }
    public String demandeDeSoldeCompteClassique(){
        return "Le nom du compte est " + this.nom + ", l'id est le " + this.id + ", le solde est de : " + this.soldeCompteClassique + " € sur son " + this.typeDeCompte;
    }
    public String demandeDeSoldeCompteLivretA(){
        return "Le nom du compte est " + this.nom + ", l'id est le " + this.id + ", le solde est de : " + this.soldeCompteLivretA + " € sur son " + this.typeDeCompte;
    }
    public String demandeDeSoldeCompteEpargneLogement(){
        return "Le nom du compte est " + this.nom + ", l'id est le " + this.id + ", le solde est de : " + this.soldecompteEpargneLogement + " € sur son " + this.typeDeCompte;
    }
}
