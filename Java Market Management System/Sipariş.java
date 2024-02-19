import java.util.Date;


public class Sipariş
{
    int siparisID;
    int urunID;
    int musteriID;
    int siparisMiktari;
    double odenecekTutar;
    Date siparisTarihi;
    String siparisDurumu;
    String teslimAdresi;
    
    public Sipariş(){
        
    }
    
    public Sipariş(int siparisID,int urunID,int musteriID,int siparisMiktari
    ,double odenecekTutar,Date siparisTarihi,String siparisDurumu,String teslimAdresi)
    {
        this.siparisID = siparisID;
        this.urunID = urunID;
        this.musteriID = musteriID;
        this.siparisMiktari = siparisMiktari;
        this.odenecekTutar = odenecekTutar;
        this.siparisTarihi = siparisTarihi;
        this.siparisDurumu = siparisDurumu;
        this.teslimAdresi = teslimAdresi;
    }
    public int getSiparisID() {
    return siparisID;
}
public void setSiparisID(int siparisID) {
    this.siparisID = siparisID;
}
public int getUrunID() {
    return urunID;
}
public void setUrunID(int urunID) {
    this.urunID = urunID;
}
public int getMusteriID() {
    return musteriID;
}
public void setMusteriID(int musteriID) {
    this.musteriID = musteriID;
}
public int getSiparisMiktari() {
    return siparisMiktari;
}
public void setSiparisMiktari(int siparisMiktari) {
    this.siparisMiktari = siparisMiktari;
}
public double getOdenecekTutar() {
    return odenecekTutar;
}
public void setOdenecekTutar(double odenecekTutar) {
    this.odenecekTutar = odenecekTutar;
}
public Date getSiparisTarihi() {
    return siparisTarihi;
}
public void setSiparisTarihi(Date siparisTarihi) {
    this.siparisTarihi = siparisTarihi;
}
public String getSiparisDurumu() {
    return siparisDurumu;
}
public void setSiparisDurumu(String siparisDurumu) {
    this.siparisDurumu = siparisDurumu;
}
public String getTeslimAdresi() {
    return teslimAdresi;
}
public void setTeslimAdresi(String teslimAdresi) {
    this.teslimAdresi = teslimAdresi;
}
public void ekranaYazdirIDveTeslimAdresi() {
        System.out.println("Sipariş ID: " + siparisID);
        System.out.println("Teslim Adresi: " + teslimAdresi);
    }

   
}
