/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3Boucle;
import java.util.Scanner;

/**
 *
 * @author pasca
 */
public class Exercice6ContrôleSaisie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char reponse = 'o';
        while (reponse == 'o'){
            System.out.println("Voulez vous continuer ? (o/n)");
            reponse = sc.next().charAt(0);
        }
    }
    
}
