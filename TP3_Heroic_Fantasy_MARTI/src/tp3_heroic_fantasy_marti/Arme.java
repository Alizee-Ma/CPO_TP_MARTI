/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marti;

/**
 *
 * @author alize
 */
public class Arme {
    private String nom;
    private int niveauAttaque; 

    // Constructeur qui permet initialiser les paramètres
    public Arme(String nom, int niveauAttaque) {
        if (niveauAttaque > 100 || niveauAttaque < 0) {
            throw new IllegalArgumentException("Le niveau d'attaque doit être compris entre 0 et 100.");
        }
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    // Methode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Methode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Méthode toString pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}

