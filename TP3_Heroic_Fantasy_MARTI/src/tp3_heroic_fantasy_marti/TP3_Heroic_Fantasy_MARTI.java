/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_marti;

import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
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
       
        // Création des personnages
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);
        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        // Création des armes
        Arme batonFeu = new Arme("Bâton de Feu", "bâton", 50);
        Arme batonGlace = new Arme("Bâton de Glace", "bâton", 45);
        Arme epeeLongue = new Arme("Épée Longue", "épée", 60);
        Arme lance = new Arme("Lance", "lance", 55);

        // Ajout des armes à Gandalf
        gandalf.ajouterArme(batonFeu);
        gandalf.ajouterArme(batonGlace);

        // Ajout des armes à Conan
        conan.ajouterArme(epeeLongue);
        conan.ajouterArme(lance);

        // Équiper des armes
        gandalf.equiperArme("Bâton de Feu");
        conan.equiperArme("Lance");

        // Affichage des personnages
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        for (Personnage p : personnages) {
            System.out.println(p);
        }

        // Challenge : compter les armes par type
        System.out.println("Gandalf possède " + gandalf.compterArmesParType("bâton") + " bâtons.");
    }
}

    

