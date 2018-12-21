/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Gerson
 */
public class Ventana  extends JFrame{
    private final int ANCHO=800 ,ALTO=500;
    private TableroJuego lamina;
    private Hilo hilo;
    public Ventana(){
         setTitle("Pong");
         setSize(ANCHO,ALTO);
         setLocationRelativeTo(null);
         setResizable(false);
        lamina=new TableroJuego();
        add(lamina);
        addKeyListener( new EventoTeclado());
           setVisible(true);
           
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo =new Hilo(lamina);
        hilo.start();
     //   lamina.iterarjuego();
        
     }
}
