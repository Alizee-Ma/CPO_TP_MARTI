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
    private final ArrayList<Arme> armes; // Tableau dynamique pour les armes
    private Arme armeEnMain; // Arme actuellement équipée

    // Attributs statiques pour suivre les statistiques globales
    private static int totalPersonnages = 0;
    static int totalGuerriers = 0;
    static int totalMagiciens = 0;

    public Personnage(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
        this.armes = new ArrayList<>();
        this.armeEnMain = null;

        // Incrémente le compteur total des personnages
        totalPersonnages++;
    }

    // Getters et setters
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

    // Nombre d'armes d'un type spécifique
    public int compterArmesParType(String type) {
        int count = 0;
        for (Arme arme : armes) {
            if (arme.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    // Méthode statique pour afficher les statistiques globales
    public static void afficherStatistiques() {
        System.out.println("Total des personnages : " + totalPersonnages);
        System.out.println("Total des guerriers : " + totalGuerriers);
        System.out.println("Total des magiciens : " + totalMagiciens);
    }

    // Méthodes statiques pour gérer les statistiques spécifiques
    public static void incrementerGuerriers() {
        totalGuerriers++;
    }

    public static void incrementerMagiciens() {
        totalMagiciens++;
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

