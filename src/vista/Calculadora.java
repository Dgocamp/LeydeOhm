/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.MouseInfo;
import java.awt.Point;


/**
 *
 * @author UsuarioN°1000
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    private int x;
    private int y;
    public Calculadora() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vtext = new javax.swing.JTextField();
        rtext = new javax.swing.JTextField();
        itext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizarra = new javax.swing.JTextArea();
        rtext1 = new javax.swing.JTextField();
        rtext2 = new javax.swing.JTextField();
        itext1 = new javax.swing.JTextField();
        itext2 = new javax.swing.JTextField();
        resultado2 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        calcu2 = new javax.swing.JButton();
        vtext1 = new javax.swing.JTextField();
        vtext2 = new javax.swing.JTextField();
        resultado3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(567, 427));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        vtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vtextKeyTyped(evt);
            }
        });
        getContentPane().add(vtext);
        vtext.setBounds(97, 72, 48, 19);

        rtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rtextKeyTyped(evt);
            }
        });
        getContentPane().add(rtext);
        rtext.setBounds(97, 198, 48, 19);

        itext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itextKeyTyped(evt);
            }
        });
        getContentPane().add(itext);
        itext.setBounds(97, 135, 48, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/v.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(37, 54, 48, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/r.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(37, 186, 48, 48);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/i.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(37, 120, 48, 48);

        resultado.setText("=");
        getContentPane().add(resultado);
        resultado.setBounds(271, 195, 48, 25);

        pizarra.setColumns(20);
        pizarra.setRows(5);
        jScrollPane1.setViewportView(pizarra);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(37, 252, 280, 128);

        rtext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rtext1KeyTyped(evt);
            }
        });
        getContentPane().add(rtext1);
        rtext1.setBounds(151, 198, 48, 19);

        rtext2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rtext2KeyTyped(evt);
            }
        });
        getContentPane().add(rtext2);
        rtext2.setBounds(205, 198, 48, 19);

        itext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itext1KeyTyped(evt);
            }
        });
        getContentPane().add(itext1);
        itext1.setBounds(151, 135, 48, 19);

        itext2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itext2KeyTyped(evt);
            }
        });
        getContentPane().add(itext2);
        itext2.setBounds(205, 135, 48, 19);

        resultado2.setText("=");
        getContentPane().add(resultado2);
        resultado2.setBounds(271, 132, 48, 25);

        limpiar.setText("Limpiar");
        getContentPane().add(limpiar);
        limpiar.setBounds(400, 270, 80, 25);

        calcu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calc.png"))); // NOI18N
        calcu2.setBorderPainted(false);
        calcu2.setContentAreaFilled(false);
        calcu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcu2.setFocusPainted(false);
        getContentPane().add(calcu2);
        calcu2.setBounds(410, 310, 68, 58);

        vtext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vtext1KeyTyped(evt);
            }
        });
        getContentPane().add(vtext1);
        vtext1.setBounds(151, 72, 48, 19);

        vtext2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vtext2KeyTyped(evt);
            }
        });
        getContentPane().add(vtext2);
        vtext2.setBounds(205, 72, 48, 19);

        resultado3.setText("=");
        getContentPane().add(resultado3);
        resultado3.setBounds(271, 69, 48, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ohmsLawTriangle.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 70, 170, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged
    private void validar(java.awt.event.KeyEvent evt){
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }
    private void vtextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vtextKeyTyped
        // TODO add your handling code here:
        validar(evt);
      
    }//GEN-LAST:event_vtextKeyTyped

    private void rtextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtextKeyTyped
        // TODO add your handling code here:
        validar(evt);
    }//GEN-LAST:event_rtextKeyTyped

    private void rtext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtext1KeyTyped
        // TODO add your handling code here:
        validar(evt);
    }//GEN-LAST:event_rtext1KeyTyped

    private void rtext2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtext2KeyTyped
        // TODO add your handling code here:
        validar(evt);
    }//GEN-LAST:event_rtext2KeyTyped

    private void itextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itextKeyTyped
        // TODO add your handling code here:
        validar(evt);
    }//GEN-LAST:event_itextKeyTyped

    private void itext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itext1KeyTyped
        // TODO add your handling code here:
        validar(evt);
    }//GEN-LAST:event_itext1KeyTyped

    private void itext2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itext2KeyTyped
        // TODO add your handling code here:
        validar(evt);
    }//GEN-LAST:event_itext2KeyTyped

    private void vtext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vtext1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_vtext1KeyTyped

    private void vtext2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vtext2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_vtext2KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton calcu2;
    public javax.swing.JTextField itext;
    public javax.swing.JTextField itext1;
    public javax.swing.JTextField itext2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton limpiar;
    public javax.swing.JTextArea pizarra;
    public javax.swing.JButton resultado;
    public javax.swing.JButton resultado2;
    public javax.swing.JButton resultado3;
    public javax.swing.JTextField rtext;
    public javax.swing.JTextField rtext1;
    public javax.swing.JTextField rtext2;
    public javax.swing.JTextField vtext;
    public javax.swing.JTextField vtext1;
    public javax.swing.JTextField vtext2;
    // End of variables declaration//GEN-END:variables
}