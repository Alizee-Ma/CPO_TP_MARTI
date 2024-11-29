/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marti;

/**
 *
 * @author alize
 */

public class Guerrier extends Personnage {
    private boolean aCheval; // Indique si le guerrier est à cheval ou non

    // Constructeur pour initialiser les paramètres
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    // Methode pour savoir si le guerrier est à cheval
    public boolean isACheval() {
        return aCheval;
    }

    // modifier "l'état à cheval"
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    //inclure si le guerrier est à cheval ou a pied 
    @Override
    public String toString() {
        return super.toString() + ", À cheval: " + (aCheval ? "Oui" : "Non");
    }
}

    

