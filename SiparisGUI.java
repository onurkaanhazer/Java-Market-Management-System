import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SiparisGUI extends JFrame {
    private JTextField siparisIDField, urunIDField, musteriIDField, siparisMiktariField,
            odenecekTutarField, siparisTarihiField, siparisDurumuField, teslimAdresiField;

    public SiparisGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Sipariş Bilgileri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2));

        add(new JLabel("Sipariş ID:"));
        siparisIDField = new JTextField();
        add(siparisIDField);

        add(new JLabel("Ürün ID:"));
        urunIDField = new JTextField();
        add(urunIDField);

        add(new JLabel("Müşteri ID:"));
        musteriIDField = new JTextField();
        add(musteriIDField);

        add(new JLabel("Sipariş Miktarı:"));
        siparisMiktariField = new JTextField();
        add(siparisMiktariField);

        add(new JLabel("Ödenecek Tutar:"));
        odenecekTutarField = new JTextField();
        add(odenecekTutarField);

        add(new JLabel("Sipariş Tarihi:"));
        siparisTarihiField = new JTextField();
        add(siparisTarihiField);

        add(new JLabel("Sipariş Durumu:"));
        siparisDurumuField = new JTextField();
        add(siparisDurumuField);

        add(new JLabel("Teslim Adresi:"));
        teslimAdresiField = new JTextField();
        add(teslimAdresiField);

         JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // "Kaydet" butonuna tıklandığında yapılacak işlemler burada
                System.out.println("Sipariş bilgileri kaydedildi.");
            }
        });
        add(kaydetButton);
       
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
 
}
