/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_marti;

import java.util.Scanner;

/**
 *
 * @author alize
 */
public class TP1_convertisseur_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner(System.in);
System.out.println("veuillez entrer une premiere variable");
Double varC =sc.nextDouble();
System.out.print("Votre variable est "+varC);
Double varK = 0.0;
varK = varC + 273.15;
System.out.print("Votre temperature en degre kelvin est "+varK);

    }
    public static double CelciusversKelvin(double tCelcius) {
        return tCelsius + 273.15;  //Opération de conversion
    }
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15; //Temperature en celsius
    }     
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32)*5/9;
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius *9/5)+32;
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        return (tKelvin - 273.15)*9/5 +32;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        return (tFarenheit -32)*5/9 + 273.15;
    }
    
}
