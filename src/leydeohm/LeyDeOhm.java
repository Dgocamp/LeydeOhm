/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydeohm;

import controlador.Controlador;
import modelo.Modelo;
import vista.Calculadora;
import vista.Plataforma;

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
        Calculadora ca = new Calculadora();
        Modelo m = new Modelo(p,ca);       
        Controlador c = new Controlador(p,ca,m);
        p.setVisible(true);
    }
    
}
