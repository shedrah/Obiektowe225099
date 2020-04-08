package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int TablicaLiczb[];    //tworzenie tablicy 200 elementowej
        TablicaLiczb = new int[200];
        Random objGenerator = new Random();
        for (int iCount = 0; iCount < 200; iCount++)
        {
            int randomNumber = objGenerator.nextInt(200); //losowanie 200 elementów
            TablicaLiczb[iCount] = randomNumber;
        }
        System.out.println("Tablica 200 elementowa zostala stworzona.");
        int numer=0;
        do {
        System.out.println("\n\nMozliwe sortowania:\n 1.Babelkowe\n 2.Kubelkowe - jeden kubelek na jedna liczbe\n 3.Kubelkowe - kazdy kubelek ma przedzial 10 liczb\n 4.Wyjdz\n");
        Scanner scanner = new Scanner(System.in);
        numer = scanner.nextInt();
        System.out.print("Wybrano: " + numer + "\n");
            switch (numer)
            {
                case 1:
                    Babelkowa.sort(TablicaLiczb);
                    Babelkowa.step_counting();
                    break;
                case 2:
                    Kubelkowa.sort(TablicaLiczb);
                    Kubelkowa.step_counting();
                    break;
                case 3:
                    Przedzialowe.sort(TablicaLiczb);
                    Przedzialowe.step_counting();
                    break;
            }
        }while (numer<4);
    }
}