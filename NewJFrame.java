

/**
 *
 * @author TA
 */
public class NewJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName()); 
    // bu sınıf için bir logger oluşturulur
    public NewJFrame() {
        initComponents(); // GUI bileşenlerini başlatır
        jLabel1.setText(""); // jLabel1'in metni boş olarak ayarlanır
    }
    @SuppressWarnings("unchecked") // Bu, derleyici uyarılarını bastırmak için kullanılan bir notasyondur
        private void initComponents() { // GUI bileşenlerini başlatır

        jButton1 = new javax.swing.JButton(); // jButton1
        jButton2 = new javax.swing.JButton(); // jButton2
        jLabel1 = new javax.swing.JLabel(); // jLabel1

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Evet"); // jButton1'in metni "Evet" olarak ayarlanır
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() { // jButton1'e bir MouseListener eklenir
            public void mouseEntered(java.awt.event.MouseEvent evt) { // jButton1'e fare girdiğinde çalışacak olan olay işleyicisi
                jButton1MouseEntered(evt); // jButton1MouseEntered metodunu çağırır
            }
        });

        jButton2.addActionListener(this::jButton2ActionPerformed); // jButton2'ye bir ActionListener eklenir, jButton2'ye tıklandığında çalışacak olan olay işleyicisi

        jLabel1.setText("jLabel1"); // jLabel1'in metni "jLabel1" olarak ayarlanır

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack(); // Bu, pencerenin boyutunu içindeki bileşenlere göre otomatik olarak ayarlar
    }

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {// ilk olarak jButton1'e fare girdiğinde çalışacak olan olay işleyicisi
        jButton2.setText("Merhaba"); // jButton2'nin metni "Merhaba" olarak değiştirilir
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// jButton2'ye tıklandığında çalışacak olan olay işleyicisi
        jLabel1.setText("Label Texti değişti");
    }

    /**
     * @param args bu metodun parametresi olarak bir String dizisi alır, genellikle komut satırı argümanlarını içerir
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // Bu döngü, yüklü olan görünüm ve his bilgilerini kontrol eder
                if ("Nimbus".equals(info.getName())) { // Eğer "Nimbus" görünüm ve his bilgisi bulunursa
                    javax.swing.UIManager.setLookAndFeel(info.getClassName()); // "Nimbus" görünüm ve hissi uygulanır
                    break;  
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) { // Eğer görünüm ve his bilgisi bulunamazsa veya desteklenmeyen bir görünüm ve his uygulanmaya çalışılırsa, bu istisnalar yakalanır
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }
    private javax.swing.JButton jButton1; // jButton1 adında bir JButton nesnesi tanımlanır 
    private javax.swing.JButton jButton2; // jButton2 adında bir JButton nesnesi tanımlanır
    private javax.swing.JLabel jLabel1; // jLabel1 adında bir JLabel nesnesi tanımlanır
}
