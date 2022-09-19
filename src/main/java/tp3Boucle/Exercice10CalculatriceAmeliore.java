package tp3Boucle;

import java.util.Scanner;

public class Exercice10CalculatriceAmeliore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quitter = false;
        double resultat = 0;

        while (!false) {
            System.out.print("Saisissez une opération (+,-,/,*,^) :");
            char operation = sc.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '/' || operation == '*' || operation == '^') {
                System.out.print("Saisir nombre 1 :");
                double nbr1 = sc.nextInt();
                System.out.print("Saisir nombre 2 :");
                double nbr2 = sc.nextInt();

                switch (operation) {
                    case '+':
                        resultat = nbr1 + nbr2;
                        System.out.println(resultat);
                        break;
                    case '-':
                        resultat = nbr1 - nbr2;
                        System.out.println(resultat);
                        break;
                    case '/':
                        if(nbr2 == 0){
                            System.out.println("ERREUR : impossible de diviser par 0 !");
                            break;
                        }else{
                            resultat = nbr1 / nbr2;
                            System.out.println(resultat);
                            break;

                        }
                    case'^':
                        resultat = Math.pow(nbr1,nbr2);
                        System.out.println(resultat);
                        break;

                    case '*':
                        resultat = nbr1 * nbr2;
                        System.out.println(resultat);
                        break;
                }
                quitter = true;
            } else {
                quitter = true;
                System.out.println("Fin");
            }
        }
    }
}

