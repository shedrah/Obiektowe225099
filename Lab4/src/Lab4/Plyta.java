package Lab4;

public class Plyta extends Przedmiot

{
    private Wydawnictwo wydawnictwo;
    private String rozmiar;
    public Plyta(String indeks, int dni, String rozmiar, String data_wyp)
    {
        super(indeks, 5, data_wyp, 0);
        this.rozmiar = rozmiar;
        // Kompozycja
        this.wydawnictwo = new Wydawnictwo();
        wydawnictwo.setData_wydania("2003");
        wydawnictwo.setAutor("G-Unit");
        wydawnictwo.setWydawnictwo("Wydawnictwo#2");
        wydawnictwo.setCena("30 zl");
    }

    @Override
    public void wypozycz() {
        super.wypozycz();
        System.out.println("Wypozyczono plyte; max. czas wypozyczenia: " + getDni());
    }
}
