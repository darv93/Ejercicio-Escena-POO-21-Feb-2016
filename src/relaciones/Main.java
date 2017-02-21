
package relaciones;
/**/


public class Main{
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Oficina f= new Oficina ("Bug");
        Persona p = new Persona("fa");
        p.trabaja=f; //relacion
        System.out.println(p.darDireccion());
    }

}








    
    
    
    
 


