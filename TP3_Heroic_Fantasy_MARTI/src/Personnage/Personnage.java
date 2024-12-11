/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author alize
 */
  import java.util.ArrayList;
import Armes.Arme;
public abstract  class Personnage {
    private String nom;
    private int niveau;
    private ArrayList<Arme> armes; // Tableau dynamique pour les armes
    private Arme armeEnMain; // Arme actuellement équipée

    public Personnage(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
        this.armes = new ArrayList<>();
        this.armeEnMain = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    // Ajouter une arme au tableau dynamique
    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println("Arme ajoutée : " + arme.getNom());
        } else {
            System.out.println("Inventaire plein ! Impossible d'ajouter l'arme : " + arme.getNom());
        }
    }

    // Équiper une arme en fonction de son nom
    public void equiperArme(String nomArme) {
        for (Arme arme : armes) {
            if (arme.getNom().equalsIgnoreCase(nomArme)) {
                this.armeEnMain = arme;
                System.out.println("Arme équipée : " + arme.getNom());
                return;
            }
        }
        System.out.println("Arme non trouvée dans l'inventaire : " + nomArme);
    }

    // Nombre d'armes d'un type spécifique (Challenge)
    public int compterArmesParType(String type) {
        int count = 0;
        for (Arme arme : armes) {
            if (arme.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Personnage{" +
               "nom='" + nom + '\'' +
               ", niveau=" + niveau +
               ", armeEnMain=" + (armeEnMain != null ? armeEnMain.toString() : "Aucune") +
               '}';
    }
}

