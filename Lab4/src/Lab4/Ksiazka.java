package Lab4;

public class Ksiazka extends Przedmiot

{
    private Wydawnictwo wydawnictwo;
    private String liczba_stron;
    public Ksiazka(String indeks, int dni, String liczba_stron, String data_wyp)
    {
        super(indeks, 30, data_wyp, 0);
        this.liczba_stron = liczba_stron;
        // Kompozycja
        this.wydawnictwo = new Wydawnictwo();
        wydawnictwo.setData_wydania("1999");
        wydawnictwo.setAutor("Jan Kowalski");
        wydawnictwo.setWydawnictwo("Wydawnictwo#1");
        wydawnictwo.setCena("20 zl");
    }

    public Wydawnictwo getWydawnictwo() {
        return wydawnictwo;
    }

    @Override
    public void wypozycz() {
        super.wypozycz();
        System.out.println("Wypozyczono ksiazke - max. czas wypozyczenia: " + getDni()+" dni");
    }

}
