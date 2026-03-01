import javax.swing.JFrame;

public class A1{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame(); // yeni bir JFrame nesnesi oluşturulur 
        //create a new JFrame object
        frame.setTitle("İLK başlık"); // JFrame'in başlığı "İLK başlık" olarak ayarlanır
        //set the title of the JFrame to "İLK başlık"
        frame.setSize(400, 300); // JFrame'in boyutu 400x300 piksel olarak ayarlanır
        //set the size of the JFrame to 400x300 pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame'in kapatılma işlemi sırasında programın sonlandırılması sağlanır
        //set the default close operation of the JFrame to EXIT_ON_CLOSE, which will terminate the
        frame.setVisible(true); // JFrame görünür hale getirilir
        //make the JFrame visible
    }
}

