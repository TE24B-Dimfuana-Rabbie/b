//

void main() {

    Bil bil1 = new Bil("Mercedes", "C-klass", "GTX250", 2020);
    IO.println(bil1);

    try {
        Bil bil2 = new Bil("Mercedes", "A-klass", "", 2019);
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