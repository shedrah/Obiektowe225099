package Lab4;

public class Wydawnictwo {
    // pola dla kompozycji
    private String data_wydania;
    private String autor;
    private String wydawnictwo;
    private String cena;

    public String getData_wydania() {
        return data_wydania;
    }

    public void setData_wydania(String data_wydania) {
        this.data_wydania = data_wydania;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Wydawnictwo{" +
                "data_wydania='" + data_wydania + '\'' +
                ", autor='" + autor + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", cena='" + cena + '\'' +
                '}';
    }
}
