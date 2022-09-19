package tp3Boucle;

import java.util.Scanner;

public class Exerice14PlusGrand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reponse = 1;
        int nombre = 0;
        while(reponse !=0){
            System.out.println("Saisir un nombre :");
            reponse = sc.nextInt();
            if(reponse > nombre){
                nombre = reponse;
            }
        }
        System.out.println("Le nombre le plus grand est :" + nombre);
    }
}
