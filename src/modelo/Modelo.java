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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import vista.Plataforma;

/**
 *
 * @author UsuarioN°1000
 */
public class Modelo implements Runnable{
    Plataforma p;
    Thread t;
    public Modelo(Plataforma p) {
        this.p = p;       
    }
    
    public void encender(){
        t=new Thread(this);
        t.start();
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
            for(int n=0,j=100;n<=100;n++,j--){
            p.cable4.setValue(n);
            p.cable6.setBackground(Color.YELLOW);
            p.cable6.setValue(j);
            p.cable8.setBackground(Color.YELLOW);
            p.cable8.setValue(j);
            corriente();      
            }

            for(int n=100;n>=0;n--){
            p.cable7.setBackground(Color.YELLOW);
            p.cable7.setValue(n);
            p.cable9.setBackground(Color.YELLOW);
            p.cable9.setValue(n);
            p.cable10.setBackground(Color.YELLOW);
            p.cable10.setValue(n);
            p.cable11.setBackground(Color.YELLOW);
            p.cable11.setValue(n);
            corriente();      
            }
        
            
            for(int n=100,j=0;n>=0;n--,j++){
            p.cable12.setBackground(Color.YELLOW);
            p.cable12.setValue(n);
            p.cable13.setBackground(Color.YELLOW);
            p.cable13.setValue(n);
            p.cable14.setValue(j);
            corriente();      
            }
            
            
    }

    
    
    

}
