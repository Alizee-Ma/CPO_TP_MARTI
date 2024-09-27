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
        int[] des = new int[6]; // Initialisation à 0 par défaut

        // Demande à l'utilisateur de saisir un nombre entier m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier m (nombre d'itérations) : ");
        int m = scanner.nextInt();

        // Générateur de nombres aléatoires
        Random random = new Random();

        // Boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tirer un nombre aléatoire entre 0 et 5 (représentant les faces d'un dé)
            int resultatDe = random.nextInt(6); // 0 à 5
            // Incrémenter la case correspondante
            des[resultatDe]++;
        }

        // Affichage du tableau résultat
        System.out.println("\nRésultat après " + m + " itérations :");
        for (int i = 0; i < des.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + des[i] + " occurrence(s)");
        }

        // Fermeture du scanner
        scanner.close();
    }
}
