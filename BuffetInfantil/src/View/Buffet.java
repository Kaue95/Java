package View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kaue
 */
public class Buffet extends javax.swing.JFrame {

    /**
     * Creates new form Buffet
     */
    public Buffet() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        cx4 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cx1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cx3 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cx2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cx5 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        cx6 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        cx7 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cx8 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel1.setText("Escolha seu Buffet");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 10, 430, 90);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Bolo ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 500, 50, 40);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 2, 2);

        panelImage1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/patatipatatabuffet.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(30, 100, 540, 250);

        cx4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx4);
        cx4.setBounds(250, 510, 20, 21);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Decoração");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 370, 200, 40);

        cx1.setBackground(new java.awt.Color(204, 255, 255));
        cx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx1ActionPerformed(evt);
            }
        });
        jPanel1.add(cx1);
        cx1.setBounds(250, 380, 20, 21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Salgados  100 unidades");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 460, 200, 40);

        cx3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx3);
        cx3.setBounds(250, 470, 20, 21);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Brigadeiro 100 unidades");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 410, 200, 40);

        cx2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx2);
        cx2.setBounds(250, 420, 20, 21);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Garçom de festa");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 460, 140, 40);

        cx5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx5);
        cx5.setBounds(500, 470, 20, 21);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Brinquedos");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 370, 140, 40);

        cx6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx6);
        cx6.setBounds(500, 380, 20, 21);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("TOTAL A PAGAR");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 560, 220, 40);

        cx7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx7);
        cx7.setBounds(500, 420, 20, 21);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 610, 290, 70);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Fotógrafo");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(300, 410, 140, 40);

        sair.setBackground(new java.awt.Color(255, 51, 51));
        sair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sair.setText("SAIR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair);
        sair.setBounds(480, 620, 90, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Fantasista");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(300, 500, 100, 40);

        cx8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(cx8);
        cx8.setBounds(500, 510, 20, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(600, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cx1ActionPerformed
        
    }//GEN-LAST:event_cx1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Buffet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buffet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buffet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buffet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buffet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cx1;
    private javax.swing.JCheckBox cx2;
    private javax.swing.JCheckBox cx3;
    private javax.swing.JCheckBox cx4;
    private javax.swing.JCheckBox cx5;
    private javax.swing.JCheckBox cx6;
    private javax.swing.JCheckBox cx7;
    private javax.swing.JCheckBox cx8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

    private void setSelect(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
