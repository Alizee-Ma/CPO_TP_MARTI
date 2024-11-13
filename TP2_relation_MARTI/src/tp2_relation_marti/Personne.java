/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_marti;

/**
 *
 * @author alize
 */
public class Personne {
String nom;
String prenom;
Voiture[] liste_voitures;
int nbVoitures;

    public Personne(String nom, String prenom, Voiture[] liste_voitures, int nbVoitures) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3];
        this.nbVoitures = 0;
      
    }
public boolean ajouter_voiture(Voiture voiture_a_ajouter){
    //si la voiture est volé on ne l'ajoute pas
    if(voiture_a_ajouter.proprietaire !=null) {
        System.out.println("la voiture "+voiture_a_ajouter.modele+" est déja possédée.");
        return false;
        }
    if (nbVoitures >=3){
        System.out.println("Impossible d'ajouter une nouvelle voiture, "+prenom+ " "+nom+" possède déja 3 voitures.");
        return false;
    }
    liste_voitures[nbVoitures]=voitures_a_ajouter;
    nbVoitures++;
    
    voiture_a_ajouter.proprietaire = this;
    System.out.println("La voiture " +voiture_a_ajouter.modele+ " a été ajoutée à " +prenom+ " " +nom+);
   return true; 
}
@Override
public String toString() {
    String infoVoitures = (nbVoitures == 0) ? "Aucune voiture " : "Possède "+nbVoitures+ " voiture(s)";
    return "Nom : "+nom+", Prenom :"+prenom+", "+infoVoitures;
}
}