import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusteriGUI extends JFrame {
    private JTextField musteriIDField, adField, soyadField, krediKartNumarasiField,
            cinsiyetField, cepTelefonuField, epostaField, adresField, musteriKriptoluSifreField;

    public MusteriGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Müşteri Bilgileri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2));

        add(new JLabel("Müşteri ID:"));
        musteriIDField = new JTextField();
        add(musteriIDField);

        add(new JLabel("Ad:"));
        adField = new JTextField();
        add(adField);

        add(new JLabel("Soyad:"));
        soyadField = new JTextField();
        add(soyadField);

        add(new JLabel("Kredi Kart Numarası:"));
        krediKartNumarasiField = new JTextField();
        add(krediKartNumarasiField);

        add(new JLabel("Cinsiyet:"));
        cinsiyetField = new JTextField();
        add(cinsiyetField);

        add(new JLabel("Cep Telefonu:"));
        cepTelefonuField = new JTextField();
        add(cepTelefonuField);

        add(new JLabel("Eposta:"));
        epostaField = new JTextField();
        add(epostaField);

        add(new JLabel("Adres:"));
        adresField = new JTextField();
        add(adresField);

        add(new JLabel("Müşteri Kriptolu Şifre:"));
        musteriKriptoluSifreField = new JTextField();
        add(musteriKriptoluSifreField);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Müşteri bilgileri kaydedildi.");
            }
        });
        add(kaydetButton);
    

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   

    
}
