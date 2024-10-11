/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_marti;

/**
 *
 * @author alize
 */
public class BouteilleBiere{
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
 BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
}
public void lireEtiquette(){
    System.out.println("Bouteille de " + nom +"(" + degreAlcool +"degres) \nBrasserie :" + brasserie);
}
public static void main(String[] args) {
        // Création d'une instance de BouteilleBiere
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0f ,"Dubuisson") ;
BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6.6f,"Abbaye de Leffe");
BouteilleBiere troisBiere = new BouteilleBiere("Heineken",5.0f, "Schiltigheim ");
BouteilleBiere quatreBiere = new BouteilleBiere("")
}
}

