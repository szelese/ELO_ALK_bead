
import java.time.LocalDate;

public class Diak extends Ember {
    private String iskolaNeve;

    public Diak(String nev, LocalDate szuletesiDatum, Nem nem, String iskolaNeve) {
        super(nev, szuletesiDatum, nem);
        this.iskolaNeve = iskolaNeve;
    }

    public String getIskolaNeve() {
        return iskolaNeve;
    }

    public void setIskolaNeve(String iskolaNeve) {
        this.iskolaNeve = iskolaNeve;
    }

    @Override
    public String bemutatkozas() {
        return super.bemutatkozas() + " Tanuló vagyok az " + iskolaNeve + " iskolában.";
    }
}
