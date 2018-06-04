/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Plataforma;

/**
 *
 * @author UsuarioN°1000
 */
public class Controlador {
    Plataforma p;
    Modelo m;

    public Controlador(Plataforma p, Modelo m) {
        this.p = p;
        this.m = m;
        graficar();
    }
    
    public void graficar(){
        p.btngraficar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 m.CargarGrafico();
            }
            
        });
    }
    
}
