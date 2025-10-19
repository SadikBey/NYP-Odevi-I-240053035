package paket2;

import java.util.ArrayList;

public class Sepet {
    Kullanici kullanici;
    ArrayList<SepetKalemi> urunler;

    public Sepet(Kullanici kullanici) {
        this.kullanici = kullanici;
        this.urunler = new ArrayList<>();
    }

    public void sepeteEkle(Urun urun, int adet) {
        urunler.add(new SepetKalemi(urun, adet));
    }

    public void sepettenCikar(Urun urun) {
        urunler.removeIf(kalem -> kalem.urun.equals(urun));
    }

    public double toplamTutariHesapla() {
        double toplam = 0;
        for (SepetKalemi kalem : urunler) {
            toplam += kalem.kalemToplamTutari();
        }
        return toplam;
    }
}

class SepetKalemi {
    Urun urun;
    int adet;

    public SepetKalemi(Urun urun, int adet) {
        this.urun = urun;
        this.adet = adet;
    }

    public double kalemToplamTutari() {
        return urun.fiyat * adet;
    }
}
