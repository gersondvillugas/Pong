/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Raqueta.alto;
import static clases.Raqueta.ancho;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Gerson
 */
public class Test02 {
 int dx=1,dy=1;
     final int  ancho=15;
    final int  alto=15;
     int x,y;   
  public static void main(String[] args) {
   
    Pelota pelota=new Pelota();
          
      
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
   
    
