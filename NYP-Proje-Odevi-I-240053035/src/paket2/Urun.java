package paket2;

public class Urun {
    int urunId;
    String ad;
    String aciklama;
    double fiyat;
    int stokAdedi;
    Kategori kategori;

    public Urun(int urunId, String ad, String aciklama, double fiyat, int stokAdedi, Kategori kategori) {
        this.urunId = urunId;
        this.ad = ad;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.stokAdedi = stokAdedi;
        this.kategori = kategori;
    }

    public void stokGuncelle(int miktar) {
        this.stokAdedi += miktar;
    }

    public void fiyatGuncelle(double yeniFiyat) {
        this.fiyat = yeniFiyat;
    }
}