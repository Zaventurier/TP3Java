package tp3Boucle;

import java.util.Scanner;

public class Exerice9Calculatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez une opération (+,-,/,*) :");
        char operation = sc.next().charAt(0);
        boolean quitter = false;
        float resultat = 0;

        while(!false){
            if (operation == '+' || operation == '-' || operation == '/' || operation == '*'){
                System.out.print("Saisir nombre 1 :");
                float nbr1 = sc.nextInt();
                System.out.print("Saisir nombre 2 :");
                float nbr2 = sc.nextInt();

                switch (operation){
                    case '+':
                        resultat = nbr1 + nbr2;
                    case '-':
                        resultat = nbr1 - nbr2;
                    case '/':
                        resultat = nbr1 / nbr2;
                    case '*':
                        resultat = nbr1 * nbr2;
                }
                System.out.println(resultat);
                quitter = true;
            }
            else {
                quitter = true;
            }
        }
    }
}
