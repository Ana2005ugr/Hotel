/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author pc
 */
public class hotel extends javax.swing.JFrame {

    /**
     * Creates new form hotel
     */
    public hotel() {
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
        Entrar = new javax.swing.JButton();
        INFO = new javax.swing.JButton();
        GRANADO = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Entrar.setBackground(new java.awt.Color(153, 153, 153));
        Entrar.setForeground(new java.awt.Color(0, 153, 153));
        Entrar.setText("ENTRAR");
        Entrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jPanel1.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 30));

        INFO.setBackground(new java.awt.Color(153, 153, 153));
        INFO.setForeground(new java.awt.Color(0, 153, 153));
        INFO.setText("INFO");
        INFO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        INFO.setMaximumSize(new java.awt.Dimension(73, 23));
        INFO.setMinimumSize(new java.awt.Dimension(73, 23));
        INFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INFOActionPerformed(evt);
            }
        });
        jPanel1.add(INFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 30));

        GRANADO.setForeground(new java.awt.Color(0, 153, 153));
        GRANADO.setText("GRANADO'S HOTEL");
        GRANADO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GRANADO.setMaximumSize(new java.awt.Dimension(110, 120));
        jPanel1.add(GRANADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 120, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarActionPerformed

    private void INFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INFOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INFOActionPerformed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarMouseClicked

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
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel GRANADO;
    private javax.swing.JButton INFO;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
