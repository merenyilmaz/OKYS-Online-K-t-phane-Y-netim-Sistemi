public class KitapKopyasi {
    private String barkod;
  
    private Kitap kitap; 

    public KitapKopyasi(String barkod) {
        this.barkod = barkod;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public String getBarkod() {
        return barkod;
    }
}