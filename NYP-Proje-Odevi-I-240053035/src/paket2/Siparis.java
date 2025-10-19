package paket2;

import java.util.ArrayList;
import java.util.Date;

public class Siparis {
    int siparisId;
    Date siparisTarihi;
    double toplamTutar;
    String siparisDurumu;
    ArrayList<SiparisKalemi> siparisKalemleri;
    Adres teslimatAdresi;

    public Siparis(int siparisId, Adres teslimatAdresi) {
        this.siparisId = siparisId;
        this.siparisTarihi = new Date();
        this.siparisDurumu = "Onay Bekliyor";
        this.siparisKalemleri = new ArrayList<>();
        this.teslimatAdresi = teslimatAdresi;
    }

    public void siparisDurumunuGuncelle(String yeniDurum) {
        this.siparisDurumu = yeniDurum;
    }

    public void siparisKalemiEkle(SiparisKalemi kalem) {
        siparisKalemleri.add(kalem);
        toplamTutar += kalem.kalemToplamTutariHesapla();
    }

    public void siparisOzetiniGoster() {
        System.out.println("Sipariş #" + siparisId + " - " + siparisDurumu);
        System.out.println("Teslimat Adresi: " + teslimatAdresi.adresBilgisiniDondur());
        for (SiparisKalemi kalem : siparisKalemleri) {
            System.out.println("- " + kalem.urun.ad + " x" + kalem.adet + " = " + kalem.kalemToplamTutariHesapla());
        }
        System.out.println("Toplam: " + toplamTutar);
    }
}