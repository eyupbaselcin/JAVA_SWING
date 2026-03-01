import javax.swing.JFrame;
public class A2 {
    public static void main(String[] args) {
        JFrame  frame = new JFrame(); // yeni bir JFrame nesnesi oluşturulur
        frame.setTitle("Ekran arayüzüne hoş geldiniz");
        // JFrame'in başlığı "Ekran arayüzüne hoş geldiniz" olarak ayarlanır
        frame.setSize(500, 500); // JFrame'in boyutu 500x500 piksel olarak ayarlanır
        frame.setLocation(500,300); // JFrame'in ekranın ortasına konumlandırılması sağlanır"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame'in kapatılma işlemi sırasında programın sonlandırılması sağlanır
        frame.setResizable(false); 
        // JFrame'in boyutunun değiştirilmesi engellenir,true ise kullanıcı tarafından boyutu değiştirilebilir
        frame.setVisible(true); // JFrame görünür hale getirilir
    }
}
