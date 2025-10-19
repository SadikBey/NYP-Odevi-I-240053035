package paket2;

public class Main {
    public static void main(String[] args) {

        Kullanici kullanici = new Kullanici(1, "ahmet", "12345hash", "ahmet@example.com");

        Adres evAdresi = new Adres("Ev Adresim", "İzmir", "Bornova", "123. Sokak No:45");
        kullanici.adresEkle(evAdresi);

        System.out.println("=== Kullanıcı Bilgileri ===");
        kullanici.bilgileriGoster();

        Kategori elektronik = new Kategori(1, "Elektronik");
        Urun telefon = new Urun(101, "Akıllı Telefon", "128GB hafıza", 15000, 10, elektronik);
        Urun kulaklik = new Urun(102, "Kulaklık", "Bluetooth kulaklık", 2000, 20, elektronik);

        Sepet sepet = new Sepet(kullanici);
        sepet.sepeteEkle(telefon, 1);
        sepet.sepeteEkle(kulaklik, 2);

        System.out.println("\n=== Sepet Özeti ===");
        System.out.println("Toplam Tutar: " + sepet.toplamTutariHesapla() + " TL");

        Siparis siparis = new Siparis(5001, evAdresi);
        siparis.siparisKalemiEkle(new SiparisKalemi(telefon, 1));
        siparis.siparisKalemiEkle(new SiparisKalemi(kulaklik, 2));

        System.out.println("\n=== Sipariş Özeti ===");
        siparis.siparisOzetiniGoster();

        Odeme odeme = new Odeme(9001, siparis, "Kredi Kartı", siparis.toplamTutar);
        odeme.odemeOnayla();

        System.out.println("\n=== Ödeme Bilgileri ===");
        odeme.odemeBilgileriniGoster();
    }
}