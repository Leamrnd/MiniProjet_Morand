/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EPF
 */
import java.util.Random;

public class GrilleDeJeu {
    
    Case[][] grille = new Case[3][3];
    
    
    public void allumerCaseAlea() {
         int l = new Random().nextInt(2);
         int c = new Random().nextInt(2);
         System.out.println(l );
         System.out.println(c );
         grille[l][c].allumerCase();
    }
    
}
