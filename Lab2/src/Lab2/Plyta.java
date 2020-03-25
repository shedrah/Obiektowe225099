package Lab2;

public class Plyta extends Zbiory

{
    private String rozmiar;
    public Plyta(String indeks, String data_wydania, String autor, String wydawnictwo, String cena, int dni, String rozmiar, String data_wyp)
    {
        super(indeks, data_wydania, autor, wydawnictwo, cena, 5, data_wyp, 0);
        this.rozmiar = rozmiar;
    }

    @Override
    public void wypozycz() {
        super.wypozycz();
        System.out.println("Wypozyczono plyte; max. czas wypozyczenia: " + getDni());
    }
}
