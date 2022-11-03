/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeinvestigacion.clases;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jimmy
 */
public class ProyectoInvestigacionDAO {
      Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean RegistrarProyecto(ProyectoInvestigacion proI){
        String sql = "INSERT INTO proyectos (Acronimo,LiderProyecto,Objetivo) VALUES (?,?,?)";
             try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, proI.getAcronimo());
            ps.setString(2, proI.getLiderProyecto());
            ps.setString(3, proI.getObjetivo());
            ps.execute();
            return true;
        } catch (SQLException e) {
                 System.out.println("Registrar proyecto: " + e);
                 return false;
        }finally{
                 try {
                     con.close();
                 } catch (Exception e) {
                     System.out.println("Registrar: " + e);
                 }
             }
    }
    
    
    
  
}
