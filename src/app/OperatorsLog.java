package app;

import java.util.Scanner;

public class OperatorsLog {
    static double sum;
    static double taxSmall;
    static double taxNorm;
    static double taxBig;
    static double kostyl;
    private final static String Currency = "EUR";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи твой доход ");
        sum = scanner.nextDouble();

        if (sum <= 10000) {
            taxSmall = 2.5;
            kostyl = sum * taxSmall / 100;
            System.out.printf("Твой налог %s %.2f", Currency, kostyl);
        } else {

            if (sum <= 25001) {
                taxNorm = 4.3;
                kostyl = sum * taxNorm / 100;
                System.out.printf("Твой налог %s %.2f", Currency, kostyl);
            } else {
                if (sum >= 25001)
                    taxBig = 6.7;
                kostyl = sum * taxBig / 100;
                System.out.printf("Твой налог %s %.2f", Currency, kostyl);
            }


        }
    }
}
