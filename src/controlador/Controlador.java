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
        /*
        p.btngraficar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.CargarGrafico();
            }
            
        });*/
        p.pila.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.encender();
            }
            
        });
        p.calcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.open();
            }
            
        });
        c.calcu2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //m.i=0;
                 m2.open();
            }
            
        });
        /*c.resultado.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.operar();     
            }            
        });
        c.resultado.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m2.operar();     
            }            
        });
        c.resultado2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.operar2();     
            }            
        });
        c.resultado2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m2.operar2();     
            }            
        });*/
        c.limpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.limpiar();     
            }            
        });
        p2.calcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m2.open();
            }
            
        });
        p2.pila.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m2.encender();
            }
            
        });
        c.Universal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pro.especificarTipo();    
            }            
        });
  
    }
    
}
