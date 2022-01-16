package com.zadanka;

class Tablice {
    public static void main(String[] args) {
        int t1[] = {7, 2, 7, 4, 9, 11};
        int t2[] = new int[5];
        int t3[];

        System.out.println("Wielkość tablicy t1 = " + t1.length + ", t2 = " + t2.length);

        for (int i : t1) {
            System.out.println("Kolejny element t1 " + i);
        }
        int t4[] = t1;
        t4[0] = -1;

        System.out.println("Zmodyfikowana tablica t1 (podmiana wartości pierwszej komórki)");

        for (int i : t1) {
            System.out.println("Kolejny element t1 " + i);
        }
    }
}
