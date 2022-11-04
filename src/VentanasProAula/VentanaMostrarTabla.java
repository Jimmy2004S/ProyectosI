
package VentanasProAula;

import proyectodeinvestigacion.clases.ProyectoInvestigacion;
import config.Conexion;
import config.Login;
import config.LoginDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class VentanaMostrarTabla extends javax.swing.JFrame {

    VentanaProyectoDeInvestigacion v = new VentanaProyectoDeInvestigacion(this, true);
    VentanaInicio v2 = new VentanaInicio();
    private ArrayList<ProyectoInvestigacion> listaProyecto;
    DefaultTableModel Table = new DefaultTableModel();
    Conexion con = new Conexion();
    Connection conne = con.Conexion();
    Statement st;
    ResultSet rs;
    int codigo; 
    Login l = new Login();
LoginDAO login = new LoginDAO();
   
    public VentanaMostrarTabla() {
        initComponents();
        setSize(1100, 680);
        listaProyecto = new ArrayList<>();
        Listar();
    }

   public void Listar() {
      Table = new DefaultTableModel();
      Table.addColumn("Codigo");
      Table.addColumn("Acronimo");
      Table.addColumn("Lider del Proyecto");
      Table.addColumn("Objetivo");
      Table.addColumn("Fecha");
      tblTabla.setModel(Table);
      
       System.out.println("dato: " + l.getIdentificacion());
      
         String sql = "select * from proyectos WHERE id_profesor='"+l.getIdentificacion()+"'";
        try {
            st = conne.createStatement();
            rs = st.executeQuery(sql);
            Object [] proyectos =  new Object [5];
            while(rs.next()){
                proyectos [0] = rs.getInt(1);
                proyectos [1] = rs.getString("Acronimo");
                proyectos [2] = rs.getString("LiderProyecto");
                proyectos [3] = rs.getString("Objetivo");
                proyectos [4] = rs.getTimestamp("Fecha");
                Table.addRow(proyectos);
            }
            tblTabla.setModel(Table);
        } catch (SQLException e) {
            System.out.println("consultar: " + e);
        }   
    }

   
   void eliminar(){
       int fila = tblTabla.getSelectedRow();
       
       codigo = Integer.parseInt(tblTabla.getValueAt(fila,0).toString());
       
       String sql = "DELETE FROM proyectos WHERE codigo="+codigo;
       conne = con.Conexion();
       try {
          st = conne.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Proyecto Eliminado");
                limpiarTabla();
       } catch (Exception e) {
           System.out.println("Error eliminar: " + e);
       }
   }
    public void limpiarTabla() {
        for (int i = 0; i < Table.getRowCount(); i++) {
            Table.removeRow(i);
            i = i - 1;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnVentanaProf = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminarFila = new javax.swing.JButton();
        etiBuscar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtReporte = new javax.swing.JTextField();
        etiFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTabla.setOpaque(false);
        jScrollPane1.setViewportView(tblTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1050, 190));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 13, 280, 40));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Volver.png"))); // NOI18N
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(102, 255, 204), null));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 23, 46, 30));

        btnVentanaProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Administrar.png"))); // NOI18N
        btnVentanaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaProfActionPerformed(evt);
            }
        });
        jPanel2.add(btnVentanaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 23, -1, 30));

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/añadir-24.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 255, 204), null));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 110, -1));

        btnEliminarFila.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminarFila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Eliminar.png"))); // NOI18N
        btnEliminarFila.setText("ELIMINAR");
        btnEliminarFila.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 204), new java.awt.Color(51, 255, 204), null));
        btnEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 110, -1));

        etiBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        etiBuscar.setForeground(new java.awt.Color(255, 255, 255));
        etiBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Buscar.png"))); // NOI18N
        etiBuscar.setText("BUSCAR");
        jPanel2.add(etiBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Editar.png"))); // NOI18N
        jButton1.setText("EDITAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 204), new java.awt.Color(0, 255, 102), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 108, 30));

        jButton2.setText("pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 50, 30));
        jPanel2.add(txtReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 70, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 1060, 110));

        etiFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Universidad new.png"))); // NOI18N
        jPanel1.add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        v.setLocationRelativeTo(null);
        v.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed

        int fila = tblTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleciona una fila para borrar ");
        } else {
           eliminar();
        }
        Listar();
     
    }//GEN-LAST:event_btnEliminarFilaActionPerformed


    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        VentanaInicio v = new VentanaInicio();
        v.setVisible(true);
        v.setLocationRelativeTo(null);

        dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVentanaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaProfActionPerformed

        VentanaProfesor v = new VentanaProfesor(this, true);
        v.setLocationRelativeTo(null);
        v.setVisible(true);

    }//GEN-LAST:event_btnVentanaProfActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    TableRowSorter trs;
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped

        txtBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscar.getText(), 0, 1));
            }
        });

        trs = new TableRowSorter(Table);
        tblTabla.setRowSorter(trs);


    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int fila = tblTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleciona una fila para modificar ");
        } else {
            VentanaProyectoDeInvestigacion v = new VentanaProyectoDeInvestigacion(this, true);
            v.setLocationRelativeTo(null);
            v.setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        try {
            Conexion cn = new Conexion();
        Connection conn = cn.Conexion();
        
        JasperReport reporte = null;
        String path = "src\\reportes\\report1.jasper";
        String cad1 = txtReporte.getText();
        Map parametro = new HashMap();
        parametro.put("Codigo", cad1);
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(path,parametro,conn);
            
            JasperViewer view = new JasperViewer(jprint,false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(rootPaneCheckingEnabled);
        } catch (JRException ex) {
            Logger.getLogger(VentanaMostrarTabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed



//    public static void main(String args[]) {
//        try {for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break; }}
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold> //</editor-fold> /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaMostrarTabla().setVisible(true);
//            } });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarFila;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVentanaProf;
    private javax.swing.JLabel etiBuscar;
    private javax.swing.JLabel etiFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtReporte;
    // End of variables declaration//GEN-END:variables
}
