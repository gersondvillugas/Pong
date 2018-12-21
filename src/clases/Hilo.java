/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerson
 */
public class Hilo extends Thread {
    TableroJuego lamina;
    public Hilo(TableroJuego lamina){
        this.lamina=lamina;
    }
    public void run(){
        while(true){
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
        }
    }
}
