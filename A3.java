import javax.swing.*;
// buton ve textfield kullandık burada


public class A3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // yeni bir JFrame nesnesi oluşturulur
        frame.setTitle("Ekran arayüzüne hoş geldiniz"); 
        // JFrame'in başlığı "Ekran arayüzüne hoş geldiniz" olarak ayarlanır
        frame.setSize(500, 500); // JFrame'in boyutu 500x500 piksel olarak ayarlanır
        frame.setLocation(500,300); // JFrame'in ekranın ortasına konumlandırılması sağlanır"
        frame.getContentPane().setLayout(new java.awt.FlowLayout()); 
        // JFrame'in içerik panelinin düzen yöneticisi FlowLayout olarak ayarlanır
        // flowlayout, bileşenlerin sırayla eklenmesini sağlar
        JTextField textField = new JTextField(20); // 20 karakter genişliğinde bir JTextField oluşturulur
        // create a new JTextField with a width of 20 characters
        JButton button = new JButton(" 20 karakter genişliğinde bir metin yaz"); 
        // "20 karakter genişliğinde bir metin yaz" yazılı bir JButton oluşturulur
        frame.getContentPane().add(textField); // JTextField, JFrame'in içerik paneline eklenir
        frame.getContentPane().add(button); // JButton, JFrame'in içerik paneline eklenir
        frame.setVisible(true); // JFrame görünür hale getirilir
    }
}
