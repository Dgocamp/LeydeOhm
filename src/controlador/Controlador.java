/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import modelo.Modelo2;
import modelo.procesos;
import vista.Calculadora;
import vista.Plataforma;
import vista.Plataforma2;

/**
 *
 * @author UsuarioN°1000
 */
public class Controlador {
    Plataforma p;
    Plataforma2 p2;
    Calculadora c;
    Modelo m;
    Modelo2 m2;
    procesos pro;

    public Controlador(Plataforma p,Plataforma2 p2, Calculadora c, Modelo m,Modelo2 m2,procesos pro) {
        this.p = p;
        this.p2 = p2;
        this.c = c;
        this.m = m;
        this.m2 = m2;
        this.pro = pro;
        inicio();
    }

   
    
    public void inicio(){

        p.pila.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.encender();
            }
            
        });
        p.calcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.encenderCalculadora();
            }
            
        });
        
        p2.pila.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m2.encender();
            }
            
        });
        p2.calcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m2.encenderCalculadora();
            }
            
        });
        
        
        c.limpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.limpiar();     
            }            
        });
  
        
        c.calculadora.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pro.cerrarCalculadora();  
            }            
        });
        c.Universal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pro.especificarTipo();    
            }            
        });
        c.limpiarv.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pro.vlimpiar();    
            }            
        });
        c.limpiari.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pro.ilimpiar();    
            }            
        });
        c.limpiarr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pro.rlimpiar();    
            }            
        });
  
    }
    
}
