/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marti;

/**
 *
 * @author alize
 */
public class Epee extends Arme {
    private int indiceFinesse; 

    // Constructeur pour initialiser tous les paramètres
    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque);
        if (indiceFinesse > 100 || indiceFinesse < 0) {
            throw new IllegalArgumentException("L'indice de finesse doit être compris entre 0 et 100.");
        }
        this.indiceFinesse = indiceFinesse;
    }

    // Methode pour obtenir l'indice de finesse
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    // Methode pour pouvoir inclure l'indice de finesse dans le ToString de arme
    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse: " + indiceFinesse;
    }
}


