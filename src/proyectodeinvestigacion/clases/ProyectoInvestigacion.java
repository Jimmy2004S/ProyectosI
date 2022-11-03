
package proyectodeinvestigacion.clases;

import java.util.Date;


public class ProyectoInvestigacion {

   
private String acronimo;
private String objetivo;
private String LiderProyecto;     
  

    public void ProyectoInvestigacion(){  
        
    }

   
    public String getLiderProyecto() {
        return LiderProyecto;
    }

    public void setLiderProyecto(String LiderProyecto) {
        this.LiderProyecto = LiderProyecto;
    }


    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }


    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
 

 
    //METODOS GET

    public String getAcronimo() {
        return acronimo;
    }
    
    public String getObjetivo() {
        return objetivo;
    }
    
}

