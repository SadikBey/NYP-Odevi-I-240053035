package paket1;

import java.util.ArrayList;

class Renk {
    String paletAdi;
    String renkler;

    Renk(String paletAdi, String renkler) {
        this.paletAdi = paletAdi;
        this.renkler = renkler;
    }

    public String toString() {
        return paletAdi + " (" + renkler + ")";
    }
}

public class RenkPaleti {
    String paletAdi;
    ArrayList<Renk> renkler;

    public RenkPaleti(String paletAdi) {
        this.paletAdi = paletAdi;
        this.renkler = new ArrayList<>();
    }

    public void renkEkle(String paletAdi, String renklerKod) {
        this.renkler.add(new Renk(paletAdi, renklerKod));
        System.out.println(paletAdi + " (" + renklerKod + ") palete eklendi.");
    }

    public void renkCikar(String paletAdi) {
        boolean bulundu = false;
        for (Renk r : new ArrayList<>(renkler)) {
            if (r.paletAdi.equalsIgnoreCase(paletAdi)) {
                renkler.remove(r);
                System.out.println(paletAdi + " paletten çıkarıldı.");
                bulundu = true;
                break;
            }
        }
        if (!bulundu) {
            System.out.println(paletAdi + " bulunamadı.");
        }
    }

    public void tumRenkleriSil() {
        renkler.clear();
        System.out.println("Tüm renkler silindi.");
    }

    public void paletiGoster() {
        System.out.println("Palet adı: " + paletAdi);
        if (renkler.isEmpty()) {
            System.out.println("Palet boş.");
        } else {
            System.out.println("Renkler:");
            for (Renk r : renkler) {
                System.out.println("- " + r);
            }
        }
    }

    public static void main(String[] args) {
        RenkPaleti palet = new RenkPaleti("Canlı Renkler");
        System.out.println("========================================");
        palet.renkEkle("Kırmızı", "#FF0000");
        palet.renkEkle("Mavi", "#0000FF");
        palet.renkEkle("Yeşil", "#00FF00");
        System.out.println("========================================");
        palet.paletiGoster();
        System.out.println("========================================");
        palet.renkCikar("Mavi");
        palet.paletiGoster();
        System.out.println("========================================");
        palet.tumRenkleriSil();
        palet.paletiGoster();
    }
}
