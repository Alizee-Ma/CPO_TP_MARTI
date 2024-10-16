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
    double degreAlcool;
    String brasserie;
    boolean ouverte;
 BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
}
public void lireEtiquette(){
    System.out.println("Bouteille de " + nom +" ( " + degreAlcool +" degres ) \nBrasserie : " + brasserie);
}
public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println(nom + " est maintenant ouverte.");
            return true;
        } else {
            System.out.println("Erreur : " + nom + " est déjà ouverte.");
            return false;
        }
    }
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}

