public class Bil {
    private String marke;
    private String modell;
    private String registreringsnummer;
    private int arsmodell;
    private int hastighet;

    public Bil(String marke, String modell, String registreringsnummer, int arsmodell) {
        this.marke = marke;
        this.modell = modell;
        this.registreringsnummer = registreringsnummer;
        this.arsmodell = arsmodell;
    }

    public int getArsmodell() {
        return this.arsmodell;
    }

    public String getRegistreringsnummer() {
        return this.registreringsnummer;
    }

    public String getModell() {
        return this.modell;
    }

    public String getMarke() {
        return this.marke;
    }

    public int getHastighet() {
        return this.hastighet;
    }

    public void okaHastighet(int okning) {

        if (okning <= 0) {
            throw new IllegalArgumentException("Ökningen måste vara högre än noll");
        }

        this.hastighet += okning;

    }

    public void bromsa(int minskning) {

        if (minskning <= 0) {
            throw new IllegalArgumentException("Minskningen måste vara högre än noll");
        }

        if (this.hastighet <= minskning) {
            this.hastighet = 0;
        } else {
            this.hastighet -= minskning;
        }

    }

}
