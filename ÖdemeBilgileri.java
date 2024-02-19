

public class ÖdemeBilgileri
{    
    double odenecekTutar;
    String odemeTuru;
    public ÖdemeBilgileri(){
        
    }
    public ÖdemeBilgileri(double odenecekTutar,String odemeTuru)
    {
       this.odenecekTutar=odenecekTutar;
       this.odemeTuru=odemeTuru;
    }
    public double getOdenecekTutar() {
    return odenecekTutar;
}
public void setOdenecekTutar(double odenecekTutar) {
    this.odenecekTutar = odenecekTutar;
}
public String getOdemeTuru() {
    return odemeTuru;
}
public void setOdemeTuru(String odemeTuru) {
    this.odemeTuru = odemeTuru;
}
}
   
