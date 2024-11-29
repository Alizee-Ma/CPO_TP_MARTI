/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marti;

/**
 *
 * @author alize
 */
public abstract  class Personnage {
    private String nom;
    private int niveauVie;

    public Personnage(String nom, int niveauVie) {
         if (niveauVie < 0) {
            throw new IllegalArgumentException("Le niveau de vie ne peut pas être négatif.");
        }
        this.nom = nom;
        this.niveauVie = niveauVie;
    }
    public int getniveauVie(){
        return niveauVie;
    }
      public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom : " + nom + ", Niveau de vie : " + niveauVie + '}';
    }
    
}
