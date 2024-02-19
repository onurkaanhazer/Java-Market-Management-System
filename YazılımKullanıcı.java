

public class YazılımKullanıcı
{
    int kullaniciID;
    String ad;
    String soyad;
    String kullaniciRolu;
    String kullaniciAdi;
    String kullaniciKriptoluSifre;
    public YazılımKullanıcı(){
        
    }
    public YazılımKullanıcı(int kullaniciID,String ad,String soyad,String kullaniciRolu,
    String kullaniciAdi,String kullaniciKriptoluSifre)
    {
        this.kullaniciID=kullaniciID;
        this.ad=ad;
        this.soyad=soyad;
        this.kullaniciRolu=kullaniciRolu;
        this.kullaniciAdi=kullaniciAdi;
        this.kullaniciKriptoluSifre=kullaniciKriptoluSifre;
       
    }
public int getKullaniciID() {
    return kullaniciID;
}
public void setKullaniciID(int kullaniciID) {
    this.kullaniciID = kullaniciID;
}
public String getAd() {
    return ad;
}
public void setAd(String ad) {
    this.ad = ad;
}
public String getSoyad() {
    return soyad;
}
public void setSoyad(String soyad) {
    this.soyad = soyad;
}
public String getKullaniciRolu() {
    return kullaniciRolu;
}
public void setKullaniciRolu(String kullaniciRolu) {
    this.kullaniciRolu = kullaniciRolu;
}
public String getKullaniciAdi() {
    return kullaniciAdi;
}
public void setKullaniciAdi(String kullaniciAdi) {
    this.kullaniciAdi = kullaniciAdi;
}
public String getKullaniciKriptoluSifre() {
    return kullaniciKriptoluSifre;
}
public void setKullaniciKriptoluSifre(String kullaniciKriptoluSifre) {
    this.kullaniciKriptoluSifre = kullaniciKriptoluSifre;
}
 public void ekranaYazdirAdSoyad() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
    }   

}
