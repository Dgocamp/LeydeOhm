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
    
    public void validarSerie(){
        if(ca.botonV.isSelected()&&ca.botonr.isSelected()){
            m.operarSerie();
        }
        if(ca.botoni.isSelected()&&ca.botonV.isSelected()){
            m.operarSerie2();
        }
   
    }
    public void validarParalelo(){
        if(ca.botonV.isSelected()&&ca.botonr.isSelected()){
            m.operarSerie();
        }
        if(ca.botoni.isSelected()&&ca.botonV.isSelected()){
            m.operarSerie2();
        }
    }
    
    public void especificarTipo(){
        if(ca.opcion.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Especificar tipo de circuito","Información", JOptionPane.INFORMATION_MESSAGE);
        }
        if(ca.opcion.getSelectedIndex()==1){
            validarSerie();
        }
        if(ca.opcion.getSelectedIndex()==2){
            validarParalelo();
            
        }
    }
    
}
