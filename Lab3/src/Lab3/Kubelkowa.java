package Lab3;

public class Kubelkowa implements Sortable {
    static  int operacja=0;
    private int maks;
    static void sort(int tab[]) {
        operacja=0;
        int maks =0;
        for(int i=0;i<tab.length;i++) //szukanie najwiekszej wartosci posrod 200 liczb
        {
            if(tab[i]>maks)
            {
                maks = tab[i];
            }
        }
        int[] Kubelek = new int[maks + 1]; //tworze tablice o liczbie maks+1 rekordow
        int[] Porzadek = new int[tab.length]; //tworze tablice, w ktorej beda juz posortowane liczby
        for (int i = 0; i < tab.length; i++) {
            Kubelek[tab[i]]++; //dodaj kubelek o danym numerze
        }
        int pozycja = 0;
            for (int i = 0; i < Kubelek.length; i++)
            {
                for (int j = 0; j < Kubelek[i]; j++) //wrzucanie do kubelka
                {
                    Porzadek[pozycja++] = i;
                    operacja++;
                }
        }
        for (int i = 0; i < Porzadek.length; i++) { //wypisz posortowane liczby
            System.out.print(Porzadek[i] + " ");
        }
    }
    static void step_counting()
    {
        System.out.print("\n"+"Liczba operacji: "+operacja);
    }
}
