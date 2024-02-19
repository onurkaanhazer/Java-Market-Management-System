import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UrunGUI extends JFrame {
    private JTextField urunIDField, barkodField, urunAdiField, urunGrubuField,
            ureticiMarkaField, tedarikciField, satisBirimiField, birimFiyatField,
            stokMiktariField, subeKoduField;

    public UrunGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Ürün Bilgileri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(11, 2));

        add(new JLabel("Ürün ID:"));
        urunIDField = new JTextField();
        add(urunIDField);

        add(new JLabel("Barkod:"));
        barkodField = new JTextField();
        add(barkodField);

        add(new JLabel("Ürün Adı:"));
        urunAdiField = new JTextField();
        add(urunAdiField);

        add(new JLabel("Ürün Grubu:"));
        urunGrubuField = new JTextField();
        add(urunGrubuField);

        add(new JLabel("Üretici Marka:"));
        ureticiMarkaField = new JTextField();
        add(ureticiMarkaField);

        add(new JLabel("Tedarikçi:"));
        tedarikciField = new JTextField();
        add(tedarikciField);

        add(new JLabel("Satış Birimi:"));
        satisBirimiField = new JTextField();
        add(satisBirimiField);

        add(new JLabel("Birim Fiyat:"));
        birimFiyatField = new JTextField();
        add(birimFiyatField);

        add(new JLabel("Stok Miktarı:"));
        stokMiktariField = new JTextField();
        add(stokMiktariField);

        add(new JLabel("Şube Kodu:"));
        subeKoduField = new JTextField();
        add(subeKoduField);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // "Kaydet" butonuna tıklandığında yapılacak işlemler burada
                System.out.println("ürün bilgileri kaydedildi.");
            }
        });
        add(kaydetButton);
       

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    

}
