/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_marti;

/**
 *
 * @author alize
 */
public class TP2_Bieres_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création d'une instance de BouteilleBiere
BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson") ;
uneBiere.lireEtiquette();
uneBiere.decapsuler();
System.out.println(uneBiere) ;
BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe");
secondeBiere.lireEtiquette();
secondeBiere.decapsuler();
BouteilleBiere troisBiere = new BouteilleBiere("Heineken",5.0 , "Schiltigheim ");
troisBiere.lireEtiquette();
troisBiere.decapsuler();
BouteilleBiere quatreBiere = new BouteilleBiere("Kronenbourg", 5.3 , "Obernai ");
quatreBiere.lireEtiquette();
quatreBiere.decapsuler();

}
}