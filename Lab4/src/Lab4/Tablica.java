package Lab4;

import java.util.Random;

public class Tablica {
    static void sort(int wybor) {

        int TablicaLiczb[];    //tworzenie tablicy 200 elementowej
        TablicaLiczb = new int[200];
        Random objGenerator = new Random();
        for (int iCount = 0; iCount < 200; iCount++) {
            int randomNumber = objGenerator.nextInt(200); //losowanie 200 elementów
            TablicaLiczb[iCount] = randomNumber;
        }
        System.out.print("Wybrany element: "+TablicaLiczb[wybor]);
    }
}
