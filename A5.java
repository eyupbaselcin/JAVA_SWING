import javax.swing.*;
import java.awt.*;

public class A5 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setTitle("Ekran arayüzüne hoş geldiniz");
        jf.setSize(500, 500);
        JButton jb=new JButton("login");
        JLabel jl1=new JLabel(); // yeni bir JLabel nesnesi oluşturulur
        // jlabel ekrana yazı yazmak için kullanılan bir bileşendir
        jl1.setText("Değerli kullanıcı, lütfen giriş yapınız");
        jf.getContentPane().setLayout(new FlowLayout());
         // JFrame'in içerik panelinin düzen yöneticisi FlowLayout olarak ayarlanır
        jf.getContentPane().add(jl1); // JLabel, JFrame'in içerik paneline eklenir
        jf.getContentPane().add(jb); // JButton, JFrame'in içerik paneline eklenir
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true); // JFrame görünür hale getirilir
    }
}
