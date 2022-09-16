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
public class Exercice8Moyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note;
        int reponse = 0;
        int total = 0;
        int i = 0;
        while(reponse>=0){
            System.out.println("Saisir une note ou -1 pour quitter :");
            reponse = sc.nextInt();
            note = reponse;
            total = total+note;
            i++;
        }
        total = total/i;
        System.out.println("La moyenne est de : " + total);
    }
    
}
