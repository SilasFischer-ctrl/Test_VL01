package Übung3;

import java.util.Scanner;

public class P1_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein:");

        int wuerfel = sc.nextInt();

        if (wuerfel == 1 || wuerfel == 4) {

            System.out.println("Gewonnen!");

            } else if (wuerfel == 2) {

                System.out.println("Verloren!");

            } else if (wuerfel == 5) {

                System.out.println("Unentschieden!");

            } else {

                System.out.println("Unklar!");

            }

        sc.close();
    }
}
