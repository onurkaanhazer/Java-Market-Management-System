

public class ÜcretsizMüşteri extends Müşteri
{
     @Override
     public String İsimSoyisim(){
        String s=this.ad+"ücretsiz"+this.soyad;
        return s;
    }
    public ÜcretsizMüşteri()
    {
        
    }

}
