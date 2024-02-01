package org.example;

import java.util.Scanner;

public class Biermand {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int aantal = 0;

        do {
            System.out.println("Hoe groot is de biermand (3 - 10)? ");
            aantal = sc.nextInt();
            if (aantal < 3 || aantal > 20) {
                System.out.println("De grote moet tussen 3 & 20 ");

            }
        } while (aantal < 3 || aantal > 20);

        String biermand[] = new String[aantal];
        String[] gevuldBiermand = vulBiermand(biermand);
        int totaalPrijs = berekenTotaal(gevuldBiermand);
        double totaalPrijsMetBTW = berekenTotaalBTW(totaalPrijs);

        System.out.println("De waarde van je mand is:  " + totaalPrijs + " Euro");
        System.out.println("Inclusief met btw is dit: " + totaalPrijsMetBTW + " Euro");


    }

    public static String[] vulBiermand(String[] bm) {
        Scanner sc1 = new Scanner(System.in);

        int i = 0;
        String str = "";

        do {
            System.out.println("Welke geschenk kies je ? (keuze: W, D, AV): ");
            str = sc1.nextLine();

            str = str.toUpperCase();

            switch (str) {
                case "W":
                    bm[i] = str;
                    i++;
                    break;
                case "D":
                    bm[i] = str;
                    i++;
                    break;
                case "AV":
                    bm[i] = str;
                    i++;
                    break;

                default:
                    System.out.println("De keuze zijn W, D, AV ");


            }
        } while (i < bm.length);

        return bm;

    }

    public static int berekenTotaal(String[] pr) {
        int prijs = 0;
        for (int j = 0; j < pr.length; j++) {
            if (pr[j].equals("W")) {
                prijs += 2;

            } else if (pr[j].equals("D")) {
                prijs += 3;

            } else {
                prijs += 1;
            }
        }
        return prijs;

    }

    public static double berekenTotaalBTW(double prijsB) {

        double prijsMetBtw = prijsB + ((prijsB / 100) * 21);

        return prijsMetBtw;

    }
}
