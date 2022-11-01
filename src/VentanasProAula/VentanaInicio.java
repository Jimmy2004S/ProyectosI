
package VentanasProAula;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        logoUnic = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        textCorreo = new javax.swing.JLabel();
        textClave = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setBackground(new java.awt.Color(51, 153, 255));
        btnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("INICIAR");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        PanelLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 150, 50));

        logoUnic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoUnic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unicolombo.png"))); // NOI18N
        PanelLogin.add(logoUnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 970, -1));
        PanelLogin.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 340, 30));

        pass.setText("jPasswordField1");
        PanelLogin.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 340, 30));

        textCorreo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textCorreo.setText("CORREO");
        PanelLogin.add(textCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, -1));

        textClave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textClave.setText("CLAVE");
        PanelLogin.add(textClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 60, -1));

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image (2).png"))); // NOI18N
        PanelLogin.add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubicacion.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        VentanaMostrarTabla v = new VentanaMostrarTabla();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaInicio dialog = new VentanaInicio();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                
////                  try {
////                    UIManager.setLookAndFeel( new AeroLookAndFeel());
////                } catch (UnsupportedLookAndFeelException ex) {
////                    Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
////                }
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel logoUnic;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel textClave;
    private javax.swing.JLabel textCorreo;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
