/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Gerador;
import javax.swing.JOptionPane;

/**
 *
 * @author ETECIA
 */
public class MegaSena extends javax.swing.JFrame {

    /**
     * Creates new form MegaSena
     */
    public MegaSena() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        img1 = new org.edisoncor.gui.panel.PanelImage();
        num1 = new javax.swing.JLabel();
        img2 = new org.edisoncor.gui.panel.PanelImage();
        num2 = new javax.swing.JLabel();
        img3 = new org.edisoncor.gui.panel.PanelImage();
        num3 = new javax.swing.JLabel();
        img4 = new org.edisoncor.gui.panel.PanelImage();
        num4 = new javax.swing.JLabel();
        img5 = new org.edisoncor.gui.panel.PanelImage();
        num5 = new javax.swing.JLabel();
        img6 = new org.edisoncor.gui.panel.PanelImage();
        num6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(153, 255, 102));
        jPanel3.setLayout(null);

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola verde.png"))); // NOI18N
        img1.setLayout(null);

        num1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num1.setForeground(new java.awt.Color(255, 255, 255));
        img1.add(num1);
        num1.setBounds(20, 20, 40, 40);

        jPanel3.add(img1);
        img1.setBounds(20, 100, 80, 80);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola verde.png"))); // NOI18N
        img2.setLayout(null);

        num2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num2.setForeground(new java.awt.Color(255, 255, 255));
        img2.add(num2);
        num2.setBounds(20, 20, 40, 40);

        jPanel3.add(img2);
        img2.setBounds(120, 100, 80, 80);

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola verde.png"))); // NOI18N
        img3.setLayout(null);

        num3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num3.setForeground(new java.awt.Color(255, 255, 255));
        img3.add(num3);
        num3.setBounds(20, 20, 40, 40);

        jPanel3.add(img3);
        img3.setBounds(220, 100, 80, 80);

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola verde.png"))); // NOI18N
        img4.setLayout(null);

        num4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num4.setForeground(new java.awt.Color(255, 255, 255));
        img4.add(num4);
        num4.setBounds(20, 20, 40, 40);

        jPanel3.add(img4);
        img4.setBounds(320, 100, 80, 80);

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola verde.png"))); // NOI18N
        img5.setLayout(null);

        num5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num5.setForeground(new java.awt.Color(255, 255, 255));
        img5.add(num5);
        num5.setBounds(20, 20, 40, 40);

        jPanel3.add(img5);
        img5.setBounds(410, 100, 80, 80);

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bola verde.png"))); // NOI18N
        img6.setLayout(null);

        num6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num6.setForeground(new java.awt.Color(255, 255, 255));
        img6.add(num6);
        num6.setBounds(20, 20, 40, 40);

        jPanel3.add(img6);
        img6.setBounds(510, 100, 80, 80);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(500, 10, 80, 30);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/megasenalogo.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel3.add(panelImage1);
        panelImage1.setBounds(70, 10, 420, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 200));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MegaSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MegaSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MegaSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MegaSena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

              
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MegaSena().setVisible(true);
                Gerador.megasena();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.panel.PanelImage img1;
    private org.edisoncor.gui.panel.PanelImage img2;
    private org.edisoncor.gui.panel.PanelImage img3;
    private org.edisoncor.gui.panel.PanelImage img4;
    private org.edisoncor.gui.panel.PanelImage img5;
    private org.edisoncor.gui.panel.PanelImage img6;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel num1;
    public static javax.swing.JLabel num2;
    public static javax.swing.JLabel num3;
    public static javax.swing.JLabel num4;
    public static javax.swing.JLabel num5;
    public static javax.swing.JLabel num6;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
