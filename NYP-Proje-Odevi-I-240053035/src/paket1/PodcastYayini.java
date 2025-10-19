package paket1;

public class PodcastYayini {
    String baslik;
    String sunucu;
    int sureSaniye;
    String yayinTarihi;
    int dinlenmeSayisi;

    public PodcastYayini(String baslik, String sunucu, int sureSaniye, String yayinTarihi, int dinlenmeSayisi){
        this.baslik = baslik;
        this.sunucu = sunucu;
        this.sureSaniye = sureSaniye;
        this.yayinTarihi = yayinTarihi;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }
    public String sureyiDakikaCinsindenGetir(){
        int dakika = sureSaniye / 60;
        int saniye = sureSaniye % 60;
        return dakika + " dakika " + saniye + " saniye";
    }
    public void dinle(){
        dinlenmeSayisi++;
        System.out.println("Podcast Dinlendi. Sıradaki şarkı " + dinlenmeSayisi);
    }
    public void bilgiYazdir(){
        System.out.println("--------Podcast Yayini-------");
        System.out.println("Podcast Başlığı: "+ baslik);
        System.out.println("Sunucu: " + sunucu);
        System.out.println("Süre: " + sureyiDakikaCinsindenGetir());
        System.out.println("Yayın Tarihi: " + yayinTarihi);
        System.out.println("Dinlenme Sayısı: " + dinlenmeSayisi);
        System.out.println();
    }

    public static void main(String[] args) {
        PodcastYayini podcast = new PodcastYayini("Yolculuk Nereye?","Şelçuk Şirin",925,"2025-10-19",20000);
        podcast.sureyiDakikaCinsindenGetir();
        podcast.dinle();
        podcast.bilgiYazdir();
    }

}
