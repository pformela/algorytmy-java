package com.zadanka;

import java.util.Arrays;

public class SzukajTabl {
    static void szukaj(int tab[], int left, int right, int element) {
        if(left > right) {
            System.out.println("Nie znaleziono elementu.");
        }
        else {
            if(tab[left] == element) {
                System.out.println("Znaleziono element " + element + " na pozycji tab[" + left + "].");
            }
            else
                szukaj(tab, left+1, right, element);
        }
    }


    public static void main(String[] args) {
        int tab1[] = {1, 2, 3, 2, -7, 44, 5, 1, 0, -3};

        for (int i = 0; i < tab1.length; i++) {
            System.out.println("tab1[" + i + "] = " + tab1[i]);
        }
        System.out.println();
        szukaj(tab1, 0, tab1.length - 1, 5);
        szukaj(tab1, 0, tab1.length - 1, 4);

    }
}
