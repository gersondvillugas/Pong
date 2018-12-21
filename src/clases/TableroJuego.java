/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Gerson
 */
public class TableroJuego extends JPanel{
  Pelota pelota=new Pelota();
  Raqueta r1=new Raqueta(10,200);
  Raqueta r2=new Raqueta(794-10-Raqueta.ancho,200);
    public TableroJuego(){
      setBackground(Color.BLACK);
      
  }  
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      Graphics2D g2=(Graphics2D)g;
      g2.setColor(Color.WHITE);
      //g2.fill(new Rectangle2D.Double(0,0,20,20));
         dibujarPuntaje(g2);
      dibujar(g2);
      
      actualizar();
  }
  public void dibujar(Graphics2D g){
          g.fill(pelota.getPelota());
      g.fill(r1.getRaqueta());
      g.fill(r2.getRaqueta());     
      
  }
  public void actualizar(){
     pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));
     r1.moverR1(getBounds());
          r2.moverR2(getBounds());

  }
  private boolean colision(Rectangle2D r){
      return pelota.getPelota().intersects(r);
      
  }
  
    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(pelota.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(pelota.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (pelota.getScore1() == 5) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
        if (pelota.getScore2() == 5) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
    }
}
