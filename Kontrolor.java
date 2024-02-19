

public class Kontrolor
{   
    Ürün urun;
    Müşteri musteri;
    Sipariş siparis;
    Yönetici yonetici;
    ÖdemeBilgileri odemebilgileri;
    YazılımKullanıcı yazılımkullanıcı;
    YardımMasasıKullanıcısı yardımMasasıkullanıcısı;
    MusteriGUI guı;
    SiparisGUI guı1;
    YazilimKullaniciGUI guı2;
    UrunGUI guı3;
    public Kontrolor()
    {
       urun=new Ürün();
       musteri=new Müşteri();
       siparis=new Sipariş();
       yonetici=new Yönetici();
       odemebilgileri=new ÖdemeBilgileri();
       yazılımkullanıcı=new YazılımKullanıcı();
       yardımMasasıkullanıcısı=new YardımMasasıKullanıcısı();
       guı=new MusteriGUI();
       guı1=new SiparisGUI ();
       guı2=new YazilimKullaniciGUI();
       guı3=new UrunGUI();
    }

  }
