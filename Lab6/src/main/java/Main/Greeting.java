package Main;

public class Greeting {
    private final long id;
    private final String imie;
    private final String wiek;
    private  String plec;

    public Greeting(long id, String imie,String wiek,String plec) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
    }

    public long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getWiek() {
        return wiek;
    }

    public String getPlec() {
        return plec;
    }


}
