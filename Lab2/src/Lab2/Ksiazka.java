package Lab2;


public class Ksiazka extends Zbiory

{
        private String liczba_stron;
        public Ksiazka(String indeks, String data_wydania, String autor, String wydawnictwo, String cena, int dni, String liczba_stron, String data_wyp)
        {
                super(indeks, data_wydania, autor, wydawnictwo, cena, 30, data_wyp, 0);
                this.liczba_stron = liczba_stron;
        }

        @Override
        public void wypozycz() {
                super.wypozycz();
                System.out.println("Wypozyczono ksiazke - max. czas wypozyczenia: " + getDni()+" dni");
        }

}
