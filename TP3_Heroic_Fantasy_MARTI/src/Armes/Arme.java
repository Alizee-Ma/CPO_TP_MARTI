/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author alize
 */
public abstract  class Arme {
    private String nom;
    private String type; // Exemple : "épée", "bâton", etc.
    private int puissance;

    public Arme(String nom, String type, int puissance) {
        this.nom = nom;
        this.type = type;
        this.puissance = puissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return "Arme{" +
               "nom='" + nom + '\'' +
               ", type='" + type + '\'' +
               ", puissance=" + puissance +
               '}';
    }
}



