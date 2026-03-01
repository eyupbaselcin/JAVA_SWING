import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class A8 {
    public static void main(String[] args) {
        // JFrame oluşturma
        JFrame jf = new JFrame();
        jf.setTitle("Ekran arayüzüne hoş geldiniz");
        jf.setSize(500, 500);

        // buton ve jlabel oluşturma
        JButton jb = new JButton("login");
        JLabel jl1 = new JLabel("Login butonuna tıkladınız"); // yeni bir JLabel nesnesi oluşturulur
        JButton jb2 = new JButton("register");
        JLabel jl2 = new JLabel("Register butonuna tıkladınız"); // yeni bir JLabel nesnesi oluşturulur



        // butonlara action listener ekleme
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jl1.setText("Login butonuna tıkladınız");
                 String veriAl=JOptionPane.showInputDialog(jf, "Lütfen kullanıcı adınızı giriniz");
                 jl1.setText("Kullanıcı adı: "+veriAl);
                 JOptionPane.showMessageDialog(jf, "Giriş işlemi başarılı");
                 // kullanıcıya bilgi vermek için bir mesaj kutusu gösterilir
            }

        });
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jl2.setText("Register butonuna tıkladınız");
                JOptionPane.showMessageDialog(jf, "Kayıt işlemi başarılı");
                 // kullanıcıya bilgi vermek için bir mesaj kutusu gösterilir
            }

        });

        jf.getContentPane().setLayout(new FlowLayout()); // JFrame'in içerik panelinin düzen yöneticisi FlowLayout
                                                         // olarak ayarlanır
        jf.getContentPane().add(jl1); // JLabel, JFrame'in içerik paneline eklenir
        jf.getContentPane().add(jb); // JButton, JFrame'in içerik paneline eklenir
        jf.getContentPane().add(jl2); // JLabel, JFrame'in içerik paneline eklenir
        jf.getContentPane().add(jb2); // JButton, JFrame'in içerik paneline eklenir

        // ekran düzeni ve son işlemler
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
}
