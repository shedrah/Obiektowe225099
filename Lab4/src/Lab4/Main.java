package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        //////////////////////////////////////////////////////////// Zadanie 2. ////////////////////////////////////////////////////////////
        System.out.println("Wprowadz Liczby w formacie String: ");
        Scanner liczba = new Scanner(System.in);
        String numer = liczba.next();
        try
        {
            int liczbaInt = Integer.parseInt(numer.trim());
            System.out.println("int liczbaInt = " + liczbaInt);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
            System.exit(1);
        }

        System.out.println("Liczby zostaly zamienione na int.");
        //////////////////////////////////////////////////////////// Zadanie 3. ////////////////////////////////////////////////////////////
        System.out.println("Podaj element tablicy, ktory Cie interesuje: ");
        Scanner element = new Scanner(System.in);
        int elementInt = element.nextInt();
        try
        {
            Tablica.sort(elementInt);
        }
        catch (IndexOutOfBoundsException error)
        {
            System.out.println("IndexOutOfBoundsException: "+ error.getMessage());
            System.exit(1);
        }

        //////////////////////////////////////////////////////////// Zadanie 4. ////////////////////////////////////////////////////////////
        //tworzenie uzytkownika oraz dwoch ksiazek/plyt/filmow
        Uzytkownik uzytkownik1 = new Uzytkownik();

        List<Ksiazka> listaksiazek = new ArrayList<Ksiazka>(10);
        Ksiazka ksiazka1 = new Ksiazka("Ksiazka#1", 30, "1",  "puste");
        listaksiazek.add(ksiazka1);
        Ksiazka ksiazka2 = new Ksiazka("Ksiazka#2", 30, "1",  "puste");
        listaksiazek.add(ksiazka2);

        List<Film> listafilmow = new ArrayList<Film>(10);
        Film film1 = new Film("Film#1",10,"2h","puste");
        listafilmow.add(film1);
        Film film2 = new Film("Film#2",10,"3h","puste");
        listafilmow.add(film2);

        List<Plyta> listaplyt = new ArrayList<Plyta>(10);
        Plyta plyta1 = new Plyta("Plyta#1", 5,"50MB","puste");
        listaplyt.add(plyta1);
        Plyta plyta2 = new Plyta("Plyta#2", 5,"70MB","puste");
        listaplyt.add(plyta2);

        double oplata = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n 1. Zaloguj się\n 2. Zarejestruj się\n");
        int numer1 = scanner.nextInt();
        System.out.print("Wybrano: " + numer1 + "\n");
        switch (numer1) {
            case 1:
                System.out.print("Podaj numer indeksu\n");
                Scanner scanner7 = new Scanner(System.in);
                String numer7 = scanner7.nextLine();
                uzytkownik1.setIndeksUzy(numer7);
                break;
            case 2:
                uzytkownik1.Stworz();
                uzytkownik1.Zapisz();
                break;
        }
        int numer2=0;
        int numer3=0;
        do {
            Scanner scanner2 = new Scanner(System.in);
            System.out.print(" 1.Wypozycz obiekt\n 2.Oddaj obiekt\n 3.Wyjdz\n");
            numer2 = scanner2.nextInt();
            scanner2.nextLine();
            System.out.print("Wybrano: \n" + numer2 + "\n");
            if (numer2 == 1) {
                if (uzytkownik1.getZaleglosci() == 0) {
                    do {
                        System.out.print("Co chcesz wypozyczyc?\n 1.Ksiazke\n 2.Film \n 3.Plyte\n 4.Powrót\n");
                        Scanner scanner99 = new Scanner(System.in);
                        int numer99 = scanner99.nextInt();
                        scanner99.nextLine();
                        System.out.print("Wybrano: \n" + numer99 + "\n");
                        switch (numer99) {
                            case 1:
                                System.out.print("Wybierz ksiazke(1 lub 2): \n");
                                for (Ksiazka model : listaksiazek) {
                                    System.out.println(model.getIndeks());
                                }
                                Scanner scanner5 = new Scanner(System.in);
                                int numer5 = scanner5.nextInt();
                                switch (numer5) {
                                    case 1:
                                        ksiazka1.getData_wyp();
                                        ksiazka1.getIndeks();
                                        ksiazka1.wypozycz();
                                        String nazwapliku = uzytkownik1.getIndeksUzy();
                                        ksiazka1.Dopisz(ksiazka1.getIndeks(), ksiazka1.getData_wyp(), nazwapliku);
                                        break;
                                    case 2:
                                        ksiazka2.getData_wyp();
                                        ksiazka2.getIndeks();
                                        ksiazka2.wypozycz();
                                        nazwapliku = uzytkownik1.getIndeksUzy();
                                        ksiazka2.Dopisz(ksiazka2.getIndeks(), ksiazka2.getData_wyp(), nazwapliku);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.print("Wybierz film(1 lub 2): \n");
                                for (Film model : listafilmow) {
                                    System.out.println(model.getIndeks());
                                }
                                Scanner scanner11 = new Scanner(System.in);
                                int numer11 = scanner11.nextInt();
                                switch (numer11) {
                                    case 1:
                                        film1.getData_wyp();
                                        film1.getIndeks();
                                        film1.wypozycz();
                                        String nazwapliku = uzytkownik1.getIndeksUzy();
                                        ksiazka1.Dopisz(film1.getIndeks(), film1.getData_wyp(), nazwapliku);
                                        break;
                                    case 2:
                                        film2.getData_wyp();
                                        film2.getIndeks();
                                        film2.wypozycz();
                                        nazwapliku = uzytkownik1.getIndeksUzy();
                                        ksiazka2.Dopisz(film2.getIndeks(), film2.getData_wyp(), nazwapliku);
                                        break;
                                }
                                break;
                            case 3:
                                System.out.print("Wybierz plyte(1 lub 2): \n");
                                for (Plyta model : listaplyt) {
                                    System.out.println(model.getIndeks());
                                }
                                Scanner scanner12 = new Scanner(System.in);
                                int numer12 = scanner12.nextInt();
                                switch (numer12)
                                {
                                    case 1:
                                        plyta1.getData_wyp();
                                        plyta1.getIndeks();
                                        plyta1.wypozycz();
                                        String nazwapliku = uzytkownik1.getIndeksUzy();
                                        plyta1.Dopisz(plyta1.getIndeks(), plyta1.getData_wyp(), nazwapliku);
                                        break;
                                    case 2:
                                        plyta2.getData_wyp();
                                        plyta2.getIndeks();
                                        plyta2.wypozycz();
                                        nazwapliku = uzytkownik1.getIndeksUzy();
                                        plyta2.Dopisz(plyta2.getIndeks(), plyta2.getData_wyp(), nazwapliku);
                                        break;
                                }
                                break;
                            case 4:
                                //wyjdz z tego switcha
                                numer3=4;
                                break;
                        }
                    } while (numer3<3);
                }else           //Warunek, ktory przerywa petle w razie nie splacenia kary za przetrzymanie obiektu
                {
                    System.out.print("Nalezy splacic zaleglosci w punkcie informacji przed kolejnym wypozyczeniem\n");
                    System.exit(0);
                }
            } else {
                if (numer2 == 2) {
                    System.out.print("Co chcesz oddać:\n 1.Ksiazka\n 2.Film\n 3.Plyta\n");
                    Scanner scanner8 = new Scanner(System.in);
                    int numer8 = scanner8.nextInt();
                    switch (numer8) {
                        case 1:
                            System.out.print("Wpisz, ktora ksiazke chcesz oddac: \n");
                            Scanner scanner9 = new Scanner(System.in);
                            String numer9 = scanner9.nextLine();
                            if (numer9.equalsIgnoreCase("Ksiazka#1")) {
                                String indeks = numer9;
                                ksiazka1.getIndeks();
                                ksiazka1.getData_wyp();
                                String nazwapliku = uzytkownik1.getIndeksUzy();
                                ksiazka1.oddaj(nazwapliku, ksiazka1.getData_wyp(), indeks);
                                //naliczanie kary
                                oplata = ksiazka1.getKara();
                                ksiazka1.setKara(oplata);
                                uzytkownik1.setZaleglosci(oplata);
                            } else {
                                String indeks = numer9;
                                ksiazka2.getIndeks();
                                ksiazka2.getData_wyp(); // tu byla ksiazka1
                                String nazwapliku = uzytkownik1.getIndeksUzy();
                                ksiazka2.oddaj(nazwapliku, ksiazka2.getData_wyp(), indeks);
                                //naliczanie kary
                                oplata = ksiazka2.getKara();
                                ksiazka2.setKara(oplata);
                                uzytkownik1.setZaleglosci(oplata);
                            }
                            break;
                        case 2:
                            System.out.print("Wpisz, ktory film chcesz oddac: \n");
                            Scanner scanner11 = new Scanner(System.in);
                            String numer11 = scanner11.nextLine();
                            if (numer11.equalsIgnoreCase("Film#1")) {
                                String indeks = numer11;
                                film1.getIndeks();
                                film1.getData_wyp();
                                String nazwapliku = uzytkownik1.getIndeksUzy();
                                film1.oddaj(nazwapliku, film1.getData_wyp(), indeks);
                                //naliczanie kary
                                oplata = film1.getKara();
                                film1.setKara(oplata);
                                uzytkownik1.setZaleglosci(oplata);
                            } else {
                                String indeks = numer11;
                                film2.getIndeks();
                                film2.getData_wyp();
                                String nazwapliku = uzytkownik1.getIndeksUzy();
                                film2.oddaj(nazwapliku, film2.getData_wyp(), indeks);
                                //naliczanie kary
                                oplata = film2.getKara();
                                film2.setKara(oplata);
                                uzytkownik1.setZaleglosci(oplata);
                            }
                            break;
                        case 3:
                            System.out.print("Wpisz, ktora plyte chcesz oddac: \n");
                            Scanner scanner13 = new Scanner(System.in);
                            String numer13 = scanner13.nextLine();
                            if (numer13.equalsIgnoreCase("Plyta#1")) {
                                String indeks = numer13;
                                plyta1.getIndeks();
                                plyta1.getData_wyp();
                                String nazwapliku = uzytkownik1.getIndeksUzy();
                                plyta1.oddaj(nazwapliku, plyta1.getData_wyp(), indeks);
                                //naliczanie kary
                                oplata = plyta1.getKara();
                                plyta1.setKara(oplata);
                                uzytkownik1.setZaleglosci(oplata);
                            } else {
                                String indeks = numer13;
                                plyta2.getIndeks();
                                plyta2.getData_wyp(); // tu byla ksiazka1
                                String nazwapliku = uzytkownik1.getIndeksUzy();
                                plyta2.oddaj(nazwapliku, plyta2.getData_wyp(), indeks);
                                //naliczanie kary
                                oplata = plyta2.getKara();
                                plyta2.setKara(oplata);
                                uzytkownik1.setZaleglosci(oplata);
                            }
                            break;
                    }
                }
            }
        }while (numer2 < 3) ;
        scanner.close();







    }

}

