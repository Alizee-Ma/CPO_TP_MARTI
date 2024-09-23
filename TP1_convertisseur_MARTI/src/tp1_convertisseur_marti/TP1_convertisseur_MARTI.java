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
System.out.println("Veuillez choisir une convertion de temperature");
System.out.println("1) Celsius vers Kelvin");
System.out.println("2) Kelvin vers Celsius");
System.out.println("3) Farenheit vers Celcius");
System.out.println("4) Celsius vers Fahrenheit");
System.out.println("5) Kelvin vers Farenheit");
System.out.println("6) farenheit vers Kelvin");
int choix = sc.nextInt();
double temperature = 0;
switch (choix){
    case 1:
                // Celsius vers Kelvin
                temperature = varC;
                double Kelvin = CelciusversKelvin(temperature);
                System.out.println(temperature + " Celsius equivaut a " + Kelvin + " Kelvin.");
                break;
    case 2:
                //Kelvin vers celcius
                temperature = varC;
                double Celcius = KelvinVersCelcius(temperature);
                System.out.println(temperature + " Kelvin equivaut a " + Celcius + " Celcius.");
                break;
    case 3:
               //Farenheit vers Celcius
               temperature = varC;
               double Celcius2 = FarenheitVersCelcius(temperature);
               System.out.println(temperature +"Farenheit equivaut a " +Celcius2 + " Celcius.");
               break;
    case 4:
               //Celcius vers Farenheit
               temperature = varC;
               double Farenheit2 = CelciusVersFarenheit(temperature);
               System.out.println(temperature + "Celcius equivaut a " +Farenheit2+ " Farenheit.");
               break;
    case 5:
               //Kelvin Vers Farenheit
               temperature = varC;
               double Farenheit = KelvinVersFarenheit(temperature);
               System.out.println(temperature+ " Kelvin equivaut a " +Farenheit+ " Farhenheit.");
               break;
    case 6:
               //Farenheit Vers Kelvin
               temperature = varC;
               double Kelvin1 = FarenheitVersKelvin(temperature);
               System.out.println(temperature+ " Farenheit equivaut a " +Kelvin1+ " Kelvin.");
}
    }
    public static double CelciusversKelvin(double tCelcius) {
        return tCelcius + 273.15;  //Opération de conversion
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
