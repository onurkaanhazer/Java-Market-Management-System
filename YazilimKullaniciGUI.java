import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YazilimKullaniciGUI extends JFrame {
    private JTextField kullaniciIDField, adField, soyadField, kullaniciRoluField,
            kullaniciAdiField, kullaniciKriptoluSifreField;

    public YazilimKullaniciGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Yazılım Kullanıcı Bilgileri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        add(new JLabel("Kullanıcı ID:"));
        kullaniciIDField = new JTextField();
        add(kullaniciIDField);

        add(new JLabel("Ad:"));
        adField = new JTextField();
        add(adField);

        add(new JLabel("Soyad:"));
        soyadField = new JTextField();
        add(soyadField);

        add(new JLabel("Kullanıcı Rolü:"));
        kullaniciRoluField = new JTextField();
        add(kullaniciRoluField);

        add(new JLabel("Kullanıcı Adı:"));
        kullaniciAdiField = new JTextField();
        add(kullaniciAdiField);

        add(new JLabel("Kullanıcı Kriptolu Şifre:"));
        kullaniciKriptoluSifreField = new JTextField();
        add(kullaniciKriptoluSifreField);

        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // "Kaydet" butonuna tıklandığında yapılacak işlemler burada
                System.out.println("Yazılım kullanıcı bilgileri kaydedildi.");
            }
        });
        add(kaydetButton);
     

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

  

 
}
