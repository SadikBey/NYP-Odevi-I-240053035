package paket1;

public class AkilliTermostat {
    String marka;
    double mevcutSicaklik;
    double hedefSicaklik;
    String mod;

    public AkilliTermostat(String marka, double mevcutSicaklik, double hedefSicaklik, String mod){
        this.marka = marka;
        this.mevcutSicaklik = mevcutSicaklik;
        this.hedefSicaklik = hedefSicaklik;
        this.mod = mod;
    }

    public void sicaligiArtir(){
        if(mevcutSicaklik < hedefSicaklik){
            double mevcut = mevcutSicaklik;
            double hedef = hedefSicaklik;
            double sonuc = hedef - mevcut;
            System.out.println("Hedef Sıcaklığa Artırıyor: " + sonuc);
        }

        else if(mevcutSicaklik > hedefSicaklik){
            double mevcut = mevcutSicaklik;
            double hedef = hedefSicaklik;
            double sonuc = mevcut - hedef;
            System.out.println("Hedef Sıcaklığa Düşülüyor: " + sonuc);
        }

        else if(mevcutSicaklik == hedefSicaklik){
            System.out.println("Hedef Sıcaklığa Aynıdır: 0");
        }
    }

    public void durumGoster(){
        System.out.println("Termostat Markası: " + marka);
        System.out.println("Termostat Hedef Mevcut Sıcaklığı: " + mevcutSicaklik);
        System.out.println("Termostat Hedef Sıcaklığı: " + hedefSicaklik);
        System.out.println("Termostat Modu: " + mod);
    }

    public static void main(String[] args){
        AkilliTermostat termostat1 = new AkilliTermostat("vestel",86,80,"Isıtma");
        AkilliTermostat termostat2 = new AkilliTermostat("beko",56,40,"Soğutma");
        AkilliTermostat termostat3 = new AkilliTermostat("arzum",86,86,"Kapalı");
        AkilliTermostat termostat4 = new AkilliTermostat("cakee",26,35,"Isıtma");


        System.out.println("========================================");
        termostat1.durumGoster();
        termostat1.sicaligiArtir();
        System.out.println("========================================");
        termostat2.durumGoster();
        termostat2.sicaligiArtir();
        System.out.println("========================================");
        termostat3.durumGoster();
        termostat3.sicaligiArtir();
        System.out.println("========================================");
        termostat4.durumGoster();
        termostat4.sicaligiArtir();
    }
}