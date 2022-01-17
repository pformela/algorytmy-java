package com.zadanka;

public class Complex {
    private double Im, Re;

    public Complex(double x, double y) {
        Im = x;
        Re = y;
    }

    public Complex() {
        Im = 0;
        Re = 0;
    }

    public double Czesc_Rzecz() {
        return Re;
    }

    public double Czesc_Uroj() {
        return Im;
    }

    public Complex dodaj(Complex x1, Complex x2) {
        Complex res = new Complex(x1.Im + x2.Im, x1.Re  +x2.Re);
        return res;
    }

    public Complex iloczyn(Complex x2) {
        Complex res = new Complex(this.Im * x2.Im - this.Re * x2.Re,
                                    this.Im * x2.Re + this.Re * x2.Im);
        return res;
    }

    public void pisz(String n) {
        System.out.println(n + "[" + (int)this.Im + " + i * " + (int)this.Re + "]");
    }

}
