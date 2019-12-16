/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.Casilla;
import civitas.CasillaCalle;
import civitas.CasillaImpuesto;
import civitas.CasillaJuez;
import civitas.CasillaSorpresa;

/**
 *
 * @author thejoker
 */
public class CasillaPanel extends javax.swing.JPanel {
    Casilla casilla;
        
    /**
     * Creates new form CasillaPanel
     */
    public CasillaPanel() {
        initComponents();
    }

    void setCasilla(Casilla casilla) {
        this.removeAll();
        
        if (casilla instanceof CasillaCalle) {
            
        } else if (casilla instanceof CasillaImpuesto) {
        
        } else if (casilla instanceof CasillaJuez) {
        
        } else if (casilla instanceof CasillaSorpresa) {
        
        } else {
            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Casilla Actual"));

        jLabel1.setText("Nombre:");
        jLabel1.setToolTipText("nombre");
        add(jLabel1);

        jTextField1.setToolTipText("nombre");
        jTextField1.setEnabled(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(90, 26));
        add(jTextField1);

        jLabel2.setText("Importe:");
        jLabel2.setToolTipText("importe");
        add(jLabel2);

        jTextField2.setToolTipText("importe");
        jTextField2.setEnabled(false);
        jTextField2.setPreferredSize(new java.awt.Dimension(90, 26));
        add(jTextField2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
