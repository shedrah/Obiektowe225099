package Lab3;

public class Babelkowa implements Sortable {
    static int operacja=0;
    static void sort(int [] tab){
        operacja=0;
        int temp;
        int zmiana = 1;
        int[] Porzadek = new int[tab.length];
        for(int i = 0; i < tab.length; i++)
        {
            Porzadek[i]=tab[i];
        }
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (Porzadek[i] > Porzadek[i + 1]) {
                    temp = Porzadek[i + 1];
                    Porzadek[i + 1] = Porzadek[i];
                    Porzadek[i] = temp;
                    zmiana++;
                   operacja++;
                }
            }
        }
        for (int i = 0; i < Porzadek.length; i++) {
            System.out.print(Porzadek[i] + " ");
        }
    }
    static void step_counting() {
       System.out.print("\n"+"Liczba operacji: "+operacja);
    }
}
