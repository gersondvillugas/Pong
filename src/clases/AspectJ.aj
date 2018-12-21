package clases;
 
// Ready import Point class.
import clases.Pelota;
 import static clases.Raqueta.alto;
import static clases.Raqueta.ancho;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
public aspect AspectJ {
  final int  ancho=15;
    final int  alto=15;
      private int dx=1,dy=1;
    // Using target: define object on which the method is called
    // Using args: define args on the method is called
    // Using within: to restrict JoinPoint within ClassTest02
    pointcut callMove(Pelota  pelota, int x, int y)  
                       : call(*  clases.Pelota.move(int,int))
                               && args(x,y) &&target(pelota)  && within(Test02)  ;
 
    before (Pelota pelota, int x, int y) : callMove(pelota,  x, y )  {
         x+=dx;
        y+=dy;
}

      public Rectangle2D getPelota(){
     return new Rectangle2D.Double(x,y,ancho,alto);   
    }
       public void  mover(Rectangle limites,boolean colisionR1,boolean colisionR2){
        x+=dx;
        y+=dy;
       if(colisionR1){
           dx=-dx;
           x=25;
       }
       if(colisionR2){
           dx=-dx;
           x=755;
       }
       
    if(x>limites.getMaxX()){
     dx=-dx;
     
    }
    if(y>limites.getMaxY()){
        dy=-dy;
        
    }
    
    if(x<0){
     dx=-dx;    
    }
    if(y<0){
        dy=-dy;
    }
   
    }
    
    
 
}
