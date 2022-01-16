package com.zadanka;

import java.util.Scanner;

class Referencje {
    public static void main(String[] args) {
        String s1 = "ala", s2 = "ma kota";
        System.out.println("s1 = " + s1 + "\ns2 = " + s2);
        String s3 = new String();

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków s3: ");

        try {
            s3 = sc.nextLine();
            System.out.println("Podano napis s3: " + s3);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        for (int i = 0; i < s3.length(); i++) {
            System.out.printf("Znak s3[%d] = %c\n", i, s3.charAt(i));
        }

        s3 = s1 + " " + s2;

        System.out.printf("Nowa zawartość s3 = %s", s3);
        System.out.println();
        System.out.printf("s1 = %s \t s2 = %s \t s3 = s1 + s2 = %s\n", s1, s2, s3);
        System.out.printf("Fragment napisu s3 = (s1 + s2): %s\n", s3.substring(1,6));
    }
}
