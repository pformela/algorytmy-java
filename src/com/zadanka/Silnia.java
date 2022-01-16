package com.zadanka;

import java.util.Scanner;

public class Silnia {
    static long silnia(int num) {
        if(num == 1)
            return 1;
        else
            return num * silnia(num-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long silnia = silnia(num);
        System.out.println(silnia);
    }
}
