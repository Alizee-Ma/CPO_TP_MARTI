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
float CelcuisVersKelvin;
float KelvinVersCelcuis;
float FarenheintVersCelcuis;
float CelcuisversFareinheit;
float FarenheitVersKelvin;
float KelvinVersFarenheit;
int nbConversions;

public Convertisseur () {
nbConversions = 0 ;
}

@Override
public String toString () {
return "nb de conversions"+ nbConversions;
}
}
