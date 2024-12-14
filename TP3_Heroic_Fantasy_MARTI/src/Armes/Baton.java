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
public class Baton extends Arme {
   private int age; // Âge du bâton, doit être compris entre 0 et 100 ans

    /**
     * Constructeur pour initialiser les paramètres du bâton.
     * 
     * @param nom          Nom du bâton.
     * @param niveauAttaque Niveau d'attaque du bâton.
     * @param age          Âge du bâton (doit être compris entre 0 et 100 ans).
     */
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); //probleme avec cette instruction partout 
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("L'âge du bâton doit être compris entre 0 et 100.");
        }
        this.age = age;
    }

    /**
     * Getter pour obtenir l'âge du bâton.
     * 
     * @return L'âge du bâton.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter pour modifier l'âge du bâton avec validation.
     * 
     * @param age Nouvel âge du bâton (doit être compris entre 0 et 100 ans).
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("L'âge du bâton doit être compris entre 0 et 100.");
        }
        this.age = age;
    }

    /**
     * Redéfinition de la méthode toString pour inclure l'âge du bâton.
     * 
     * @return Une chaîne de caractères décrivant le bâton.
     */
    @Override
    public String toString() {
        return super.toString() + ", Âge du bâton: " + age;
    }
}


