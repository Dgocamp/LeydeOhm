/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vista.Calculadora;
import vista.Plataforma2;

/**
 *
 * @author UsuarioN°1000
 */
public class Modelo2 implements Runnable{
    
    Plataforma2 p2;
    Thread t;
    Calculadora ca;
    private double r1,r2,r3,resTotal,inTotal,v1,v2,v3,volTotal;
    public Modelo2(Plataforma2 p2, Calculadora ca) {
        this.p2 = p2;
        this.ca = ca;
        ca.setLocationRelativeTo(null);
        p2.setTitle("Ley de Ohm - Circuito en serie");
        
    }
    public void encender(){
        t=new Thread(this);
        t.start();
    }
    public int i=1; //variable para la visibilidad de la calculadora
    public void open(){
        switch(i){
            case 1:
                ca.setVisible(true);
                i=0;
                break;
            case 0:    
                ca.dispose();
                i=1;
                break;
        }    
    }
    public void corriente(){
        try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    boolean validar(){
        if(ca.vtotal.getText().isEmpty()||ca.rtext.getText().isEmpty()||ca.rtext1.getText().isEmpty()||ca.rtext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    boolean validar2(){
        if(ca.itotal.getText().isEmpty()||ca.rtext.getText().isEmpty()||ca.rtext1.getText().isEmpty()||ca.rtext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    boolean validar3(){
        if(ca.rtotal.getText().isEmpty()||ca.vtext.getText().isEmpty()||ca.vtext1.getText().isEmpty()||ca.vtext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    boolean validar4(){
        if(ca.itotal.getText().isEmpty()||ca.vtext.getText().isEmpty()||ca.vtext1.getText().isEmpty()||ca.vtext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    public void operarSerie(){
        if(validar()){
            JOptionPane.showMessageDialog(null,"Completar Resistencia 1 2 3 - Voltaje total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            
            r1=Double.parseDouble(ca.rtext.getText());
            r2=Double.parseDouble(ca.rtext1.getText());
            r3=Double.parseDouble(ca.rtext2.getText());
            volTotal=Double.parseDouble(ca.vtotal.getText());
            resTotal =r1+r2+r3; 
            inTotal=volTotal/resTotal;   
            v1=inTotal*r1;
            v2=inTotal*r2;
            v3=inTotal*r3;  
            imprimir(r1,r2,r3,resTotal,inTotal,inTotal,inTotal,inTotal,v1,v2,v3,volTotal);
           
        }     
    }
    public void operarSerie2(){
        if(validar2()){
            JOptionPane.showMessageDialog(null,"Completar Resistencia 1 2 3 - Intensidad total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
  
            r1=Double.parseDouble(ca.rtext.getText());
            r2=Double.parseDouble(ca.rtext1.getText());
            r3=Double.parseDouble(ca.rtext2.getText());
            inTotal=Double.parseDouble(ca.itotal.getText());
            resTotal =r1+r2+r3; 
            volTotal=inTotal*resTotal;
            v1=inTotal*r1;
            v2=inTotal*r2;
            v3=inTotal*r3;
            imprimir(r1,r2,r3,resTotal,inTotal,inTotal,inTotal,inTotal,v1,v2,v3,volTotal);
        }     
    }
    public void operarSerie3(){
        if(validar3()){
            JOptionPane.showMessageDialog(null,"Completar Voltaje 1 2 3 - Resistencia total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            
            v1=Double.parseDouble(ca.vtext.getText());
            v2=Double.parseDouble(ca.vtext1.getText());
            v3=Double.parseDouble(ca.vtext2.getText());
            resTotal=Double.parseDouble(ca.rtotal.getText());
            volTotal =v1+v2+v3; 
            inTotal=volTotal/resTotal;
            r1=v1/inTotal;
            r2=v2/inTotal;
            r3=v3/inTotal;
            imprimir(r1,r2,r3,resTotal,inTotal,inTotal,inTotal,inTotal,v1,v2,v3,volTotal);
        }     
    }
      public void operarSerie4(){
        if(validar4()){
            JOptionPane.showMessageDialog(null,"Completar Voltaje 1 2 3 - Intensidad total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
      
            v1=Double.parseDouble(ca.vtext.getText());
            v2=Double.parseDouble(ca.vtext1.getText());
            v3=Double.parseDouble(ca.vtext2.getText());
            inTotal=Double.parseDouble(ca.itotal.getText());
            volTotal =v1+v2+v3; 
            resTotal=volTotal/inTotal;
            r1=v1/inTotal;
            r2=v2/inTotal;
            r3=v3/inTotal;
            imprimir(r1,r2,r3,resTotal,inTotal,inTotal,inTotal,inTotal,v1,v2,v3,volTotal);
        }     
    }
    public void imprimir(double r1,double r2,double r3,double resTotal,double in1,double in2,double in3,double inTotal, 
                         double v1,double v2,double v3,double volTotal){
        
        ca.pizarra.setText(ca.pizarra.getText()+" Resistencia 1 = "+r1+" Ω");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Resistencia 2 = "+r2+" Ω");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Resistencia 3 = "+r3+" Ω");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Resitencia total = "+resTotal+" Ω");       
        ca.pizarra.setText(ca.pizarra.getText()+"\n Intensidad 1 = "+in1+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Intensidad 2 = "+in2+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Intensidad 3 = "+in3+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Intensidad total = "+inTotal+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Voltaje 1 = "+v1+" V");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Voltaje 2 = "+v2+" V");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Voltaje 3 = "+v3+" V");
        ca.pizarra.setText(ca.pizarra.getText()+"\n Voltaje total = "+volTotal+" V");
        ca.pizarra.setText(ca.pizarra.getText()+"\n\n");
    }
    @Override
    public void run() {
        Icon icono = new ImageIcon(getClass().getResource("/iconos/icono1.png"));
            for(int n=0;n<=100;n++){
            p2.cable1.setValue(n);
            corriente();      
            }
            for(int n=0;n<=100;n++){
            p2.cable2.setValue(n);
            corriente();      
            }
           
            p2.luz1.setIcon(icono);
            for(int n=0;n<=100;n++){
            p2.cable3.setValue(n);
            corriente();      
            }
            
            for(int n=100;n>=0;n--){
            p2.cable4.setValue(n);
            p2.cable4.setBackground(Color.YELLOW);
            corriente();
            }
            p2.luz2.setIcon(icono);
            for(int n=100;n>=0;n--){
            p2.cable5.setValue(n);
            p2.cable5.setBackground(Color.YELLOW);
            corriente();
            }
            for(int n=100;n>=0;n--){
            p2.cable6.setValue(n);
            p2.cable6.setBackground(Color.YELLOW);
            corriente();
            }
            p2.luz3.setIcon(icono);
            for(int n=100;n>=0;n--){
            p2.cable7.setValue(n);
            p2.cable7.setBackground(Color.YELLOW);
            corriente();
            }
            for(int n=0;n<=100;n++){
            p2.cable8.setValue(n);
            corriente();      
            }     
            
    }
    
}
