/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfusionsanguine;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author lenovo
 */
public class NewClass {
     public static void main(String[] args) {
        // Récupérer l'environnement graphique
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // Obtenir la liste des noms de polices
        String[] fontNames = ge.getAvailableFontFamilyNames();

        // Afficher la liste des polices
        System.out.println("Polices disponibles :");
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
    
}


