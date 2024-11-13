/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_marti;

/**
 *
 * @author alize
 */
public class Voiture {
String modele;
String marque;
int puissanceCv;
Personne proprietaire;

public Voiture(String modele, String marque, int puissanceCv){
    this.modele = modele;
    this.marque = marque;
    this.puissanceCv = puissanceCv;
    this.proprietaire = null; //initalisation du proprietaire a null
}

//definir le propriétaire
public void setProprietaire(Personne proprietaire) {
    this.proprietaire = proprietaire;
}

@Override
public String toString() {
    String infoProprietaire = (proprietaire != null) ? "Proprietaire : "+proprietaire.prenom+""+proprietaire.nom+ : "Pas de proprietaire";
    return "modèle : "+modele+" , marque : "+marque+", puissance : "+puissanceCv+ " CV, "+infoProprietaire;
}

}