/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_marti;

/**
 *
 * @author alize
 */
public class Convertisseur {
    // Attribut pour compter le nombre de conversions effectuées
    private int nbConversions;

    // Constructeur par défaut
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode pour convertir Celsius en Kelvin
    public float CelciusVersKelvin(float celcius) {
        nbConversions++;
        return celcius + 273.15f;
    }

    // Méthode pour convertir Kelvin en Celsius
    public float KelvinVersCelcius(float kelvin) {
        nbConversions++;
        return kelvin - 273.15f;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public float FarenheitVersCelcius(float fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public float CelciusVersFarenheit(float celcius) {
        nbConversions++;
        return (celcius * 9 / 5) + 32;
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public float FarenheitVersKelvin(float fahrenheit) {
        nbConversions++;
        float celcius = FarenheitVersCelcius(fahrenheit);
        return CelciusVersKelvin(celcius);
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public float KelvinVersFarenheit(float kelvin) {
        nbConversions++;
        float celcius = KelvinVersCelcius(kelvin);
        return CelciusVersFarenheit(celcius);
    }

    // Redéfinition de toString() pour fournir une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "Nombre total de conversions effectuées : " + nbConversions;
    }
}
   

