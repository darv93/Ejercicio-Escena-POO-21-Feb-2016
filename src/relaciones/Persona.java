package relaciones;

public class Persona{

    
    private String nombre;
    public Oficina trabaja;
    
    public Persona (String nombre){
        this.nombre=nombre;
    
    }
    
    public String darDireccion(){
        return this.trabaja.darDireccion();
 }
 
 }
