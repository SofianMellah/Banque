package com.afpa.www.main;

import com.afpa.www.bean.Compte;

public class Main {
    public static void main(String[] args) {

        // la méthode static sert à ne pas être obligé d'instancier un objet pour l'utiliser

        Compte compteDeFatima1 = new Compte("compte classique", "Fatima", 87, 0, 0, 0);
        Compte compteDeFatima2 = new Compte("compte livret A", "Fatima", 87, 0, 0, 0);
        Compte compteDeFatima3 = new Compte("compte épargne logement", "Fatima", 87, 0, 0, 0);
        Compte compteDeNesrine1 = new Compte("compte classique ","Nesrine", 14, 0, 0, 0);
        Compte compteDeNesrine2 = new Compte("compte livret A ","Nesrine", 14, 0, 0, 0);
        Compte compteDeNesrine3 = new Compte("compte épargne logement ","Nesrine", 14, 0, 0, 0);


        String renseignement1 = compteDeFatima1.demandeDeSoldeCompteClassique();
        System.out.println(renseignement1);
        String renseignement2 = compteDeFatima2.demandeDeSoldeCompteLivretA();
        System.out.println(renseignement2);
        String renseignement3 = compteDeFatima3.demandeDeSoldeCompteEpargneLogement();
        System.out.println(renseignement3);

        compteDeFatima1.depotCompteClassique(6500);
        System.out.println(compteDeFatima1.getSoldeCompteClassique());

        compteDeFatima2.depotCompteLivretA(780);
        System.out.println(compteDeFatima2.getSoldeCompteLivretA());

        compteDeFatima3.depotCompteEpargneLogement(450);
        System.out.println(compteDeFatima3.getSoldecompteEpargneLogement());

        System.out.println(compteDeFatima1.demandeDeSoldeCompteClassique());
        System.out.println(compteDeFatima2.demandeDeSoldeCompteLivretA());
        System.out.println(compteDeFatima3.demandeDeSoldeCompteEpargneLogement());

        compteDeFatima1.retraitCompteClassique(4512);
        System.out.println(compteDeFatima1.getSoldeCompteClassique());

        compteDeFatima2.retraitCompteLivretA(240);
        System.out.println(compteDeFatima2.getSoldeCompteLivretA());

        compteDeFatima3.retraitCompteEpargneLogement(650);
        System.out.println(compteDeFatima3.getSoldecompteEpargneLogement());

        System.out.println(compteDeFatima1.demandeDeSoldeCompteClassique());
        System.out.println(compteDeFatima2.demandeDeSoldeCompteLivretA());
        System.out.println(compteDeFatima3.demandeDeSoldeCompteEpargneLogement());

        compteDeFatima1.retraitCompteClassique(2000);
        System.out.println(compteDeFatima1.demandeDeSoldeCompteClassique());

        compteDeNesrine1.depotCompteClassique(50000);
        compteDeFatima1.depotCompteClassique(450);
        System.out.println(compteDeNesrine1.demandeDeSoldeCompteClassique());
        System.out.println(compteDeFatima1.demandeDeSoldeCompteClassique());
    }
}