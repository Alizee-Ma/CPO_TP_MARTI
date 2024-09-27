/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_marti;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alize
 */
public class TP1_guessMyNumber_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreATrouver = 0, maxTentatives = Integer.MAX_VALUE, tentatives = 0;
        boolean limiteTentatives = false;
        
        // Demande à l'utilisateur de choisir un niveau de difficulté
        System.out.println("Choisissez un niveau de difficulte : ");
        System.out.println("1. Facile");
        System.out.println("2. Normal");
        System.out.println("3. Difficile");
        int choix = scanner.nextInt();
        
        // Configuration selon le niveau de difficulté choisi
        switch (choix) {
            case 1:
                nombreATrouver = random.nextInt(101);  // Nombre aléatoire entre 0 et 100
                System.out.println("Mode Facile : Devinez un nombre entre 0 et 100.");
                break;
            case 2:
                nombreATrouver = random.nextInt(101);  // Nombre aléatoire entre 0 et 100
                maxTentatives = 20;
                limiteTentatives = true;
                System.out.println("Mode Normal : Devinez un nombre entre 0 et 100. Vous avez 20 tentatives.");
                break;
            case 3:
                nombreATrouver = random.nextInt(1001); // Nombre aléatoire entre 0 et 1000
                maxTentatives = 10;  // Limite à 10 tentatives
                limiteTentatives = true;
                System.out.println("Mode Difficile : Devinez un nombre entre 0 et 1000. Vous avez 10 tentatives.");
                break;
            default:
                System.out.println("Choix invalide, le programme va s'arrêter.");
                return;  // Arrêter le programme si le choix est incorrect
        }

        int nombreSaisi = -1;

        // Boucle while jusqu'à ce que l'utilisateur trouve le bon nombre ou dépasse la limite
        while (nombreSaisi != nombreATrouver && (!limiteTentatives || tentatives < maxTentatives)) {
            System.out.print("Saisissez un nombre : ");
            nombreSaisi = scanner.nextInt();
            tentatives++;  // Incrémentation du compteur

            // Comparaison des nombres et gestion des messages selon la difficulté
            if (nombreSaisi < nombreATrouver) {
                if (choix == 1 && (nombreATrouver - nombreSaisi) > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit");
                }
            } else if (nombreSaisi > nombreATrouver) {
                if (choix == 1 && (nombreSaisi - nombreATrouver) > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand");
                }
            } else {
                System.out.println("Gagné !");
                System.out.println("Vous avez trouvé le nombre en " + tentatives + " tentative(s).");
            }

            // Vérification de la limite de tentatives pour le mode difficile
            if (limiteTentatives && tentatives >= maxTentatives && nombreSaisi != nombreATrouver) {
                System.out.println("Vous avez dépassé la limite de tentatives. Le nombre était " + nombreATrouver + ".");
                break;
            }
        }

        scanner.close();
    }
}

    

    
    

