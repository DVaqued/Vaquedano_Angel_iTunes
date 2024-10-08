/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vaquedano_angel_itunes;

/**
 *
 * @author angel
 */
public class ventanaJTunes extends javax.swing.JFrame {

    JTunes jT = new JTunes();

    /**
     * Creates new form ventanaJTunes
     */
    public ventanaJTunes() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reseñarCanción = new javax.swing.JToggleButton();
        añadirCancion1 = new javax.swing.JToggleButton();
        buscarCancion1 = new javax.swing.JToggleButton();
        imprimirCanciones = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaquedano_angel_itunes/logoITunes.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        reseñarCanción.setBackground(new java.awt.Color(204, 204, 204));
        reseñarCanción.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reseñarCanción.setForeground(new java.awt.Color(0, 0, 0));
        reseñarCanción.setText("Reseñar Canción");
        reseñarCanción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reseñarCanciónActionPerformed(evt);
            }
        });

        añadirCancion1.setBackground(new java.awt.Color(204, 204, 204));
        añadirCancion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        añadirCancion1.setForeground(new java.awt.Color(0, 0, 0));
        añadirCancion1.setText("Añadir Canción");
        añadirCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirCancion1ActionPerformed(evt);
            }
        });

        buscarCancion1.setBackground(new java.awt.Color(204, 204, 204));
        buscarCancion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscarCancion1.setForeground(new java.awt.Color(0, 0, 0));
        buscarCancion1.setText("Buscar Canción");
        buscarCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCancion1ActionPerformed(evt);
            }
        });

        imprimirCanciones.setBackground(new java.awt.Color(204, 204, 204));
        imprimirCanciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        imprimirCanciones.setForeground(new java.awt.Color(0, 0, 0));
        imprimirCanciones.setText("Imprimir Canciones");
        imprimirCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirCancionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(añadirCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reseñarCanción, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimirCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(añadirCancion1)
                .addGap(41, 41, 41)
                .addComponent(buscarCancion1)
                .addGap(43, 43, 43)
                .addComponent(reseñarCanción)
                .addGap(45, 45, 45)
                .addComponent(imprimirCanciones)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirCancion1ActionPerformed
        // TODO add your handling code here:
        añadirCanciones aC = new añadirCanciones();
        aC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_añadirCancion1ActionPerformed

    private void reseñarCanciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reseñarCanciónActionPerformed
        // TODO add your handling code here:
        reseñarCanciones rC=new reseñarCanciones();
        rC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reseñarCanciónActionPerformed

    private void imprimirCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirCancionesActionPerformed
        // TODO add your handling code here:
        imprimirCanciones iC= new imprimirCanciones();
        iC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imprimirCancionesActionPerformed

    private void buscarCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCancion1ActionPerformed
        // TODO add your handling code here:
        buscarCanciones bC=new buscarCanciones();
        bC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buscarCancion1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaJTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaJTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaJTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaJTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaJTunes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton añadirCancion1;
    private javax.swing.JToggleButton buscarCancion1;
    private javax.swing.JToggleButton imprimirCanciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton reseñarCanción;
    // End of variables declaration//GEN-END:variables
}
