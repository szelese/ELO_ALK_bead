import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Ember implements Serializable, Comparable<Ember> {
    private String nev;
    private LocalDate szuletesiDatum;
    private Nem nem;
    private static int populacioSzam = 0;

    public Ember(String nev, LocalDate szuletesiDatum, Nem nem) {
        this.nev = nev;
        this.szuletesiDatum = szuletesiDatum;
        this.nem = nem;
        populacioSzam++;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public LocalDate getSzuletesiDatum() {
        return szuletesiDatum;
    }

    public void setSzuletesiDatum(LocalDate szuletesiDatum) {
        this.szuletesiDatum = szuletesiDatum;
    }

    public Nem getNem() {
        return nem;
    }

    public void setNem(Nem nem) {
        this.nem = nem;
    }

    public int getKor() {
        return Period.between(szuletesiDatum, LocalDate.now()).getYears();
    }

    public String bemutatkozas() {
        return "Szia, a nevem " + nev + ", " + getKor() + " éves vagyok és " + nem + ".";
    }

    public static int getPopulacioSzam() {
        return populacioSzam;
    }

    @Override
    public int compareTo(Ember o) {
        return this.szuletesiDatum.compareTo(o.szuletesiDatum);
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", szuletesiDatum=" + szuletesiDatum +
                ", nem=" + nem +
                ", kor=" + getKor() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ember ember = (Ember) o;
        return Objects.equals(nev, ember.nev) &&
                Objects.equals(szuletesiDatum, ember.szuletesiDatum) &&
                nem == ember.nem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, szuletesiDatum, nem);
    }
}
