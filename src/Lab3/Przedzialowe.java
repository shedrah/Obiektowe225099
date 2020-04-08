package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Przedzialowe implements Sortable
{
    static int operacja=0;
    private int maks;
        static void sort ( int tab[])
        {
            operacja=0;
            int maks = 0;
            int LiczbaKub = 20;
            for (int i = 0; i < tab.length; i++) //szukanie najwiekszej wartosci posrod 200 liczb
            {
                if (tab[i] > maks)
                {
                    maks = tab[i];
                }
            }
            int N = 200;
            List<List<Integer>> P = new ArrayList<>(LiczbaKub);  // inicjalizacja Tablicy "2D" P, która bedzie przechowywac kubelki i odpowienie liczby w tych kubelkach
           for (int i = 0; i < LiczbaKub; i++)
            {
               P.add(new ArrayList<Integer>(50));
            }
            double dzielnik = Math.ceil((maks + 1) / LiczbaKub);  //dzielnik, ktory bedzie uzywany przy wskazywaniu do ktorego kubelka dana liczba ma trafic
            int j;
                for (int i = 0; i < tab.length; i++)
                {
                    P.add(new ArrayList<Integer>(201)); // zwiekszenie rozmiaru kubelka - zabezpieczenie przed wystapieniem zbyt duzej ilosci liczb w jednym kubelku
                            j = (int) Math.floor(tab[i] / dzielnik); //decydowanie
                            P.get(j).add(tab[i]); //dodawanie liczby do danego kubelka
                }
            int temp;
            int zmiana = 1;
            for (int i = 0; i < LiczbaKub; i++) {
                zmiana = 1;
                while (zmiana > 0) {     //petla sortowania wewnatrz kubelka
                    zmiana = 0;

                    for (j = 0; j < P.get(i).size() - 1; j++) {    //dla kazdego kubelka wykonaj sortowanie

                        if (P.get(i).get(j) > P.get(i).get(j + 1))   //sortowanie babelkowe wewnatrz kubelka
                        {
                            temp = P.get(i).get(j + 1);
                            P.get(i).set(j + 1, P.get(i).get(j));
                            P.get(i).set(j, temp);
                            zmiana++;
                            operacja++;
                        }
                    }
                }
            }
            for (int i = 0; i < LiczbaKub; i++) {    //wypisywanie, po kolei z kazdego kubelka wszystkie liczby, ktore zawiera
                for (j = 0; j < P.get(i).size(); j++) {
                    System.out.print(P.get(i).get(j) + " ");
                }
            }
        }
    static void step_counting()
    {
        System.out.print("\n"+"Liczba operacji: "+operacja);
    }
}
