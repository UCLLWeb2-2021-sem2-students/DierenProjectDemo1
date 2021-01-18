package domain.model;

public class Dier {
    String naam;
    DierSoort soort;
    int voedsel;

    public Dier(String naam) {
        this.setNaam(naam);
    }

    public Dier(String naam, DierSoort soort, int voedsel) {
        this.setNaam(naam);
        this.setSoort(soort);
        this.setVoedsel(voedsel);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null || naam.isEmpty()) {
            throw new IllegalArgumentException("Geen geldige naam");
        }
        this.naam = naam;
    }

    public DierSoort getSoort() {
        return soort;
    }

    public void setSoort(DierSoort soort) {
        if (soort == null) {
            throw new IllegalArgumentException("Geen geldige soort");
        }
        this.soort = soort;
    }

    public int getVoedsel() {
        return voedsel;
    }

    public void setVoedsel(int voedsel) {
        if (voedsel < 0) {
            throw new IllegalArgumentException("Geen geldige hoeveelheid voor voedsel");
        }
        this.voedsel = voedsel;
    }


}
