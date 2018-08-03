/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydeohm;

import controlador.Controlador;
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
public class LeyDeOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plataforma p = new Plataforma();
        Plataforma2 p2 = new Plataforma2();
        Calculadora ca = new Calculadora();      
        Modelo m = new Modelo(p,ca);  
        Modelo2 m2 = new Modelo2(p2,ca); 
        procesos pro = new procesos(ca,m,m2);
        Controlador c = new Controlador(p,p2,ca,m,m2,pro);
        p.setVisible(true);
        p2.setVisible(true);
        System.out.println("Software LDH");
        
    }
    
}
