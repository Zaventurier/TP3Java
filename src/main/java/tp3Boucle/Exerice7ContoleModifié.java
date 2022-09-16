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
public class Exerice7ContoleModifié {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char reponse = 'n';
        while(reponse == 'n' || reponse == 'N'){
            System.out.println("Voulez vous interrompre ? (o/n)");
            reponse = sc.next().charAt(0);
        }
        System.out.println("suite...");
    }
    
}
