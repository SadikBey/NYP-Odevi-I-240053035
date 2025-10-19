package paket1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProjeGorevi {

    private String gorevBasligi;
    private String sorumluKisi;
    private String oncelik; // "Yüksek", "Orta", "Düşük"
    private LocalDate sonTeslimTarihi;
    private boolean tamamlandiMi;


    public ProjeGorevi(String gorevBasligi, String sorumluKisi, String oncelik, LocalDate sonTeslimTarihi) {
        this.gorevBasligi = gorevBasligi;
        this.sorumluKisi = sorumluKisi;
        this.oncelik = oncelik;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.tamamlandiMi = false; // başlangıçta tamamlanmamış
    }


    public void goreviTamamla() {
        this.tamamlandiMi = true;
    }


    public void sorumluDegistir(String yeniSorumlu) {
        this.sorumluKisi = yeniSorumlu;
    }


    public long kalanGunSayisiniHesapla() {
        LocalDate bugun = LocalDate.now();
        return ChronoUnit.DAYS.between(bugun, sonTeslimTarihi);
    }


    public String getGorevBasligi() {
        return gorevBasligi;
    }

    public String getSorumluKisi() {
        return sorumluKisi;
    }

    public String getOncelik() {
        return oncelik;
    }

    public LocalDate getSonTeslimTarihi() {
        return sonTeslimTarihi;
    }

    public boolean isTamamlandiMi() {
        return tamamlandiMi;
    }

    public static void main(String[] args) {

        ProjeGorevi gorev1 = new ProjeGorevi(
                "Rapor Hazırlama",
                "Sadık",
                "Çetin",
                LocalDate.of(2022, 10, 2)
        );


        System.out.println("Görev Başlığı: " + gorev1.getGorevBasligi());
        System.out.println("Sorumlu Kişi: " + gorev1.getSorumluKisi());
        System.out.println("Öncelik: " + gorev1.getOncelik());
        System.out.println("Son Teslim Tarihi: " + gorev1.getSonTeslimTarihi());
        System.out.println("Tamamlandı mı?: " + gorev1.isTamamlandiMi());
        System.out.println("Kalan Gün: " + gorev1.kalanGunSayisiniHesapla());

        System.out.println("\n--- Güncellemeler ---");


        gorev1.sorumluDegistir("Muhammet");
        System.out.println("Yeni Sorumlu: " + gorev1.getSorumluKisi());


        gorev1.goreviTamamla();
        System.out.println("Tamamlandı mı?: " + gorev1.isTamamlandiMi());
    }
}
