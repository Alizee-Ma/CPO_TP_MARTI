/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_marti;

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
        Convertisseur convertisseur = new Convertisseur();
        
        System.out.println("25°C en Celsuis : "+ convertisseur.CelciusVersKelvin(25)+ " Kelvin");
        System.out.println("200K en Kelvin : "+ convertisseur.KelvinVersCelcius(200) + " Celcuis");
         System.out.println("120°F en Farenheit : " + convertisseur.FarenheitVersCelcius(120)+ " Celcius");
        System.out.println("0°C en Celcius : " + convertisseur.CelciusVersFarenheit(0)+ " Farenheit");
        System.out.println("89°F en Farenheit : " + convertisseur.FarenheitVersKelvin(89)+" Celcius");
        System.out.println("345.16K en Kelvin : " + convertisseur.KelvinVersFarenheit(345.16f)+ " Farenheit");
        
// Affichage du nombre total de conversions
        System.out.println(convertisseur);
    }
    
}
