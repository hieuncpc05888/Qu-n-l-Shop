/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlshoppet;

import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class FormHiPet extends javax.swing.JFrame {

    /**
     * Creates new form FormHiPet
     */
    public FormHiPet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackG = new javax.swing.JPanel();
        lblPetDouble = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loadingValue = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        BGimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackG.setBackground(new java.awt.Color(0, 255, 255));
        BackG.setPreferredSize(new java.awt.Dimension(900, 500));
        BackG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPetDouble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/4.hiPet.gif"))); // NOI18N
        lblPetDouble.setText("jLabel1");
        BackG.add(lblPetDouble, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 310, 260));

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/5like.png"))); // NOI18N
        line.setText("jLabel1");
        BackG.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 360, 30));

        loadingBar.setBackground(new java.awt.Color(255, 255, 204));
        BackG.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 710, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Welcome to Pet Shop!!");
        BackG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 410, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        jLabel2.setText("Pet Shop");
        BackG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        loadingValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadingValue.setForeground(new java.awt.Color(204, 0, 0));
        loadingValue.setText("0 %");
        BackG.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        loading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 0, 102));
        loading.setText("Loading...");
        BackG.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, -1));

        BGimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/3.BackGround.jpg"))); // NOI18N
        BGimg.setText("jLabel1");
        BackG.add(BGimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackG, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackG, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormHiPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHiPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHiPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHiPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FormHiPet pt = new FormHiPet();
        pt.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                pt.loadingValue.setText(i + "%");

                if (i == 10) {
                    pt.loading.setText("Turning on Modules...");
                }
                if (i == 20) {
                    pt.loading.setText("Loading Modules...");
                }
                if (i == 50) {
                    pt.loading.setText("Connecting to Database...");
                }
                if (i == 70) {
                    pt.loading.setText("Connection Successfull !!...");
                }
                if (i == 80) {
                    pt.loading.setText("Launching Aplication...");
                }
                pt.loadingBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        FormLogin lg = new FormLogin(pt, true);
        // sau khi dong se mo ra form nay
        pt.setVisible(false);
        // dong trang loading

        pt.dispose();
        lg.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGimg;
    private javax.swing.JPanel BackG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPetDouble;
    private javax.swing.JLabel line;
    private javax.swing.JLabel loading;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingValue;
    // End of variables declaration//GEN-END:variables
}
