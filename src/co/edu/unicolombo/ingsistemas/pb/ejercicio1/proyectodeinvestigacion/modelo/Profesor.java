package co.edu.unicolombo.ingsistemas.pb.ejercicio1.proyectodeinvestigacion.modelo;

public class Profesor {

    private String nombres;
    private String despacho;
    private String cargo;

    public Profesor(){
        
    }
    

   
    //METODOS SET
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    
    //METODOS GET

    public String getNombres() {
        return nombres;
    }


    public String getDespacho() {
        return despacho;
    }
    
    
    public String getCargo(){
        return cargo;
    }
    
//     public String toString() {
//       String datos = "";
//       datos += nombres;
//       datos +=  despacho;
//       datos += cargo ;
//       return datos;
//     }

}



    