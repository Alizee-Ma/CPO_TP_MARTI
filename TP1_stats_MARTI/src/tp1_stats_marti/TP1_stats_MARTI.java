/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_marti;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alize
 */
public class TP1_stats_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 // Création du tableau de 6 entiers (chaque case représente une face du dé)
// Création du tableau de 6 entiers (chaque case représente une face du dé)
        int[] faceDes = new int[6]; // Initialisation à 0 par défaut
        System.out.println("État initial du tableau des dés :");
        for (int i = 0; i < faceDes.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + faceDes[i]);
        }

        // Demande à l'utilisateur de saisir un nombre entier m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        // Générateur de nombres aléatoires
        Random random = new Random();

        // Boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tirer un nombre aléatoire entre 0 et 5 (représentant les faces d'un dé)
            int resultatDe = random.nextInt(6); // 0 à 5
            // Incrémenter la case correspondante
            faceDes[resultatDe]++;
        }

        // Affichage du tableau résultat
        System.out.println("\nRésultat après " + m + " itérations :");
        for (int i = 0; i < faceDes.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + faceDes[i] +".");
        }
        System.out.println("Resultat en pourcentage");
        for (int i=0; i < faceDes.length; i++) {
        double pourcentage = (((double)faceDes[i]/m)*100);
        System.out.println("Face " + (i + 1) + ": " + pourcentage +"%");
        }

        // Fermeture du scanner
        scanner.close();
    }
}