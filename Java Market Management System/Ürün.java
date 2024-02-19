

public class Ürün
{
    int urunID;
    String barkod;
    String urunAdi;
    String urunGrubu;
    String ureticiMarka;
    String tedarikci;
    String satisBirimi;
    double birimFiyat;
    int stokMiktari;
    int subekodu;
    
    public Ürün()
    {
    
    }
    public Ürün(int urunID,String barkod,String urunAdi,String urunGrubu,
    String ureticiMarka,String tedarikci,String satisBirimi,double birimFiyat,
    int stokMiktari,int subekodu)
    {
        this.urunID=urunID;
        this.barkod=barkod;
        this.urunAdi=urunAdi;
        this.urunGrubu=urunGrubu;
        this.ureticiMarka=ureticiMarka;
        this.tedarikci=tedarikci;
        this.satisBirimi=satisBirimi;
        this.birimFiyat=birimFiyat;
        this.stokMiktari=stokMiktari;
        this.subekodu=subekodu;
        
    }
    public void ekranaYazdir() {
        System.out.println("Ürün ID: " + urunID);
        System.out.println("Barkod: " + barkod);
    }

public int geturunID(){
        return this.urunID;
    } public void seturunID(int urunıd){
        this.urunID=urunıd;
    }
    public String getBarkod() {
    return barkod;
}
public void setBarkod(String barkod) {
    this.barkod = barkod;
}
public String getUrunAdi() {
    return urunAdi;
}
public void setUrunAdi(String urunAdi) {
    this.urunAdi = urunAdi;
}
public String getUrunGrubu() {
    return urunGrubu;
}
public void setUrunGrubu(String urunGrubu) {
    this.urunGrubu = urunGrubu;
}
public String getUreticiMarka() {
    return ureticiMarka;
}
public void setUreticiMarka(String ureticiMarka) {
    this.ureticiMarka = ureticiMarka;
}
public String getTedarikci() {
    return tedarikci;
}
public void setTedarikci(String tedarikci) {
    this.tedarikci = tedarikci;
}
public String getSatisBirimi() {
    return satisBirimi;
}
public void setSatisBirimi(String satisBirimi) {
    this.satisBirimi = satisBirimi;
}
public double getBirimFiyat() {
    return birimFiyat;
}
public void setBirimFiyat(double birimFiyat) {
    this.birimFiyat = birimFiyat;
}
public int getStokMiktari() {
    return stokMiktari;
}
public void setStokMiktari(int stokMiktari) {
    this.stokMiktari = stokMiktari;
}
public int getSubekodu() {
    return subekodu;
}
public void setSubekodu(int subekodu) {
    this.subekodu = subekodu;
}
    
}
