import java.awt.*;
import java.lang.classfile.instruction.StackInstruction;
import java.util.Scanner;

import javax.swing.*;


public class A7 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // JFrame
        JFrame jf=new JFrame();
        jf.setTitle("İKİ butonlu ekran");
        jf.setSize(300, 300);

        // JButtons
        JButton jb1=new JButton("Buton 1"); // buton1 ismini verdik
        JButton jb2=new JButton("Buton 2"); // buton2 ismini verdik
        JButton jb3=new JButton();
        System.out.println("3. butonun ismini giriniz: ");
        jb3.setText(sc.nextLine()); // bu butonun ismini daha sonra ekledik
        /*String button3Name=sc.nextLine(); // buton3'ün ismini button3Name değişkenine atadık
        jb3.setText(button3Name); // buton3'ün ismini button3Name değişkenine atadık*/


        // Jlabels
        JLabel jl1=new JLabel(); // jlabel1
        jl1.setText("Buton 1'e tıklarsanız bu yazı değişir"); // jlabel1'e yazı eklenir
        JLabel jl2=new JLabel(); // jlabel2
        jl2.setText("Buton 2'ye tıklarsanız bu yazı değişir"); // jlabel2'ye yazı eklenir
        JLabel jl3=new JLabel(); // jlabel3
        System.out.println("3. jlabel'ın yazısını giriniz: ");
        jl3.setText(sc.nextLine()); // jlabel3'e yazı eklenir


        // ekran düzeni
        jf.getContentPane().setLayout(new FlowLayout()); //ekran düzeni FlowLayout olarak ayarlanır
        jf.getContentPane().add(jb1); // buton1 ekrana eklenir
        jf.getContentPane().add(jb2); // buton2 ekrana eklenir
        jf.getContentPane().add(jb3); // buton3 ekrana eklenir
        jf.getContentPane().add(jl1); // jlabel1 ekrana eklenir
        jf.getContentPane().add(jl2); // jlabel2 ekrana eklenir
        jf.getContentPane().add(jl3); // jlabel3 ekrana eklenir
        

        // zorunlu kısım
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame'in kapanma işlemi ayarlanır
        jf.setVisible(true); // ekranda görünür hale getirilir
    }
}
