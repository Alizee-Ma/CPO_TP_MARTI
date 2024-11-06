/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_marti;

/**
 *
 * @author alize
 */
public class TP2_manip_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Tartiflette assiette1 = new Tartiflette(500);
Tartiflette assiette2 = new Tartiflette(600);
Tartiflette assiette3 = assiette2;
System.out.println("Nombres de calories dans l'assiette 1 : " + assiette1.nbCalories);
System.out.println("Nombres de calories dans l'assiette 2 : " + assiette2.nbCalories);
System.out.println("Nombres de calories dans l'assiette 3 : " +assiette3.nbCalories);
Tartiflette nouvelleassiette = assiette1;
assiette1 = assiette2;
assiette2 = nouvelleassiette;
    }   
}
