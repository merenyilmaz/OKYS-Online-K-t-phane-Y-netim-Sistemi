
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("978-605-123-45", "Nesne Yönelimli Programlama", "Taner Dursun", 2024, "Ödünç Verilebilir");
        
        KitapKopyasi kopya1 = new KitapKopyasi("BRKOD-1201");
        kitap1.kopyaEkle(kopya1);
        System.out.println("Kitap eklendi: " + kitap1.getBaslik() + " - Barkod: " + kopya1.getBarkod());

        Uye uye1 = new Uye("0001", "mustafa eren yılmaz", "erenyilmaz@gmail.com", "1234");
        System.out.println("Yeni üye sisteme giriş yaptı: " + uye1.getAd());

        Date bugun = new Date();
        Date haftaya = new Date(bugun.getTime() + (7 * 24 * 60 * 60 * 1000));
        
        OduncKaydi kayit1 = new OduncKaydi("ISL-123", bugun, haftaya, uye1, kopya1);
        uye1.oduncEkle(kayit1);
        
        System.out.println("\n--- Ödünç İşlemi Tamamlandı ---");
        System.out.println("İşlem No: " + kayit1.getIslemNo());
        System.out.println("Üye: " + kayit1.getUye().getAd());
        System.out.println("Ödünç Alınan Kitap: " + kayit1.getKopya().getKitap().getBaslik());
    }
}