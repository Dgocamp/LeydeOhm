/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydeohm;

import controlador.Controlador;
import modelo.Modelo;
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
        Modelo m = new Modelo(p);
        Controlador c = new Controlador(p,m);
        p.setVisible(true);
    }
    
}
