/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package VentanasProAula;


import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectodeinvestigacion.clases.ProyectoInvestigacion;
import proyectodeinvestigacion.clases.ProyectoInvestigacionDAO;



public class VentanaProyectoDeInvestigacion extends javax.swing.JDialog {
    
    ProyectoInvestigacion pr = new ProyectoInvestigacion();
    ProyectoInvestigacionDAO proI = new ProyectoInvestigacionDAO();
    Conexion con = new Conexion();
    Connection conne = con.Conexion();   
    Statement st;
    ResultSet rs;
    
    public VentanaProyectoDeInvestigacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public String ObtenerTxtNombre() {
        String Nombre = txtNombreP.getText();
        return Nombre;
    }

    public String ObtenertxtLider() {
        String LiderP = txtLiderP.getText();
        return LiderP;
    }

    public String ObtenertxtObjetivo() {
        String Objetivo = txtObjetivoP.getText();
        return Objetivo;
    }

     void Agregar(){
                pr.setAcronimo(txtNombreP.getText());
                pr.setLiderProyecto(txtLiderP.getText());
                pr.setObjetivo(txtObjetivoP.getText());
                proI.RegistrarProyecto(pr);
    }
     
    
    void modificar(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGvigente = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnAgregarProyecto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtObjetivoP = new javax.swing.JTextField();
        txtLiderP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Proyecto de Investigacion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 423, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("VACIAR");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 110, 40));

        btnAgregarProyecto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregarProyecto.setText("AGREGAR");
        btnAgregarProyecto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAgregarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProyectoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 120, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("OBJETIVO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        txtObjetivoP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtObjetivoP.setAlignmentX(0.0F);
        txtObjetivoP.setAutoscrolls(false);
        txtObjetivoP.setBorder(null);
        txtObjetivoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtObjetivoPMousePressed(evt);
            }
        });
        txtObjetivoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObjetivoPActionPerformed(evt);
            }
        });
        jPanel1.add(txtObjetivoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 30));

        txtLiderP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLiderP.setBorder(null);
        txtLiderP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLiderPMousePressed(evt);
            }
        });
        txtLiderP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiderPActionPerformed(evt);
            }
        });
        jPanel1.add(txtLiderP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 34));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("LIDER DEL PROYECTO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Vigente");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 515, 58, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("ACRONIMO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtNombreP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombreP.setBorder(null);
        txtNombreP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombrePMousePressed(evt);
            }
        });
        txtNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 59, 310, 35));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        btnGvigente.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("Si");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 515, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        btnGvigente.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("No");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 515, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 101, 309, 10));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 10));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 10));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 370, 450));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Escribiendo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 680));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProyectoActionPerformed

        if (txtNombreP.getText().equals("") && txtLiderP.getText().equals("")
                && txtObjetivoP.getText().equals("")) {
            txtNombreP.setText("");
            JOptionPane.showMessageDialog(this, "Los campos estan vacios");
        } else {
            Agregar();
            this.dispose();
          
        }

    }//GEN-LAST:event_btnAgregarProyectoActionPerformed

    private void txtNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePActionPerformed

    }//GEN-LAST:event_txtNombrePActionPerformed

    private void txtNombrePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombrePMousePressed
//        txtNombreP.setText(" ");
//        txtNombreP.setForeground(Color.black);
    }//GEN-LAST:event_txtNombrePMousePressed

    private void txtLiderPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiderPActionPerformed

    }//GEN-LAST:event_txtLiderPActionPerformed

    private void txtObjetivoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObjetivoPActionPerformed

    }//GEN-LAST:event_txtObjetivoPActionPerformed

    private void txtLiderPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLiderPMousePressed
//        txtLiderP.setText(" ");
//        txtLiderP.setForeground(Color.black);
    }//GEN-LAST:event_txtLiderPMousePressed

    private void txtObjetivoPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObjetivoPMousePressed
//        txtObjetivoP.setText(" ");
//        txtObjetivoP.setForeground(Color.black);
    }//GEN-LAST:event_txtObjetivoPMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        txtNombreP.setText(" ");
//        txtLiderP.setText(" ");
//        txtObjetivoP.setText(" ");
    }//GEN-LAST:event_jButton3ActionPerformed

//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }}
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaProyectoDeInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaProyectoDeInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaProyectoDeInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaProyectoDeInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>  //</editor-fold>   /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                VentanaProyectoDeInvestigacion dialog = new VentanaProyectoDeInvestigacion(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }});
//                dialog.setVisible(true);
//            }});
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProyecto;
    private javax.swing.ButtonGroup btnGvigente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtLiderP;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtObjetivoP;
    // End of variables declaration//GEN-END:variables
}
