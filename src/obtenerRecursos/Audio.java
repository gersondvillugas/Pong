/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obtenerRecursos;

import java.applet.AudioClip;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class Audio{
    private Object pjp;
    
//Object valorRetorno = pjp.proceed();

  @Around("execution(public * pelota*())")
  public AudioClip getAudio(String direccion)  {
	System.out.println("ANTES");
        Object valorRetorno = pjp;

	System.out.println("DESPUES");
  return java.applet.Applet.newAudioClip(getClass().getResource(direccion));
        
  }
}

