
public class Müşteri
{
    int musteriID;
    String ad;
    String soyad;
    String krediKartNumarası;
    String cinsiyet;
    String cepTelefonu;
    String eposta;
    String adres;
    String musteriKriptoluSifre;
    
    public Müşteri(){
    }
    
    
    public Müşteri(int musteriID,String ad,String soyad,String krediKartNumarası
    ,String cinsiyet,String cepTelefonu,String eposta,String adres
    ,String musteriKriptoluSifre)
    {
      this.musteriID=musteriID;
      this.ad=ad;
      this.soyad=soyad;
      this.krediKartNumarası=krediKartNumarası;
      this.cinsiyet=cinsiyet;
      this.cepTelefonu=cepTelefonu;
      this.eposta=eposta;
      this.adres=adres;
      this.musteriKriptoluSifre=musteriKriptoluSifre;
      
    }
    public String İsimSoyisim(){
        String s=this.ad+this.soyad;
        return s;
    }
    public int getMusteriID() {
    return musteriID;
}
public void setMusteriID(int musteriID) {
    this.musteriID = musteriID;
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
public String getKrediKartNumarası() {
    return krediKartNumarası;
}
public void setKrediKartNumarası(String krediKartNumarası) {
    this.krediKartNumarası = krediKartNumarası;
}
public String getCinsiyet() {
    return cinsiyet;
}
public void setCinsiyet(String cinsiyet) {
    this.cinsiyet = cinsiyet;
}
public String getCepTelefonu() {
    return cepTelefonu;
}
public void setCepTelefonu(String cepTelefonu) {
    this.cepTelefonu = cepTelefonu;
}
public String getEposta() {
    return eposta;
}
public void setEposta(String eposta) {
    this.eposta = eposta;
}
public String getAdres() {
    return adres;
}
public void setAdres(String adres) {
    this.adres = adres;
}
public String getMusteriKriptoluSifre() {
    return musteriKriptoluSifre;
}
public void setMusteriKriptoluSifre(String musteriKriptoluSifre) {
    this.musteriKriptoluSifre = musteriKriptoluSifre;
}
 public void ekranaYazdirAdSoyad() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
    }
    
    
}
