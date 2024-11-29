/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marti;

/**
 *
 * @author alize
 */
public class Baton extends Arme {
    private int age; 

    // Constructeur pour initialiser tous les paramètres
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); //permet d'appeler le constructeur de la classe parente
        if (age > 100 || age < 0) {
            throw new IllegalArgumentException("L'âge du bâton doit être compris entre 0 et 100.");
            //Interrompt le code car l'age du baton n'est pas valide, il doit etre compris entre 0 et 100 ans
        }
        this.age = age;
    }

    // Methode pour obtenir l'âge
    public int getAge() {
        return age;
    }

    // Methode pour inclure l'âge dans le ToString de la classe arme
    @Override
    public String toString() {
        return super.toString() + ", Âge du bâton: " + age;
    }
}


