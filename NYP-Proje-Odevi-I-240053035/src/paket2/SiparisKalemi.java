package paket2;

public class SiparisKalemi {
    Urun urun;
    int adet;
    double birimFiyatOAnki;

    public SiparisKalemi(Urun urun, int adet) {
        this.urun = urun;
        this.adet = adet;
        this.birimFiyatOAnki = urun.fiyat; // sipariş anındaki fiyat
    }

    public double kalemToplamTutariHesapla() {
        return adet * birimFiyatOAnki;
    }
}