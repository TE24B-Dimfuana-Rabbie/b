public class Bil {
    private String marke;
    private String modell;
    private String registreringsnummer;
    private int arsmodell;
    private int hastighet;

    public Bil(String marke, String modell, String registreringsnummer, int arsmodell) {
        setMarke(marke);
        setModell(modell);
        setRegistreringsnummer(registreringsnummer);
        setArsmodell(arsmodell);
    }

    public void setMarke(String marke) {

        if (marke.isBlank() || marke.trim().equals(" ")) {
            throw new IllegalArgumentException("Märke kan inte vara tomt");
        }

        this.marke = marke;
    }

    public void setModell(String modell) {

        if (modell.isBlank() || modell.trim().equals(" ")) {
            throw new IllegalArgumentException("Modell kan inte vara tomt");
        }

        this.modell = modell;
    }

    public void setRegistreringsnummer(String registreringsnummer) {

        if (registreringsnummer.isBlank() || registreringsnummer.trim().equals(" ")) {
            throw new IllegalArgumentException("Registreringsnummer kan inte vara tomt");
        }

        this.registreringsnummer = registreringsnummer;
    }

    public void setArsmodell(int arsmodell) {
        if (arsmodell > 1860 && arsmodell <= 2026) {
            this.arsmodell = arsmodell;
        } 
        else {
           throw new IllegalArgumentException("ÅrsModell måste vara förre år 1860");
        }

    }


// -- // -- // -- // -- // -- // -- // -- // -- // -- // -- 

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

// -- // -- // -- // -- // -- // -- // -- // -- // -- // -- // -- // -- 

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
