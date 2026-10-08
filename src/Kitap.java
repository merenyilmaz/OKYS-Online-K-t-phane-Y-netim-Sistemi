
import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;
    
   
    private List<KitapKopyasi> fizikselKopyalar;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili, String durum) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
        this.fizikselKopyalar = new ArrayList<>();
    }

  
    public void kopyaEkle(KitapKopyasi kopya) {
        this.fizikselKopyalar.add(kopya);
        kopya.setKitap(this); 
    }

    public String getBaslik() {
        return baslik;
    }
}