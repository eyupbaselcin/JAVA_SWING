import javax.swing.JButton;
import javax.swing.JFrame;

public class A4 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setTitle("Ekran arayüzüne hoş geldiniz");
        jf.setSize(500, 500);
        JButton jb=new JButton("login");
        jf.getContentPane().setLayout(new java.awt.FlowLayout());
         // JFrame'in içerik panelinin düzen yöneticisi FlowLayout olarak ayarlanır
        jf.getContentPane().add(jb); // JButton, JFrame'in içerik paneline eklenir
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true); // JFrame görünür hale getirilir
    }
}
