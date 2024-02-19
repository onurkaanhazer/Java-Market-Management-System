

public class Yönetici
{
    int yKullaniciID;
    String Yad;
    String Ysoyad;
    public Yönetici(){
        
    }
    
public Yönetici(int yKullaniciID,String Yad,String Ysoyad)
    {
        this.yKullaniciID=yKullaniciID;
        this.Yad=Yad;
        this.Ysoyad=Ysoyad;
    }
    public int getyKullaniciID() {
    return yKullaniciID;
}
public void setyKullaniciID(int yKullaniciID) {
    this.yKullaniciID = yKullaniciID;
}
public String getYad() {
    return Yad;
}
public void setYad(String yad) {
    Yad = yad;
}
public String getYsoyad() {
    return Ysoyad;
}
public void setYsoyad(String ysoyad) {
    Ysoyad = ysoyad;
}
   
}
