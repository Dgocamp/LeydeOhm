/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import vista.Calculadora;
import vista.Plataforma;
import vista.Plataforma2;

/**
 *
 * @author UsuarioN°1000
 */
public class procesos {
    Calculadora ca;
    Modelo m;
    Modelo2 m2;

    public procesos(Calculadora ca, Modelo m, Modelo2 m2) {
        this.ca = ca;
        this.m = m;
        this.m2 = m2;
    }
    public void vlimpiar(){
        ca.vtext.setText("");
        ca.vtext1.setText("");
        ca.vtext2.setText("");
        ca.vtotal.setText("");
    }
    public void ilimpiar(){
        ca.itext.setText("");
        ca.itext1.setText("");
        ca.itext2.setText("");
        ca.itotal.setText("");
    }
    public void rlimpiar(){
        ca.rtext.setText("");
        ca.rtext1.setText("");
        ca.rtext2.setText("");
        ca.rtotal.setText("");
    }
    public void cerrarCalculadora(){
        ca.dispose();
    }
    public void especificarTipo(){
  
        if(ca.opcSerie.getSelectedIndex()==1){          
            m2.operarSerie();
        }
        if(ca.opcSerie.getSelectedIndex()==2){                   
            m2.operarSerie2(); 
        }
        if(ca.opcSerie.getSelectedIndex()==3){                     
            m2.operarSerie3(); 
        }
        if(ca.opcSerie.getSelectedIndex()==4){                     
            m2.operarSerie4(); 
        }
        if(ca.opcParalelo.getSelectedIndex()==1){
            m.operarParalelo();          
        }
        if(ca.opcParalelo.getSelectedIndex()==2){
            m.operarParalelo2();           
        }
        if(ca.opcParalelo.getSelectedIndex()==3){
            m.operarParalelo3();           
        }
        if(ca.opcParalelo.getSelectedIndex()==4){
            m.operarParalelo4();          
        }
    }
    
}
