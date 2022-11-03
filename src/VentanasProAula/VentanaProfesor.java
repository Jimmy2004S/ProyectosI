package VentanasProAula;

import proyectodeinvestigacion.clases.Profesor;
import proyectodeinvestigacion.clases.ProfesorDAO;
import config.Conexion;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VentanaProfesor extends javax.swing.JDialog {

    Profesor pr = new Profesor();
    ProfesorDAO profe = new ProfesorDAO();
    Conexion con = new Conexion();
    Connection connet = con.Conexion();
    Statement st;
    ResultSet rs;
    DefaultTableModel Table; 
    int id;
    ArrayList<Profesor> listaProfesor;

    String nombre;
    String apellido;

    public VentanaProfesor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Listar();
        listaProfesor = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoCargoProfesor = new javax.swing.ButtonGroup();
        grupoDoctorado = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        JpanelBotones = new javax.swing.JPanel();
        btnVaciar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        PanelInfor = new javax.swing.JPanel();
        textCargo = new javax.swing.JLabel();
        btnAutor = new javax.swing.JRadioButton();
        btnInvestigadorP = new javax.swing.JRadioButton();
        txtId = new javax.swing.JTextField();
        textIdDespacho = new javax.swing.JLabel();
        txtNomProf = new javax.swing.JTextField();
        etiNomProfesor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        etiFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTIONAR PROFESORES");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelBotones.setBackground(new java.awt.Color(0, 0, 0, 80));
        JpanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVaciar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Escoba.png"))); // NOI18N
        btnVaciar.setText("VACIAR");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });
        JpanelBotones.add(btnVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 130, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        JpanelBotones.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 129, 33));

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/añadir-24.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        JpanelBotones.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 129, -1));

        PanelInfor.setBackground(new java.awt.Color(255, 255, 255));
        PanelInfor.setInheritsPopupMenu(true);
        PanelInfor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCargo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textCargo.setText("Cargo:");
        PanelInfor.add(textCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 50, -1));

        btnAutor.setBackground(new java.awt.Color(255, 255, 255));
        GrupoCargoProfesor.add(btnAutor);
        btnAutor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAutor.setText("Autor");
        btnAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });
        PanelInfor.add(btnAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 98, 34));

        btnInvestigadorP.setBackground(new java.awt.Color(255, 255, 255));
        GrupoCargoProfesor.add(btnInvestigadorP);
        btnInvestigadorP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnInvestigadorP.setText("Investigador Principal");
        btnInvestigadorP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestigadorPActionPerformed(evt);
            }
        });
        PanelInfor.add(btnInvestigadorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 161, 35));

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setText("Ayudanos a Identificarte");
        txtId.setBorder(null);
        txtId.setSelectionColor(new java.awt.Color(0, 55, 255));
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        PanelInfor.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 40));

        textIdDespacho.setBackground(new java.awt.Color(255, 255, 255));
        textIdDespacho.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textIdDespacho.setText("ID ");
        PanelInfor.add(textIdDespacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        txtNomProf.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtNomProf.setForeground(new java.awt.Color(204, 204, 204));
        txtNomProf.setText("Escribe tu nombre");
        txtNomProf.setBorder(null);
        txtNomProf.setSelectionColor(new java.awt.Color(0, 55, 255));
        txtNomProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomProfMousePressed(evt);
            }
        });
        txtNomProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProfActionPerformed(evt);
            }
        });
        PanelInfor.add(txtNomProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, 38));

        etiNomProfesor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        etiNomProfesor.setText("NOMBRE");
        PanelInfor.add(etiNomProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 81, 26));
        PanelInfor.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 330, 10));
        PanelInfor.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 330, 10));

        JpanelBotones.add(PanelInfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 340));

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
        JpanelBotones.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 225, 30));

        tblTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title S", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla2);

        JpanelBotones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 540, 150));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Buscar.png"))); // NOI18N
        jLabel1.setText("BUSCAR");
        JpanelBotones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 20));

        Modificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Editar.png"))); // NOI18N
        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        JpanelBotones.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 150, 30));

        jPanel2.add(JpanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 570, 640));

        etiFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectodeinvestigacion/imagenes/Escribiendo.png"))); // NOI18N
        jPanel2.add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Listar() {
      Table = new DefaultTableModel();
      Table.addColumn("Codigo");
      Table.addColumn("Nombre");
      Table.addColumn("id");
      Table.addColumn("Cargo");
      tblTabla2.setModel(Table);
         String sql = "select * from profesores";
        try {
            st = connet.createStatement();
            rs = st.executeQuery(sql);
            Object [] clientes =  new Object [4];
            while(rs.next()){
                clientes [0] = rs.getInt(1);
                clientes [1] = rs.getString(2);
                clientes [2] = rs.getString(3);
                clientes [3] = rs.getString(4);
                Table.addRow(clientes);
            }
            tblTabla2.setModel(Table);
        } catch (SQLException e) {
            System.out.println("consultar: " + e);
        }   
    }

    public void limpiarTabla() {
        for (int i = 0; i < Table.getRowCount(); i++) {
            Table.removeRow(i);
            i = i - 1;
        }
    }


     void Agregar(){
           String cs = null;
                 if (btnAutor.isSelected()) {
             cs = "Autor";
         } else if (btnInvestigadorP.isSelected()) {
             cs = "Investigador principal";
         }
                pr.setNombres(txtNomProf.getText());
                pr.setIdentificacion(txtId.getText());
                pr.setCargo(cs);
                profe.RegistrarCliente(pr);
                JOptionPane.showMessageDialog(null, "Registrado ");
                limpiarTabla();
    }
     
     
     void modificar() {
        int fila = tblTabla2.getSelectedRow();
        id = Integer.parseInt(tblTabla2.getValueAt(fila, 0).toString());
            String identi = txtId.getText();
            String nom = txtNomProf.getText();
            String cs = null;
            if (btnAutor.isSelected()) {
                cs = "Autor";
            } else if (btnInvestigadorP.isSelected()) {
                cs = "Investigador principal";
            try {
                String sql = "UPDATE profesores set codigo= '" + id + "',Nombre='" +
                        nom + "',identificacion='" + identi + "', cargo='" + cs + "' WHERE codigo =" + id;
                connet = con.Conexion();
                st = connet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Profesor Modificado");
                limpiarTabla();
            } catch (Exception e) {
                System.out.println(e);
            }  
        }  
     }
    
     
     void eliminar () throws SQLException{
         int fila = tblTabla2.getSelectedRow();
          id = Integer.parseInt(tblTabla2.getValueAt(fila, 0).toString());
         
         String sql = "DELETE FROM profesores WHERE codigo="+id;
          connet = con.Conexion();
          try {
             st = connet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Profesor Eliminado");
                limpiarTabla();
         } catch (Exception e) {
              System.out.println("Eliminar: " +e);
         }
                
     }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

            if ((btnAutor.isSelected()
                    || btnInvestigadorP.isSelected())
                    && !txtNomProf.getText().equals("")
                    && !txtId.getText().equals("")) {
              Agregar();
            }else{
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            }
            Listar();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNomProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProfActionPerformed

    }//GEN-LAST:event_txtNomProfActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed

    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnInvestigadorPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestigadorPActionPerformed

    }//GEN-LAST:event_btnInvestigadorPActionPerformed

    private void txtNomProfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomProfMousePressed
        txtNomProf.setText("");
        txtNomProf.setForeground(Color.black);
    }//GEN-LAST:event_txtNomProfMousePressed

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        txtId.setText("");
        txtId.setForeground(Color.black);
    }//GEN-LAST:event_txtIdMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int fila = tblTabla2.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleciona una fila para borrar ");
        } else {
            try {
                eliminar();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaProfesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        limpiarTabla();
        Listar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        txtId.setText(" ");
        txtNomProf.setText(" ");
    }//GEN-LAST:event_btnVaciarActionPerformed

    TableRowSorter trs;
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped

        txtBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscar.getText(), 0, 1));
            }
        });

        trs = new TableRowSorter(Table);
        tblTabla2.setRowSorter(trs);

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
         int fila = tblTabla2.getSelectedRow();
         if(fila == -1){
             JOptionPane.showMessageDialog(null, "Seleciona una fila");
         }else{
             modificar();
            Listar();
         }
            

    }//GEN-LAST:event_ModificarActionPerformed

    private void tblTabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTabla2MouseClicked
        int fila = tblTabla2.getSelectedRow();
         
        String cad1 = (String) tblTabla2.getValueAt(fila,1).toString();
        String identi = (String) tblTabla2.getValueAt(fila,2).toString();
        
        txtNomProf.setText("");
        txtNomProf.setForeground(Color.black);
        txtNomProf.setText(cad1);
        txtId.setText("");
        txtId.setForeground(Color.black);
        txtId.setText(identi);
    }//GEN-LAST:event_tblTabla2MouseClicked

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                VentanaProfesor dialog = new VentanaProfesor(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }});
//dialog.setVisible(true);
//            }});
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoCargoProfesor;
    private javax.swing.JPanel JpanelBotones;
    private javax.swing.JButton Modificar;
    private javax.swing.JPanel PanelInfor;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnAutor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JRadioButton btnInvestigadorP;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel etiFondo;
    private javax.swing.JLabel etiNomProfesor;
    private javax.swing.ButtonGroup grupoDoctorado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblTabla2;
    private javax.swing.JLabel textCargo;
    private javax.swing.JLabel textIdDespacho;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomProf;
    // End of variables declaration//GEN-END:variables
}
