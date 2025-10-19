package paket2;

import java.util.ArrayList;

public class Kullanici {
    int kullaniciId;
    String kullaniciAdi;
    String sifre;
    String email;
    ArrayList<Adres> adresler;

    public Kullanici(int kullaniciId, String kullaniciAdi, String sifre, String email) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.adresler = new ArrayList<>();
    }

    public void adresEkle(Adres yeniAdres) {
        adresler.add(yeniAdres);
    }

    public void adresSil(Adres adres) {
        adresler.remove(adres);
    }

    public void bilgileriGoster() {
        System.out.println("Kullanıcı: " + kullaniciAdi + " (" + email + ")");
        for (Adres a : adresler) {
            System.out.println(" - " + a.adresBilgisiniDondur());
        }
    }
}