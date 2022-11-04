/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeinvestigacion.clases;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jimmy
 */
public class ProyectoInvestigacionDAO {
      Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
   
    String idProfe = "";
    
    
    public boolean RegistrarProyecto(ProyectoInvestigacion proI){
        String sql = "INSERT INTO proyectos (Acronimo,LiderProyecto,id_profesor,Objetivo) VALUES (?,?,?,?)";
        conn = cn.Conexion();
             try {
                 int banderaProyecto = 0;
                int banderaProfe = 0;
                 //BUSCAR SI EL NOMBRE DEL PROYECTO EXISTE
                 String sql2 = "SELECT * FROM proyectos";
                 st = conn.createStatement();
                 rs = st.executeQuery(sql2);
                 String acro = proI.getAcronimo();
                 String nomProfesor = proI.getLiderProyecto();
                 while (rs.next()) {
                     if (acro.equalsIgnoreCase(rs.getString("Acronimo"))) {
                         banderaProyecto = 1;
                         JOptionPane.showMessageDialog(null, "Ya existe un proyecto con este nombre");
                         break;
                     }
                 }
                 
            //PROFESOR EXISTE
                 if (banderaProyecto == 0) {
                     String sql3 = "SELECT * FROM profesores WHERE Nombre='"+ proI.getLiderProyecto()+"'";
                     st = conn.createStatement();
                     rs = st.executeQuery(sql3);
                     while (rs.next()){
                         if (nomProfesor.equalsIgnoreCase(rs.getString("Nombre"))) {
                             banderaProfe = 1;
                             idProfe = rs.getString("identificacion");
                             break;
                         }
                     }
                 }
                 if (banderaProfe == 0) {
                     JOptionPane.showMessageDialog(null, "El profesor no existe");
                 }
           
            
            //INSERTAR PROYECTO SI PROYECTO NO EXISTE Y PROFESOR SI EXISTE
                 if (banderaProyecto == 0 && banderaProfe == 1) {
                     ps = conn.prepareStatement(sql);
                     ps.setString(1, proI.getAcronimo());
                     ps.setString(2, proI.getLiderProyecto());
                     ps.setString(3, idProfe);
                     ps.setString(4, proI.getObjetivo());
                     ps.execute();
                     JOptionPane.showMessageDialog(null, "Registrado ");
                 }
                 return true;
            
        } catch (Exception e) {
                 System.out.println("Registrar proyecto: " + e);
                 return false;
        }finally{
                 try {
                     conn.close();
                 } catch (Exception e) {
                     System.out.println("Registrar: " + e);
                 }
             }
    }
}
