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
public class Exercice3BouclesImbriqués {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Saisir un nombre :");
        
        int i;
        int j;
        
        for(i=1;i<=5;i++){
            for(j=0;j<i;j++){
                System.out.printf("*");
            }
        }
    }
    
}
