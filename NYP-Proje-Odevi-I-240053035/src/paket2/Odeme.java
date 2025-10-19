package paket2;

import java.util.Date;

public class Odeme {
    int odemeId;
    Siparis siparis;
    String odemeYontemi;
    double tutar;
    Date odemeTarihi;
    boolean onaylandiMi;

    public Odeme(int odemeId, Siparis siparis, String odemeYontemi, double tutar) {
        this.odemeId = odemeId;
        this.siparis = siparis;
        this.odemeYontemi = odemeYontemi;
        this.tutar = tutar;
        this.odemeTarihi = new Date();
        this.onaylandiMi = false;
    }

    public void odemeOnayla() {
        this.onaylandiMi = true;
    }

    public void odemeBilgileriniGoster() {
        System.out.println("Ödeme #" + odemeId + " - " + odemeYontemi);
        System.out.println("Tutar: " + tutar + " TL");
        System.out.println("Tarih: " + odemeTarihi);
        System.out.println("Onay Durumu: " + (onaylandiMi ? "Onaylandı" : "Bekliyor"));
    }
}
