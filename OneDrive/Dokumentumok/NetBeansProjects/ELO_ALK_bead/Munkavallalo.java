
import java.time.LocalDate;

public class Munkavallalo extends Ember {
    private String munkahelyNeve;

    public Munkavallalo(String nev, LocalDate szuletesiDatum, Nem nem, String munkahelyNeve) {
        super(nev, szuletesiDatum, nem);
        this.munkahelyNeve = munkahelyNeve;
    }

    public String getMunkahelyNeve() {
        return munkahelyNeve;
    }

    public void setMunkahelyNeve(String munkahelyNeve) {
        this.munkahelyNeve = munkahelyNeve;
    }

    @Override
    public String bemutatkozas() {
        return super.bemutatkozas() + " Dolgozom a(z) " + munkahelyNeve + " munkahelyen.";
    }
}
