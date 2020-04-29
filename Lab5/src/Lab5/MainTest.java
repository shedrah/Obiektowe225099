package Lab5;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @org.junit.jupiter.api.Test
    public void TestZad1()
    {
        boolean wynikOczekiwany=false;
        KonstruktorZadan testowanie = new KonstruktorZadan();
        assertEquals(wynikOczekiwany,testowanie.Zad1(120,210),"Test niezdany");
    }
    @org.junit.jupiter.api.Test
    public void TestZad2()
    {
        Boolean wynikOczekiwany=true;
        KonstruktorZadan testowanie = new KonstruktorZadan();
        int []tablica={4, 3, 6, 1, 2, 3, 9, 1, 2, 5};
        assertEquals(wynikOczekiwany,testowanie.Zad2(tablica),"Test niezdany");
    }
    @org.junit.jupiter.api.Test
    public void TestZad3()
    {
        String wynikOczekiwany="Dzisiaj je";
        KonstruktorZadan testowanie = new KonstruktorZadan();
        assertEquals(wynikOczekiwany,testowanie.Zad3("Dzisiaj jest czwartek"),"Test niezdany");
    }
    @org.junit.jupiter.api.Test
    public void TestZad4()
    {
        KonstruktorZadan testowanie = new KonstruktorZadan();
        int[] sprawdzane = {4, 3, 6, 1, 2, 3, 9, 1, 2, 5};
        int [] wynikOczekiwany ={5, 2, 1, 9, 3, 2, 1, 6, 3, 4};
        assertArrayEquals(wynikOczekiwany,testowanie.Zad4(sprawdzane),"Test niezdany");
    }
}
