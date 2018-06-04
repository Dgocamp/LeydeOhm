/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class Modelo {
    Plataforma p;

    public Modelo(Plataforma p) {
        this.p = p;
    }
    
    public void CargarGrafico(){
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
    }
    
    
}
