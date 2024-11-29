/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_marti;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.Vector;

/**
 *
 * @author alize
 */
public class TP3_Heroic_Fantasy_MARTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Création de dexu épées
        Epee epee1 = new Epee("Excalibur",7, 5);
        //System.out.println(epee1); // Affiche Grâce à la methode ToString
        Epee epee2 = new Epee("Durandal",4, 7);
        //System.out.println(epee2); // Affiche Grâce à la methode ToString

        // Création de deux bâtons
        Baton baton1 = new Baton("Chêne", 4, 5);
        //System.out.println(baton1); // Affiche grâce à la methode ToString 
        Baton baton2 = new Baton("Charme", 5, 6);
        //System.out.println(baton2); // Affiche grâce à la methode ToString 
        
 Vector<Arme> armes = new Vector<>();

        // Ajout des objets au tableau dynamique
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des caractéristiques des armes
        System.out.println("Caracteristiques des armes :");
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.elementAt(i));
        }
    }
    
}
    

