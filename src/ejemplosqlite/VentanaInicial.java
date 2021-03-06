/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosqlite;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class VentanaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicial
     */
    public VentanaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoVI = new javax.swing.JPanel();
        etiquetaFondoVI = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(501, 399));

        panelFondoVI.setBackground(new java.awt.Color(0, 0, 0));
        panelFondoVI.setPreferredSize(new java.awt.Dimension(500, 399));
        panelFondoVI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaFondoVI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brais Núñez\\Desktop\\Desarrollo de aplicaciones multiplataforma\\Programacion\\Presentacion JDBC\\fondoJDBC.png")); // NOI18N
        etiquetaFondoVI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelFondoVI.add(etiquetaFondoVI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 300));

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelFondoVI.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        botonEntrar.setText("ENTRAR");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        panelFondoVI.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoVI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoVI, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        Ventana1 ven1 = new Ventana1();
        ven1.setVisible(true);
        ven1.setLocationRelativeTo(null);
        ven1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        
        System.out.println("Conexión terminada");
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra base de datos");
        this.dispose();
        
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaFondoVI;
    private javax.swing.JPanel panelFondoVI;
    // End of variables declaration//GEN-END:variables
}
