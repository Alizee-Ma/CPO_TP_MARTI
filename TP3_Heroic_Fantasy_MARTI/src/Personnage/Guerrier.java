/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author alize
 */

public class Guerrier extends Personnage {
    private boolean aCheval; // Indique si le guerrier est à cheval

    public Guerrier(String nom, int niveau, boolean aCheval) {
        super(nom, niveau);
        this.aCheval = aCheval;
        Personnage.totalGuerriers++;
         Personnage.incrementerGuerriers();
    }

    public boolean isaCheval() {
        return aCheval;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return "Guerrier{" +
               "nom='" + getNom() + '\'' +
               ", niveau=" + getNiveau() +
               ", à cheval=" + (aCheval ? "oui" : "non") +
               ", armeEnMain=" + (getArmeEnMain() != null ? getArmeEnMain().toString() : "Aucune") +
               '}';
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            // Décrémente le compteur des guerriers
            Personnage.incrementerGuerriers();
        } finally {
            super.finalize();
        }
    }

    public void equiperArme(String lance) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    

