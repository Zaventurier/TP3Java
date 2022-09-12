/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3Boucle;

/**
 *
 * @author pasca
 */
public class Exerice1Compteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //But de l'exercice : réaliser un compteur afin d'afficher tout les nombres pairs
        //compris entre 0 et 20
        for (int i = 0;i < 21;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
