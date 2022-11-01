
package co.edu.unicolombo.ingsistemas.pb.ejercicio1.proyectodeinvestigacion.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class ProyectoInvestigacion {

private Integer codigoRef;    
private String acronimo;
private Date fecI;
private String objetivo;
private String principal;    
private String estado;    
  

    public void ProyectoInvestigacion(){  
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
    
    
    public void setCodigoRef(Integer codigo) {
        this.codigoRef = codigo;
    }
  
    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

     public void setPrincipal(String principal) {
        this.principal = principal;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
      public void setFecI(Date fecI) {
        this.fecI = fecI;
    }

 
    //METODOS GET
    public Integer getCodigoRef() {
        return codigoRef;
    }

    public String getAcronimo() {
        return acronimo;
    }
    
    public String getObjetivo() {
        return objetivo;
    }
    
    public String getPrincipal() {
        return principal;
    }

  public Date getFecha(){
      return fecI;
  }

   



    
    



}

