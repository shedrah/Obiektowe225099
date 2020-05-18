package Main;

import org.springframework.stereotype.Component;

@Component
public class Plec {
    private String p;
    public String  Sprawdzenie(String imie)
    {
        String p;
        char znak = imie.charAt(imie.length()-1);
        if(znak=='a')
        {
            p="Kobieta";
        }else  p="Mezczyzna";
        this.p=p;
        return p;
    }

}
