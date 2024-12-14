/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author alize
 */
public class Epee extends Arme {
private int indiceFinesse; // Indice de finesse, compris entre 0 et 100

    // Constructeur pour initialiser tous les paramètres
    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque); // Appelle le constructeur de la classe mère
        if (indiceFinesse < 0 || indiceFinesse > 100) {
            throw new IllegalArgumentException("L'indice de finesse doit être compris entre 0 et 100.");
        }
        this.indiceFinesse = indiceFinesse;
    }

    // Getter pour l'indice de finesse
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    // Setter pour l'indice de finesse avec validation
    public void setIndiceFinesse(int indiceFinesse) {
        if (indiceFinesse < 0 || indiceFinesse > 100) {
            throw new IllegalArgumentException("L'indice de finesse doit être compris entre 0 et 100.");
        }
        this.indiceFinesse = indiceFinesse;
    }

    // Redéfinition de la méthode toString pour inclure l'indice de finesse
    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse: " + indiceFinesse;
    }
}


