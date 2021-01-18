package domain.db;

import java.util.ArrayList;

import domain.model.Dier;
import domain.model.DierSoort;

public class DierDB {
    private ArrayList<Dier> dieren = new ArrayList<>();

    public DierDB() {
        this.voegToe(new Dier("Albert", DierSoort.KAT, 3));
        this.voegToe(new Dier("Piet", DierSoort.KANARIE, 1));
        this.voegToe(new Dier("Lex", DierSoort.HOND, 2));
        this.voegToe(new Dier("Nijn", DierSoort.KAT, 5));
        this.voegToe(new Dier("Bruintje", DierSoort.KIP, 1));
    }

    public void voegToe(Dier dier) {
        if (dier == null)
            throw new IllegalArgumentException("Geef een bestaand dier");
        if (vind(dier.getNaam()) != null)
            throw new IllegalArgumentException("Je mag een dier maar één keer toevoegen");
        dieren.add(dier);
    }

    public Dier vind(String naam) {
        if (naam == null || naam.isEmpty())
            throw new IllegalArgumentException("Naam mag niet leeg zijn");
        for (Dier dier : dieren) {
            if (dier.getNaam().equals(naam))
                return dier;
        }
        return null;
    }

    public ArrayList<Dier> vindAlle() {
        return dieren;
    }

    public Dier vindMeestHongerige() {
        if (dieren.size() == 0)
            return null;
        Dier meestHongerige = dieren.get(0);
        for (Dier dier : dieren) {
            if (dier.getVoedsel() > meestHongerige.getVoedsel())
                meestHongerige = dier;
        }
        return meestHongerige;
    }

}
