package Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Przedmiot {
    private String indeks;
    private int dni;
    private String data_wyp;
    private double kara;

    public double getKara() {
        return kara;
    }

    public void setKara(double kara) {
        this.kara = kara;
    }

    public Przedmiot(String indeks, int dni, String data_wyp, double kara) {
        this.indeks = indeks;
        this.dni = dni;
        this.data_wyp = data_wyp;
        this.kara = kara;
    }

    public void wypozycz()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj date wypozyczenia(rrrr-mm-dd): ");
        String data_wyp = scanner.nextLine();
        System.out.println("data wypozyczenia to: " + data_wyp);
        this.data_wyp= data_wyp;
    }
    public void oddaj(String nazwapliku, String data_wyp, String indeks) {
        double kara=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date oddania(rrrr-mm-dd): ");
        String data_odd = scanner.nextLine();
        System.out.println("data oddania to: " + data_odd);


        String dateBeforeString =data_wyp;
        String dateAfterString = data_odd;

        //konwertowanie daty
        LocalDate dateBefore = LocalDate.parse(dateBeforeString);
        LocalDate dateAfter = LocalDate.parse(dateAfterString);

        //obliczanie liczby dni
        long LiczbaDniPomiedzy = ChronoUnit.DAYS.between(dateBefore, dateAfter);


        System.out.println("Obiekt byl wypozyczony przez: "+LiczbaDniPomiedzy+" dni");
        if(LiczbaDniPomiedzy>dni)
        {
            kara = (LiczbaDniPomiedzy-dni)*1;
            System.out.println("Kara wynosi: "+ kara+" zl");
            setKara(kara);
        }
        try {
            String textToAppend = ("Indeks: "+indeks+" oraz data oddania:"+data_odd+"\n");
            FileWriter fileWriter = new FileWriter(nazwapliku+".txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(textToAppend);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void Dopisz(String indeks, String data_wyp, String nazwapliku) {
        try {
            String textToAppend = ("Indeks: "+indeks+" oraz data wypozyczenia:"+data_wyp+"\n");
            FileWriter fileWriter = new FileWriter(nazwapliku+".txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(textToAppend);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // getters/setters
    public String getIndeks() {
        return indeks;
    }

    public int getDni() {
        return dni;
    }

    public String getData_wyp() {
        return data_wyp;
    }
}
