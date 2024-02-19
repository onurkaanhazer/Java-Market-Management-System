

public class ÜcretliMüşteri extends Müşteri
{   
    
    
    @Override
     public String İsimSoyisim(){
        String s=this.ad+"ücretli "+this.soyad;
        return s;
    }
    
    
    
    public ÜcretliMüşteri()
    {
        
    }

    
}
