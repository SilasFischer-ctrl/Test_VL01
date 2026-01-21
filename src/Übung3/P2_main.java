package Übung3;

import java.util.Scanner;

public class P2_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Werte für a, b und c ein:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = 0;

        if (a == b) {
            d++;
        }

        if (a == b || a == c) {
            d++;
        }

        if (a + b >= c) {
            d++;
        }

        if (a + b + c >= 100) {
            d++;
        }

        System.out.println("Anzahl erfüllter Eigenschaften d = " + d);

        sc.close();
    }
}
