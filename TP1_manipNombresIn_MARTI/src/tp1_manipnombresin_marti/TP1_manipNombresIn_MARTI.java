/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresin_marti;

import java.util.Scanner;

/**
 *
 * @author alize
 */
public class TP1_manipNombresIn_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner(System.in);
System.out.println("veuillez entrer une premiere variable");
int var1 =sc.nextInt();
System.out.println("Veuillez rentrer une dexuieme variable");
int var2 = sc.nextInt();
System.out.println("Votre premiere variable est "+var1 +" et votre deuxieme varibale est "+var2);
int somme = 0;
int sous = 0;
int produit = 0;
somme = var1 +var2;
sous = var1 - var2;
produit = var1*var2;
System.out.println("La somme des deux  variables vaut "+somme);
System.out.println("La soustraction des deux variables vaut "+sous);
System.out.println("Le produit des deux variables vaut "+produit);
int quotiententier = 0;
int reste = 0;
quotiententier = var1/var2;
System.out.println ("Le quotien entier des deux variables est "+quotiententier);
reste = var1%var2;
System.out.println("Le reste de la division des deux variables est "+reste);

    }
    
}
