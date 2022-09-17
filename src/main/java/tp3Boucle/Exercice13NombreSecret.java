package tp3Boucle;

import java.util.Random;
import java.util.Scanner;

public class Exercice13NombreSecret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = new Random().nextInt(100);
        int choix = 0;
        int i = 10;
        while(i != 0){
            System.out.println("Choisir un nombre entre 1 et 100:");
            choix = sc.nextInt();
            if(choix == secret) {
                System.out.println("Gagné :)");
                break;
            }else{
                if(choix<secret){
                    System.out.println("Trop petit");
                }else{
                    System.out.println("Trop grand");
                }
                System.out.println("il reste " + i + "tentatives");
            }
        }
        System.out.println("Perdu ! Le nombre était : " + secret);
    }
}
