package com.zadanka;

class Osoba {
    private String nazwiskoRodowe;
    protected String nazwisko;
    protected String adres;
    public int wiek;

    public Osoba(String s_nazw, int s_wiek, String s_adres, String s_rodowe) {
        nazwisko = s_nazw;
        wiek = s_wiek;
        adres = s_adres;
        nazwiskoRodowe = s_rodowe;
    }

    public void pisz() {
        System.out.println("[Klasa Osoba] -> metoda pisz()");
        System.out.println("\t Nazwisko: " + nazwisko + " nazwisko rodowe: " + nazwiskoRodowe +
                            " wiek: " + wiek + " miasto: " + adres);
    }

    public void ukryjNazwiskoRodowe() {
        System.out.println("[Klasa Osoba] -> Wymazuję nazwisko rodowe");
        nazwiskoRodowe = "**********";
    }

    public String getNazwiskoRodowe() {
        return nazwiskoRodowe;
    }
}

class Pracownik extends Osoba {
    private String wydzial;
    private int placa;

    public Pracownik(String p_nazw, int p_wiek, String p_adres, String p_rodowe,
                     String p_wydzial, int p_placa) {
        super(p_nazw, p_wiek, p_adres, p_rodowe);
        wydzial = p_wydzial;
        placa = p_placa;
    }

    public void pisz() {
        System.out.println("[Klasa Pracownik] -> metoda pisz() - najpierw wywołamy pisz() klasy nadrzędnej: ");
        super.pisz();
        System.out.println("\tWydział: " + wydzial + ", placa: " + placa);
    }
}


class Dziedzic {
    public static void main(String[] args) {
        Osoba os = new Osoba("Doe", 60, "Nowy Jork", "-");
        os.pisz();
        Pracownik pr = new Pracownik("Kowalska", 55, "Wrocław", "Konopnicka",
                "Dział kadr", 4500);
        pr.pisz();
        pr.ukryjNazwiskoRodowe();
        pr.pisz();
    }
}
