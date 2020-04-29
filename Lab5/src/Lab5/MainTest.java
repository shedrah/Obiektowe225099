package Lab5;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @org.junit.jupiter.api.Test
    public void TestZad1()
    {
        boolean wynik1=false;
        KonstruktorZadan testowanie = new KonstruktorZadan();
        assertEquals(wynik1,testowanie.Zad1(120,210),"Test niezdany");
    }
    @org.junit.jupiter.api.Test
    public void TestZad2()
    {
        Boolean wynik2=true;
        KonstruktorZadan testowanie = new KonstruktorZadan();
        int []tablica={4, 3, 6, 1, 2, 3, 9, 1, 2, 5};
        assertEquals(wynik2,testowanie.Zad2(tablica),"Test niezdany");
    }
    @org.junit.jupiter.api.Test
    public void TestZad3()
    {
        String wynik3="Dzisiaj je";
        KonstruktorZadan testowanie = new KonstruktorZadan();
        int []tablica={4, 3, 6, 1, 2, 3, 9, 1, 2, 5};
        assertEquals(wynik3,testowanie.Zad3("Dzisiaj jest czwartek"),"Test niezdany");
    }
    @org.junit.jupiter.api.Test
    public void TestZad4()
    {
        KonstruktorZadan testowanie = new KonstruktorZadan();
        int[] i = {4, 3, 6, 1, 2, 3, 9, 1, 2, 5};
        int [] x ={5, 2, 1, 9, 3, 2, 1, 6, 3, 4};
        assertArrayEquals(x,testowanie.Zad4(i),"Test niezdany");
    }
}