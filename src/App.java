//

static String setMarke() {

    String m = IO.readln("Märke: ");

    if (m.isEmpty() || m.trim().equals(" ")) {
        throw new IllegalArgumentException("Märke kan inte vara tomt");
    }

    return m;
}

static String setModell() {
    String m = IO.readln("Modell: ");

    if (m.isEmpty() || m.trim().equals(" ")) {
        throw new IllegalArgumentException("Modell kan inte vara tomt");
    }

    return m;
}

static String setRegistreringsnummer() {
    String r = IO.readln("Registreringsnummer: ");

    if (r.isEmpty() || r.trim().equals(" ")) {
        throw new IllegalArgumentException("Registreringsnummer kan inte vara tomt");
    }

    return r;
}

static int setArsmodell() {
    String a = IO.readln("ÅrsModell: ");

    try {
        Integer.parseInt(a);

        if (Integer.parseInt(a) > 1860 && Integer.parseInt(a) <= 2026) {
            return Integer.parseInt(a);
        } else {
            throw new IllegalArgumentException("ÅrsModell");
        }
    } catch (NumberFormatException n) {
        throw new IllegalArgumentException("ÅrsModell");
    }
}

void main() {

    Bil bil1 = new Bil(setMarke(), setModell(), setRegistreringsnummer(), setArsmodell());
    IO.println(bil1);

    try {
        Bil bil2 = new Bil(setMarke(), setModell(), setRegistreringsnummer(), setArsmodell());
    } catch (IllegalArgumentException i) {
        IO.println(i.getMessage());
    }

    bil1.okaHastighet(50);
    IO.println("Hastighet är " + bil1.getHastighet());
    bil1.bromsa(15);
    IO.println("Hastighet har minskat och är nu " + bil1.getHastighet());

    try {
        bil1.okaHastighet(-10);
    } catch (IllegalArgumentException i) {
        IO.println(i.getMessage());
    }

}