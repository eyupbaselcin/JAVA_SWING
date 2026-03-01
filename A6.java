import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class A6 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setTitle("Ekran arayüzüne hoş geldiniz");
        jf.setSize(500, 500);
        JTextField textField = new JTextField(20); 
        // 20 karakter genişliğinde bir JTextField oluşturulur
        JButton jb=new JButton("login");
        JLabel jl1=new JLabel(); // yeni bir JLabel nesnesi oluşturulur
        // jlabel ekrana yazı yazmak için kullanılan bir bileşendir
        jl1.setText("Değerli kullanıcı, lütfen giriş yapınız");
        jf.getContentPane().setLayout(new FlowLayout());
         // JFrame'in içerik panelinin düzen yöneticisi FlowLayout olarak ayarlanır
        jf.getContentPane().add(jl1); // JLabel, JFrame'in içerik paneline eklenir
        jf.getContentPane().add(textField); // JTextField, JFrame'in içerik paneline eklenir
        jf.getContentPane().add(jb); // JButton, JFrame'in içerik paneline eklenir
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jl1.setText("Kullanıcı adı: "+textField.getText());
            }
        });
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true); // JFrame görünür hale getirilir
    }
}
