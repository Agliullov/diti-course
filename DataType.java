package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 4;
        int b;
        double d = 4.0;
        double c;
        String s = "DITI ";
        String f;

        b = scan.nextInt();
        c = scan.nextDouble();
        scan.nextLine();
        f=scan.nextLine();

        int sum1= i+b;
        System.out.println(sum1);
        double sum2= c+d;
        System.out.println(sum2);
        String sum3 = s+f;
        System.out.println(sum3);
        scan.close();
    }
}
