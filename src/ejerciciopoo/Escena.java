package ejerciciopoo;
import ch.aplu.turtle.Turtle;

public class Escena{
  private Turtle tortuga;
  
  public Escena (){
   tortuga = new Turtle();
   tortuga.hideTurtle();
  }
  
  public void cuadrado(double x){
    for (int i=0;i<4;i++){
    tortuga.fd(x);
    tortuga.right(90);
    }
    
  }
  
  public void patron(double x){
    for (int i=0;i<32;i++) {
      cuadrado(x);   
      tortuga.right(11.25);
    }
 }
  
  public void triangulo(double x){
     tortuga.right(30);
     tortuga.fd(x);
     tortuga.right(120);
     tortuga.fd(x);
     tortuga.right(120);
     tortuga.fd(x);
     
  }
  
public void pentagono(double x){
for (int i=0;i<6;i++){
 tortuga.fd(x);
 tortuga.rt(60);
}
}

public void posicion (int x, int y){
tortuga.setPos(x, y);
}
  
  
}