package com.zadanka;
import java.io.*;

class McCarthy {

    static int cpt = 0;

    static int mc91(int x) {
        cpt++;
        if(x > 100)
            return (x-10);
        else
            return mc91( mc91(x+11) );
    }

    public static void main(String args[]) {
        int x;
        StreamTokenizer inp = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        try {
            System.out.println("Podaj liczbę x: ");
            while(inp.nextToken() != StreamTokenizer.TT_NUMBER) {
                System.out.println("Podaj poprawną liczbę x: ");
            }
            x = (int)inp.nval;
            System.out.println("McCarthy(" + x + ") = " + mc91(x));
            System.out.println("Funkcję wykonano " + cpt + " razy.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
