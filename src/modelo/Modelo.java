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

    public Modelo(Plataforma p, Calculadora ca) {
        this.p = p;
        this.ca = ca;
    }

    public void open(){
        ca.setVisible(true);
    }
    
    public void encender(){
        t=new Thread(this);
        t.start();
    }
    public void imprimir(double r1,double r2,double r3,double resTotal,double in1,double in2,double in3,double inTotal, 
                         double volTotal){
        
        ca.pizarra.setText("Resistencia 1 = "+r1+" Ω");
        ca.pizarra.setText(ca.pizarra.getText()+"\nResistencia 2 = "+r2+" Ω");
        ca.pizarra.setText(ca.pizarra.getText()+"\nResistencia 3 = "+r3+" Ω");
        ca.pizarra.setText(ca.pizarra.getText()+"\nResitencia total = "+resTotal+" Ω");       
        ca.pizarra.setText(ca.pizarra.getText()+"\nIntensidad 1 = "+in1+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\nIntensidad 2 = "+in2+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\nIntensidad 3 = "+in3+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\nIntensidad total = "+inTotal+" A");
        ca.pizarra.setText(ca.pizarra.getText()+"\nVoltaje total = "+volTotal+" V");
    }
    public void operar(){
        double r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal;
        r1=Double.parseDouble(ca.rtext.getText());
        r2=Double.parseDouble(ca.rtext1.getText());
        r3=Double.parseDouble(ca.rtext2.getText());
        volTotal=Double.parseDouble(ca.vtext.getText());
        resTotal =1/((1/r1)+(1/r2)+(1/r3)); 
        inTotal=volTotal/resTotal;   
        in1=volTotal/r1;
        in2=volTotal/r2;
        in3=volTotal/r3;  
        imprimir(r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal);
    }
    public void operar2(){
        double r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal;
        in1=Double.parseDouble(ca.itext.getText());
        in2=Double.parseDouble(ca.itext1.getText());
        in3=Double.parseDouble(ca.itext2.getText());
        volTotal=Double.parseDouble(ca.vtext.getText());
        inTotal=in1+in2+in3;
        resTotal=volTotal/inTotal;
        r1=volTotal/in1;
        r2=volTotal/in2;
        r3=volTotal/in3; 
        imprimir(r1,r2,r3,resTotal,in1,in2,in3,inTotal,volTotal);
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
