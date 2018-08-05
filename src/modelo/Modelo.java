/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import vista.Calculadora;
import vista.Plataforma;

/**
 *
 * @author UsuarioN°1000
 */
public class Modelo implements Runnable{
    Plataforma p;
    Thread t;
    Calculadora ca;
    private double r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal;
    public Modelo(Plataforma p, Calculadora ca) {
        this.p = p;
        this.ca = ca;
        ca.setLocationRelativeTo(null);
        p.setTitle("Ley de Ohm - Circuito en paralelo");
        
    }
    
    boolean validar(){
        if (ca.vtotal.getText().isEmpty()||ca.rtext.getText().isEmpty()||ca.rtext1.getText().isEmpty()||ca.rtext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    boolean validar2(){
        if (ca.itotal.getText().isEmpty()||ca.rtext.getText().isEmpty()||ca.rtext1.getText().isEmpty()||ca.rtext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    boolean validar3(){
        if (ca.vtotal.getText().isEmpty()||ca.itext.getText().isEmpty()||ca.itext1.getText().isEmpty()||ca.itext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    boolean validar4(){
        if (ca.rtotal.getText().isEmpty()||ca.itext.getText().isEmpty()||ca.itext1.getText().isEmpty()||ca.itext2.getText().isEmpty()){
            return true;
        }else{
            return false;
        }      
    }
    public void encenderCalculadora(){
        ca.setVisible(true);
    }

    public void encender(){
        t=new Thread(this);
        t.start();
        System.out.println("caca");
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
       
    public void operarParalelo(){
        if(validar()){
            JOptionPane.showMessageDialog(null,"Completar Resistencia 1 2 3 - Voltaje total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            r1=Double.parseDouble(ca.rtext.getText());
            r2=Double.parseDouble(ca.rtext1.getText());
            r3=Double.parseDouble(ca.rtext2.getText());
            volTotal=Double.parseDouble(ca.vtotal.getText());
            resTotal =1/((1/r1)+(1/r2)+(1/r3)); 
            inTotal=volTotal/resTotal;   
            in1=volTotal/r1;
            in2=volTotal/r2;
            in3=volTotal/r3;  
            ca.pizarra.setText(ca.pizarra.getText()+" Tipo de circuito: Paralelo\n");
            ca.pizarra.setText(ca.pizarra.getText()+" Valores otorgados: R1,R2,R3 y V total\n");
            imprimir(r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal,volTotal,volTotal,volTotal);
          
        }     
    }
    public void operarParalelo2(){
        if(validar2()){
            JOptionPane.showMessageDialog(null,"Completar Resistencia 1 2 3 - Intensidad total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            r1=Double.parseDouble(ca.rtext.getText());
            r2=Double.parseDouble(ca.rtext1.getText());
            r3=Double.parseDouble(ca.rtext2.getText());
            inTotal=Double.parseDouble(ca.itotal.getText());
            resTotal =1/((1/r1)+(1/r2)+(1/r3)); 
            volTotal=inTotal*resTotal;   
            in1=volTotal/r1;
            in2=volTotal/r2;
            in3=volTotal/r3; 
            ca.pizarra.setText(ca.pizarra.getText()+" Tipo de circuito: Paralelo\n");
            ca.pizarra.setText(ca.pizarra.getText()+" Valores otorgados: R1,R2,R3 y I total\n");
            imprimir(r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal,volTotal,volTotal,volTotal);
          
        }     
    }
    public void operarParalelo3(){
        if(validar3()){
            JOptionPane.showMessageDialog(null,"Completar Intensidad 1 2 3 - Voltaje total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            in1=Double.parseDouble(ca.itext.getText());
            in2=Double.parseDouble(ca.itext1.getText());
            in3=Double.parseDouble(ca.itext2.getText());
            volTotal=Double.parseDouble(ca.vtotal.getText());
            inTotal=in1+in2+in3;
            resTotal=volTotal/inTotal;
            r1=volTotal/in1;
            r2=volTotal/in2;
            r3=volTotal/in3; 
            ca.pizarra.setText(ca.pizarra.getText()+" Tipo de circuito: Paralelo\n");
            ca.pizarra.setText(ca.pizarra.getText()+" Valores otorgados: I1,I2,I3 y V total\n");
            imprimir(r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal,volTotal,volTotal,volTotal);
          
        }     
    }
    public void operarParalelo4(){
        if(validar4()){
            JOptionPane.showMessageDialog(null,"Completar Intensidad 1 2 3 - Resistencia total", "Error", JOptionPane.ERROR_MESSAGE);

        }else{           
            in1=Double.parseDouble(ca.itext.getText());
            in2=Double.parseDouble(ca.itext1.getText());
            in3=Double.parseDouble(ca.itext2.getText());
            resTotal=Double.parseDouble(ca.rtotal.getText());
            inTotal=in1+in2+in3;
            volTotal=inTotal*resTotal;
            r1=volTotal/in1;
            r2=volTotal/in2;
            r3=volTotal/in3; 
            ca.pizarra.setText(ca.pizarra.getText()+" Tipo de circuito: Paralelo\n");
            ca.pizarra.setText(ca.pizarra.getText()+" Valores otorgados: I1,I2,I3 y R total\n");
            imprimir(r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal,volTotal,volTotal,volTotal);
          
        }     
    }
    public void limpiar(){
        ca.pizarra.setText("");
        
    }

    /*public void CargarGrafico(){
        XYSeries series = new XYSeries("Grafica Ley de Ohm");
        series.add(1,1);
        series.add(2,5);
        series.add(4,3);
        series.add(6,9);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("prueba","tiempo","cantidad",dataset,PlotOrientation.VERTICAL,
                true,false,false);
        ChartFrame frame = new ChartFrame("Ejemplo grafica",chart);
        frame.pack();
        frame.setVisible(true);
    }*/
    
    public void corriente(){
        try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                }
    }

    @Override
    public void run() {
  
            Icon icono = new ImageIcon(getClass().getResource("/iconos/icono1.png"));
            for(int n=0;n<=100;n++){
            p.cable.setValue(n);
            corriente();      
            }
            for(int n=0;n<=100;n++){
            p.cable2.setValue(n);
            corriente();      
            }
            
            for(int n=0,j=100;n<=100;n++,j--){
            p.cable3.setValue(n);
            p.cable5.setBackground(Color.YELLOW);
            p.cable5.setValue(j);
            corriente();       
            }
            p.luz.setIcon(icono);
            for(int n=0,j=100;n<=100;n++,j--){
            p.cable4.setValue(n);
            p.cable6.setBackground(Color.YELLOW);
            p.cable6.setValue(j);
            p.cable8.setBackground(Color.YELLOW);
            p.cable8.setValue(j);
            corriente();      
            }
            p.luz2.setIcon(icono);
            for(int n=100;n>=0;n--){
            p.cable7.setBackground(Color.YELLOW);
            p.cable7.setValue(n);
            p.cable9.setBackground(Color.YELLOW);
            p.cable9.setValue(n);
            p.cable11.setBackground(Color.YELLOW);
            p.cable11.setValue(n);
            corriente();      
            }
            p.luz3.setIcon(icono);
            
            for(int n=100,j=0;n>=0;n--,j++){
            p.cable10.setBackground(Color.YELLOW);
            p.cable10.setValue(n);
            p.cable12.setBackground(Color.YELLOW);
            p.cable12.setValue(n);
            p.cable14.setValue(j);
            corriente();      
            }
            for(int n=100,j=0;n>=0;n--,j++){
            p.cable13.setBackground(Color.YELLOW);
            p.cable13.setValue(n);
            corriente();      
            }
            
            
            
    }

    
    
    

}
