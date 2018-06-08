/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Calculadora;
import vista.Plataforma;

/**
 *
 * @author UsuarioN°1000
 */
public class Controlador {
    Plataforma p;
    Calculadora c;
    Modelo m;

    public Controlador(Plataforma p, Calculadora c, Modelo m) {
        this.p = p;
        this.c = c;
        this.m = m;
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
        c.resultado.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.operar();
            }
            
        });
    }
    
}
