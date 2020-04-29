package Lab5;

public class KonstruktorZadan {
    private int temperatura1;
    private int temperatura2;
    private int[] tablica;
    private String przyklad;
    private int[] tablica2;
         //////////Zadanie1//////////
        public boolean Zad1(int temperatura1, int temperatura2){
            if ((temperatura1<100) || (temperatura2<100))
            {
                System.out.println("Zad1: "+true);
                return true;
            }else
                return false;
        }
        //////////Zadanie2//////////
        public boolean Zad2(int[] tablica) {
            boolean wynik=false;
            for (int i = 0; i < 10; i++)
                if (tablica[i] == 1) {
                    if (tablica[i + 1] == 2) {
                        if (tablica[i + 2] == 3) {
                            System.out.println("Zad2: " + true);
                            wynik = true;
                            break;
                        }
                    }
                }
            if (wynik) {
                return true;
            } else {
                return false;
            }
        }
        //////////Zadanie3//////////
            public String Zad3(String przyklad)
            {
                int mid = przyklad.length();
                return przyklad.substring(0, mid/2);
            }
        //////////Zadanie4//////////
            public static int [] Zad4(int[] tablica2)
            {
                int[] temp = new int [tablica2.length];
                for(int i =0; i<tablica2.length; i++)
                {
                    temp[i] = tablica2[tablica2.length - (1 + i)];
                }

                for(int i =0; i<tablica2.length; i++)
                {
                    tablica2[i] =temp[i];
                }
                    return tablica2;
            }

    public int getTemperatura1() {
        return temperatura1;
    }

    public int getTemperatura2() {
        return temperatura2;
    }

    public int[] getTablica() {
        return tablica;
    }

    public String getPrzyklad() {
        return przyklad;
    }

    public int[] getTablica2() {
        return tablica2;
    }
}
