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
import tp3_heroic_fantasy_marti.etreVivant;

public abstract  class Personnage implements etreVivant{
 private String nom;
    private int niveau;
    private ArrayList<Arme> armes; // Liste dynamique pour les armes
    private Arme armeEnMain; // Arme actuellement équipée
    private int pointsDeVie;
    

    // Attributs statiques pour suivre les statistiques globales
    private static int totalPersonnages = 0;
    static int totalGuerriers = 0;
    private static int totalMagiciens = 0;
    
   
    public Personnage(String nom, int niveau, int pointsDeVie) {
        this.nom = nom;
        this.niveau = niveau;
        this.armes = new ArrayList<>();
        this.armeEnMain = null;
        this.pointsDeVie = pointsDeVie;

        // Incrémente le compteur total des personnages
        totalPersonnages++;
    }
    
    @Override
 public void seFatiguer(){
        this.pointsDeVie -=10;
        System.out.println(nom+ " se fatigue et perd 1à points de vie.");
    }
 
@Override
    public boolean estVivant() {
        return this.pointsDeVie > 0; // Si les points de vie sont positifs, le personnage est vivant
    }
    
 @Override
    public void estAttaque(int points) {
        this.pointsDeVie -= points; // Le personnage perd des points de vie suite à l'attaque
        System.out.println(nom + " a été attaqué et perd " + points + " points de vie.");
    }

    // Méthode finalize pour décrémenter les compteurs lors de la destruction de l'objet

    /**public void seFatiguer(){
        this.pointsDeVie -=10;
        System.out.println(nom+ " se fatigue et perd 1à points de vie.");
    }
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        try {
            // Décrémente le compteur total des personnages
            totalPersonnages--;

            // Si le personnage est un guerrier ou un magicien, décrémente également
            if (this instanceof Guerrier) {
                totalGuerriers--;
            } else if (this instanceof Magicien) {
                totalMagiciens--;
            }
        } finally {
            super.finalize(); // Assure que la méthode finalize de la classe parente est appelée
        }
    }

    // Méthode statique pour afficher les statistiques globales
    public static void afficherStatistiques() {
        System.out.println("Total des personnages : " + totalPersonnages);
        System.out.println("Total des guerriers : " + totalGuerriers);
        System.out.println("Total des magiciens : " + totalMagiciens);
    }

    // Getters et setters pour nom et niveau
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

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Personnage{" +
               "nom='" + nom + '\'' +
               ", niveau=" + niveau +
               ", armeEnMain=" + (armeEnMain != null ? armeEnMain.toString() : "Aucune") +
               '}';
    }

}

