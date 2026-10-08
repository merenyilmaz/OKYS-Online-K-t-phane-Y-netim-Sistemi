
import java.util.Date;

public class OduncKaydi {
    private String islemNo;
    private Date oduncTarihi;
    private Date sonTeslimTarihi;
    private Date teslimTarihi;
    
    
    private Uye uye;
    private KitapKopyasi kopya;

    public OduncKaydi(String islemNo, Date oduncTarihi, Date sonTeslimTarihi, Uye uye, KitapKopyasi kopya) {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.uye = uye;
        this.kopya = kopya;
    }

    public String getIslemNo() { return islemNo; }
    public Uye getUye() { return uye; }
    public KitapKopyasi getKopya() { return kopya; }
}