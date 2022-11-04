
package VentanasProAula;

import config.Login;
import config.LoginDAO;
import javax.swing.JOptionPane;

public class VentanaInicio extends javax.swing.JFrame {
Login l = new Login();
LoginDAO login = new LoginDAO();
            
    public VentanaInicio() {
        initComponents();
    }

    
    public void validar(){
        String correo = txtCorreo.getText();
        String contra = txtContraseña.getText();
        
        if(correo.equals("") ||  contra.equals("")){
            JOptionPane.showMessageDialog(null, "Llene los campos");
        }else{
            l = login.log(correo, contra);
            if(l.getNombre() != null && l.getIdentificacion() != null){
                VentanaMostrarTabla v = new VentanaMostrarTabla();
                v.setVisible(true);
                v.setLocationRelativeTo(null);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        logoUnic = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        textCorreo = new javax.swing.JLabel();
        textClave = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        rbMostrarCon = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setBackground(new java.awt.Color(51, 153, 255));
        btnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("INICIAR");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        PanelLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 150, 50));

        logoUnic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoUnic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/unicolombo.png"))); // NOI18N
        PanelLogin.add(logoUnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 970, 80));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtCorreo.setFocusable(false);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCorreoMouseExited(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        PanelLogin.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 340, 40));

        textCorreo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textCorreo.setText("CORREO");
        PanelLogin.add(textCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, -1));

        textClave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textClave.setText("CLAVE");
        PanelLogin.add(textClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 60, -1));
        PanelLogin.add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1000, 100));

        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtContraseña.setFocusable(false);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseExited(evt);
            }
        });
        PanelLogin.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 340, 40));

        rbMostrarCon.setBackground(new java.awt.Color(255, 255, 255));
        rbMostrarCon.setText("Mostrar contraseña");
        rbMostrarCon.setFocusable(false);
        rbMostrarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbMostrarConMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbMostrarConMouseExited(evt);
            }
        });
        rbMostrarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMostrarConActionPerformed(evt);
            }
        });
        PanelLogin.add(rbMostrarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        validar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void rbMostrarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMostrarConActionPerformed
     
        if(rbMostrarCon.isSelected()){
            String cad1 = txtContraseña.getText(); 
        }
      
    }//GEN-LAST:event_rbMostrarConActionPerformed

    private void txtCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseEntered
        txtCorreo.setFocusable(true);
    }//GEN-LAST:event_txtCorreoMouseEntered

    private void txtCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseExited

    }//GEN-LAST:event_txtCorreoMouseExited

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseEntered
        txtContraseña.setFocusable(true);
    }//GEN-LAST:event_txtContraseñaMouseEntered

    private void txtContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseExited
         
    }//GEN-LAST:event_txtContraseñaMouseExited

    private void rbMostrarConMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMostrarConMouseEntered
        rbMostrarCon.setFocusable(true);
    }//GEN-LAST:event_rbMostrarConMouseEntered

    private void rbMostrarConMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMostrarConMouseExited
       
    }//GEN-LAST:event_rbMostrarConMouseExited

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
    
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
 
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
 
    }//GEN-LAST:event_txtCorreoKeyPressed

//    public static void main(String args[]) {
//        try { for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//               }}} catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                VentanaInicio dialog = new VentanaInicio();
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }});            
//////                  try {UIManager.setLookAndFeel( new AeroLookAndFeel());
//////                } catch (UnsupportedLookAndFeelException ex) {
//////                    Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
//////                }dialog.setVisible(true);
//            }});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel logoUnic;
    private javax.swing.JRadioButton rbMostrarCon;
    private javax.swing.JLabel textClave;
    private javax.swing.JLabel textCorreo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
