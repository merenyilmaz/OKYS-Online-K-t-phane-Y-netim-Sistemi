public class Kullanici {
    protected String id;
    protected String ad;
    protected String eposta;
    protected String sifre;

    public Kullanici(String id, String ad, String eposta, String sifre) {
        this.id = id;
        this.ad = ad;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }
}