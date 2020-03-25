package Lab2;

public class Film extends Zbiory

{
    private String czas_trwania;
    public Film(String indeks, String data_wydania, String autor, String wydawnictwo, String cena, int dni, String czas_trwania, String data_wyp)
    {
        super(indeks, data_wydania, autor, wydawnictwo, cena, 10, data_wyp, 0);
        this.czas_trwania = czas_trwania;
    }

    @Override
    public void wypozycz() {
        super.wypozycz();
        System.out.println("Wypozyczono film; max. czas wypozyczenia: " + getDni());
    }

}
