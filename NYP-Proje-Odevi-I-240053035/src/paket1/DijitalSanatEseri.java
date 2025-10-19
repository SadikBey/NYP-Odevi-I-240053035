package paket1;

import java.util.UUID;

public class DijitalSanatEseri {
    String eserAdi;
    String sanatci;
    String olusturmaYili;
    String teknik;
    String benzersizId;

    // Constructor artık sadece 4 parametre alıyor, ID otomatik oluşturuluyor
    public DijitalSanatEseri(String eserAdi, String sanatci, String olusturmaYili, String teknik){
        this.eserAdi = eserAdi;
        this.sanatci = sanatci;
        this.olusturmaYili = olusturmaYili;
        this.teknik = teknik;
        this.benzersizId = UUID.randomUUID().toString(); // Otomatik ID üretimi
    }

    public void eserKunyesiniGoster(){
        System.out.println("-------Dijital Sanat Eseri Kunyesi----------");
        System.out.println("Eser Adı: " + eserAdi);
        System.out.println("Sanatçının Adı: " + sanatci);
        System.out.println("Oluşturma Yılı: " + olusturmaYili);
        System.out.println("Teknik: " + teknik);
        System.out.println("Benzersiz ID: " + benzersizId);
    }

    public void idYenile(){
        benzersizId = UUID.randomUUID().toString();
        System.out.println("Yeni benzersiz ID oluşturuldu: " + benzersizId);
    }

    public static void main(String[] args) {
        DijitalSanatEseri djt = new DijitalSanatEseri("Yolculuk Nereye?", "Şelçuk Şirin", "20 Nisan 2021", "Sesli Röportaj");
        djt.eserKunyesiniGoster();
        djt.idYenile();

    }
}