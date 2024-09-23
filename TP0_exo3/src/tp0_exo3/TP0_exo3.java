/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo3;

import java.util.Scanner;

/**
 *
 * @author alize
 */
public class TP0_exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Affichage des différents opérateurs
System.out.println("Please enter the operator:");
System.out.println("1) add");
System.out.println("2) substract");
System.out.println("3) multiply");
System.out.println("4) divide");
System.out.println("5) modulo");

//Récupération de l'opérateur voulu
Scanner sc = new Scanner(System.in);
int operateur =sc.nextInt();
System.out.println("Veuillez choisir votre opérateur" +operateur);
//Demande de la première opérande
System.out.println("Veuillez entrer la première valeur");
double operande1 = sc.nextDouble(); //Stockage de la première valeur
//Demande de la deuxième opérande
System.out.println("Veuillez saisir la dexuième valeur");
double operande2 = sc.nextDouble();

            }
    
}
