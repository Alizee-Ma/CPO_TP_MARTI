/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Personnage.Personnage;

/**
 *
 * @author alize
 */
    public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveau, boolean confirme) {
        super(nom, niveau);
        this.confirme = confirme;
        Personnage.totalMagiciens++;
         Personnage.incrementerMagiciens();
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Magicien{" +
               "nom='" + getNom() + '\'' +
               ", niveau=" + getNiveau() +
               ", confirmé=" + (confirme ? "oui" : "non") +
               ", armeEnMain=" + (getArmeEnMain() != null ? getArmeEnMain().toString() : "Aucune") +
               '}';
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            // Décrémente le compteur des magiciens
            Personnage.incrementerMagiciens();
        } finally {
            super.finalize();
        }
    }
}



