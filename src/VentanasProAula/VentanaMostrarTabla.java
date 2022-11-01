
package VentanasProAula;

import co.edu.unicolombo.ingsistemas.pb.ejercicio1.proyectodeinvestigacion.modelo.ProyectoInvestigacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaMostrarTabla extends javax.swing.JFrame {

    private ArrayList<ProyectoInvestigacion> listaProyecto;
    DefaultTableModel Table = new DefaultTableModel();

    public VentanaMostrarTabla() {
        initComponents();
        setSize(1100, 680);
        listaProyecto = new ArrayList<>();

        String[] titulo = new String[]{"CODIGO", "NOMBRE DEL PROYECTO",
            "INVESTIGADOR PRINCIPAL", "OBJETIVO", "FECHA"};
        Table.setColumnIdentifiers(titulo);
        tblTabla.setModel(Table);

    }

    public void listar() {
        Object[] ob = new Object[10];
        for (int i = 0; i < listaProyecto.size(); i++) {
            ob[0] = listaProyecto.get(i).getCodigoRef();
            ob[1] = listaProyecto.get(i).getAcronimo();
            ob[2] = listaProyecto.get(i).getPrincipal();
            ob[3] = listaProyecto.get(i).getObjetivo();
            ob[4] = listaProyecto.get(i).getFecha();
            Table.addRow(ob);
        }
        tblTabla.setModel(Table);
    }

    public void limpiarTabla() {
        for (int i = 0; i < Table.getRowCount(); i++) {
            Table.removeRow(i);
            i = i - 1;
        }
    }

    String NombreP[] = new String[5];

    public void NombreProf(String nombre) {
        for (int i = 0; i < 1; i++) {
            NombreP[i] += nombre;
            System.out.println(NombreP[i]);
            break;
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

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volver.png"))); // NOI18N
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 204), new java.awt.Color(102, 255, 204), null));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 23, 46, 30));

        btnVentanaProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Administrar.png"))); // NOI18N
        btnVentanaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaProfActionPerformed(evt);
            }
        });
        jPanel2.add(btnVentanaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 23, -1, 30));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadir-24.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 255, 204), null));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 110, -1));

        btnEliminarFila.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarFila.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminarFila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.png"))); // NOI18N
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
        etiBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscar.png"))); // NOI18N
        etiBuscar.setText("BUSCAR");
        jPanel2.add(etiBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editar.png"))); // NOI18N
        jButton1.setText("EDITAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 204), new java.awt.Color(0, 255, 102), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 108, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 1060, 80));

        etiFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Universidad new.png"))); // NOI18N
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

        VentanaProyectoDeInvestigacion v = new VentanaProyectoDeInvestigacion(this, true);
        v.setLocationRelativeTo(null);
        v.setVisible(true);

        Integer aleatorio = (int) ((Math.random() * 1000) + 2000);

        ProyectoInvestigacion PI = new ProyectoInvestigacion();
        String cad1 = v.ObtenerTxtNombre();
        String cad2 = v.ObtenertxtLider();
        String cad3 = v.ObtenertxtObjetivo();
        Integer Ref = aleatorio;
        Date FechaI = new Date();

        PI.setCodigoRef(Ref);
        PI.setAcronimo(cad1);
        PI.setPrincipal(cad2);
        PI.setObjetivo(cad3);
        PI.setFecI(FechaI);
        listaProyecto.add(PI);

        limpiarTabla();
        listar();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed

        int fila = tblTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleciona una fila para borrar ");
        } else {
            listaProyecto.remove(fila);
        }

        limpiarTabla();
        listar();


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

            Integer aleatorio = (int) ((Math.random() * 1000) + 2000);
            ProyectoInvestigacion PI = new ProyectoInvestigacion();

            String cad1 = v.ObtenerTxtNombre();
            String cad2 = v.ObtenertxtLider();
            String cad3 = v.ObtenertxtObjetivo();
            Integer Ref = aleatorio;
            Date FechaI = new Date();

            PI.setCodigoRef(Ref);
            PI.setAcronimo(cad1);
            PI.setPrincipal(cad2);
            PI.setObjetivo(cad3);
            PI.setFecI(FechaI);
            listaProyecto.add(fila, PI);
            listaProyecto.remove(fila + 1);
            limpiarTabla();
            listar();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new VentanaMostrarTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarFila;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVentanaProf;
    private javax.swing.JLabel etiBuscar;
    private javax.swing.JLabel etiFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
