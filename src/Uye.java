
import java.util.ArrayList;
import java.util.List;

public class Uye extends Kullanici {
    private List<OduncKaydi> oduncListesi;

    public Uye(String id, String ad, String eposta, String sifre) {
        super(id, ad, eposta, sifre);
        this.oduncListesi = new ArrayList<>();
    }

    public void oduncEkle(OduncKaydi kayit) {
        this.oduncListesi.add(kayit);
    }

    public List<OduncKaydi> getOduncListesi() {
        return oduncListesi;
    }
}