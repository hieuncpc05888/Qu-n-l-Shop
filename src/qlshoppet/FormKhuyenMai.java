/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlshoppet;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class FormKhuyenMai extends javax.swing.JFrame {

    /**
     * Creates new form FormKhuyenMai
     */
    public FormKhuyenMai() {
        initComponents();
        setResizable(false); //not max screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        MAKM = new javax.swing.JTextField();
        PHANTRAMKM = new javax.swing.JSpinner();
        NGAYBD = new javax.swing.JTextField();
        NGAYKT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        XemChiTiet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 0));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        logo.setText("Pet Shop");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(MAKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 330, 40));

        PHANTRAMKM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PHANTRAMKM.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(0.1f)));
        PHANTRAMKM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(PHANTRAMKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 330, 40));

        NGAYBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NGAYBDActionPerformed(evt);
            }
        });
        getContentPane().add(NGAYBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 330, 40));
        getContentPane().add(NGAYKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("MÃ KM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("% KM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("NGÀY KT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("NGÀY BĐ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-add-30.png"))); // NOI18N
        jButton1.setText("THÊM");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-update-30.png"))); // NOI18N
        jButton2.setText("CẬP NHẬT");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-delete-30.png"))); // NOI18N
        jButton3.setText("XÓA");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 120, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-reset-30.png"))); // NOI18N
        jButton4.setText("MỚI");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-preview.gif"))); // NOI18N
        jButton5.setOpaque(true);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, 40));

        XemChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        XemChiTiet.setForeground(new java.awt.Color(255, 255, 0));
        XemChiTiet.setText("XEM");
        getContentPane().add(XemChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/27.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/28.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 410, 490));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 800, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/3.BackGround.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 570, 240));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/3.BackGround.jpg"))); // NOI18N
        jLabel8.setText("jLabel7");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 480, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NGAYBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NGAYBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NGAYBDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MAKM;
    private javax.swing.JTextField NGAYBD;
    private javax.swing.JTextField NGAYKT;
    private javax.swing.JSpinner PHANTRAMKM;
    private javax.swing.JLabel XemChiTiet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
