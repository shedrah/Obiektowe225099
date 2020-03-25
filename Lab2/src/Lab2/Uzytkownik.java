package Lab2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Uzytkownik {
    private String indeksUzy;
    private String imie;
    private String Nazwisko;
    private String data_rej;
    private double zaleglosci;

    public Uzytkownik(){
        this("brak","brak","brak","brak",0);
    }

    public Uzytkownik(String indeksUzy, String imie, String Nazwisko, String data_rej, double zaleglosci){
        this.indeksUzy=indeksUzy;
        this.imie=imie;
        this.Nazwisko=Nazwisko;
        this.data_rej=data_rej;
        this.zaleglosci=zaleglosci;
    }

public double Naliczanie(double kara)
{
        setZaleglosci(kara);
        return zaleglosci;
}


    public void Stworz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj indeksUzy: ");
        String indeksUzy = scanner.nextLine();
        setIndeksUzy(indeksUzy);
        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        setImie(imie);
        System.out.println("Podaj Nazwisko: ");
        String Nazwisko = scanner.nextLine();
        setNazwisko(Nazwisko);
        System.out.println("Podaj data_rejestracji(rrrr-mm-dd): ");
        String Data_rej = scanner.nextLine();
        setData_rej(Data_rej);
        this.zaleglosci=0;
    }


    public void Zapisz() {
        try {
            String nazwafolderu = indeksUzy;
        File file = new File(nazwafolderu+".txt");
        if(!file.exists()){
                file.createNewFile();
            }

             PrintWriter pw = new PrintWriter(file);
            pw.println(indeksUzy);
            pw.println(imie);
            pw.println(Nazwisko);
            pw.println("Historia wypozyczen(1. Numer_obiektu 2. Data akcji): ");
            pw.close();
        }catch (IOException e){
                e.printStackTrace();
            }
        }

    public void setIndeksUzy(String indeksUzy) {
        this.indeksUzy = indeksUzy;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public void setData_rej(String data_rej) {
        this.data_rej = data_rej;
    }

    public void setZaleglosci(double zaleglosci) {
        this.zaleglosci = zaleglosci;
    }


    public String getIndeksUzy() {
        return indeksUzy;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getData_rej() {
        return data_rej;
    }

    public double getZaleglosci() {
        return zaleglosci;
    }
}

