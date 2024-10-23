/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_marti;

import java.util.Scanner;

/**
 *
 * @author alize
 */
public class TP2_convertisseurObjet_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();
        boolean continuer = true;

        while (continuer) {
            // Affichage du menu
            System.out.println("\n===== Menu de Conversion de Températures =====");
            System.out.println("1. Convertir Celsius en Kelvin");
            System.out.println("2. Convertir Kelvin en Celsius");
            System.out.println("3. Convertir Fahrenheit en Celsius");
            System.out.println("4. Convertir Celsius en Fahrenheit");
            System.out.println("5. Convertir Fahrenheit en Kelvin");
            System.out.println("6. Convertir Kelvin en Fahrenheit");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            float valeur, resultat;

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = scanner.nextFloat();
                    resultat = convertisseur.CelciusVersKelvin(valeur);
                    System.out.println(valeur + "°C = " + resultat + "K");
                    break;

                case 2:
                    System.out.print("Entrez la température en Kelvin : ");
                    valeur = scanner.nextFloat();
                    resultat = convertisseur.KelvinVersCelcius(valeur);
                    System.out.println(valeur + "K = " + resultat + "°C");
                    break;

                case 3:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    resultat = convertisseur.FarenheitVersCelcius(valeur);
                    System.out.println(valeur + "°F = " + resultat + "°C");
                    break;

                case 4:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = scanner.nextFloat();
                    resultat = convertisseur.CelciusVersFarenheit(valeur);
                    System.out.println(valeur + "°C = " + resultat + "°F");
                    break;

                case 5:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    resultat = convertisseur.FarenheitVersKelvin(valeur);
                    System.out.println(valeur + "°F = " + resultat + "K");
                    break;

                case 6:
                    System.out.print("Entrez la température en Kelvin : ");
                    valeur = scanner.nextFloat();
                    resultat = convertisseur.KelvinVersFarenheit(valeur);
                    System.out.println(valeur + "K = " + resultat + "°F");
                    break;

                case 7:
                    continuer = false;
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }

            // Affichage du nombre total de conversions effectuées
            if (choix != 7) {
                System.out.println(convertisseur);
            }
        }

        System.out.println("Merci d'avoir utilisé le convertisseur !");
        scanner.close();
    }
}