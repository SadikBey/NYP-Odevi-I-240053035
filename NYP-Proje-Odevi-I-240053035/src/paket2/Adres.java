package paket2;

public class Adres {
    String adresBasligi;
    String il;
    String ilce;
    String acikAdres;

    public Adres(String adresBasligi, String il, String ilce, String acikAdres) {
        this.adresBasligi = adresBasligi;
        this.il = il;
        this.ilce = ilce;
        this.acikAdres = acikAdres;
    }

    public String adresBilgisiniDondur() {
        return adresBasligi + " - " + il + "/" + ilce + " - " + acikAdres;
    }
}
