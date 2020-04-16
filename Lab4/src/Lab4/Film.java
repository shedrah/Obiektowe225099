package Lab4;

public class Film extends Przedmiot

{
    private Wydawnictwo wydawnictwo;
    private String czas_trwania;
    public Film(String indeks, int dni, String czas_trwania, String data_wyp)
    {
        super(indeks, 10, data_wyp, 0);
        this.czas_trwania = czas_trwania;
        // Kompozycja
        this.wydawnictwo = new Wydawnictwo();
        wydawnictwo.setData_wydania("2012");
        wydawnictwo.setAutor("Lirik");
        wydawnictwo.setWydawnictwo("Wydawnictwo#3");
        wydawnictwo.setCena("50 zl");

    }

    @Override
    public void wypozycz() {
        super.wypozycz();
        System.out.println("Wypozyczono film; max. czas wypozyczenia: " + getDni());
    }

}
