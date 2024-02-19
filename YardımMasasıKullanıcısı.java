

public class YardımMasasıKullanıcısı
{
    int YMkullaniciID;
    String YMad;
    String YMsoyad;
    String YMkullaniciAdi;
    String YMkullaniciRolü;
    String YMkullaniciKriptoluSifre;
    public YardımMasasıKullanıcısı(){
        
    }
    public YardımMasasıKullanıcısı(int yMkullaniciID, String yMad, String yMsoyad, String yMkullaniciAdi, String yMkullaniciRolü,
        String yMkullaniciKriptoluSifre) {
    this.YMkullaniciID = yMkullaniciID;
    this.YMad = yMad;
    this.YMsoyad = yMsoyad;
    this.YMkullaniciAdi = yMkullaniciAdi;
    this.YMkullaniciRolü = yMkullaniciRolü;
    this.YMkullaniciKriptoluSifre = yMkullaniciKriptoluSifre;
}
public int getYMkullaniciID() {
    return YMkullaniciID;
}
public void setYMkullaniciID(int yMkullaniciID) {
    YMkullaniciID = yMkullaniciID;
}
public String getYMad() {
    return YMad;
}
public void setYMad(String yMad) {
    YMad = yMad;
}
public String getYMsoyad() {
    return YMsoyad;
}
public void setYMsoyad(String yMsoyad) {
    YMsoyad = yMsoyad;
}
public String getYMkullaniciAdi() {
    return YMkullaniciAdi;
}
public void setYMkullaniciAdi(String yMkullaniciAdi) {
    YMkullaniciAdi = yMkullaniciAdi;
}
public String getYMkullaniciRolü() {
    return YMkullaniciRolü;
}
public void setYMkullaniciRolü(String yMkullaniciRolü) {
    YMkullaniciRolü = yMkullaniciRolü;
}
public String getYMkullaniciKriptoluSifre() {
    return YMkullaniciKriptoluSifre;
}
public void setYMkullaniciKriptoluSifre(String yMkullaniciKriptoluSifre) {
    YMkullaniciKriptoluSifre = yMkullaniciKriptoluSifre;
}
   
}
