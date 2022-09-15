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
public class Exerice5Table1to9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i<=9;i++){
            for(int j = 1; j<=9;j++){
                int resultat = j*i;
                System.out.println(i +" * " +j + " = " +resultat);
            }
        }
    }
    
}
