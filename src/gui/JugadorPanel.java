/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.Jugador;
import civitas.TituloPropiedad;
import java.util.ArrayList;

/**
 *
 * @author thejoker
 */
public class JugadorPanel extends javax.swing.JPanel {
    private Jugador jugador;
    
    /**
     * Creates new form JugadorPanel
     */
    public JugadorPanel() {
        initComponents();
    }

    void setJugador(Jugador jugador) {
        String estado;
                
        this.jugador = jugador;
        
        nombreTextField.setText(jugador.getNombre());
        saldoTextField.setText(Float.toString(jugador.getSaldo()));
        estado = (jugador.isEncarcelado()) ? "Si" : "No";
        encarceladoTextField.setText(estado);
        estado = (jugador.isEncarcelado()) ? "Si" : "No";
        especuladorTextField.setText(estado);
        
        this.rellenaPropiedades(jugador.getPropiedades());
    }
    
    private void rellenaPropiedades(ArrayList<TituloPropiedad> lista) {
        // Se elimina la informacion antigua
        propiedades.removeAll();
        
        // Se recorre la lista de propiedades para ir creando sus vistas individuales y añadirlas al panel
        
        for( TituloPropiedad t :lista) {
            PropiedadPanel vistaPropiedad = new PropiedadPanel();
            vistaPropiedad.setPropiedad(t);
            
            propiedades.add(vistaPropiedad);
            vistaPropiedad.setVisible(true);
        }
        // Se fuerza la actualizacion visual del panel de propiedades y el panel del jugador
        
        repaint();
        revalidate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        propiedades = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        saldoLabel = new javax.swing.JLabel();
        saldoTextField = new javax.swing.JTextField();
        encarceladoLabel = new javax.swing.JLabel();
        encarceladoTextField = new javax.swing.JTextField();
        especuladorLabel = new javax.swing.JLabel();
        especuladorTextField = new javax.swing.JTextField();

        setToolTipText("Propiedades del jugador");
        setLocation(new java.awt.Point(50, 50));
        setLayout(new java.awt.BorderLayout());

        propiedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Propiedades"));
        add(propiedades, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jugador Actual"));

        nombreLabel.setText("Nombre:");
        nombreLabel.setToolTipText("Nombre");
        jPanel1.add(nombreLabel);

        nombreTextField.setToolTipText("Nombre del jugador");
        nombreTextField.setEnabled(false);
        nombreTextField.setPreferredSize(new java.awt.Dimension(90, 26));
        jPanel1.add(nombreTextField);

        saldoLabel.setText("Saldo:");
        saldoLabel.setToolTipText("Saldo");
        jPanel1.add(saldoLabel);

        saldoTextField.setToolTipText("Saldo del jugador");
        saldoTextField.setEnabled(false);
        saldoTextField.setPreferredSize(new java.awt.Dimension(90, 26));
        jPanel1.add(saldoTextField);

        encarceladoLabel.setText("Encarcelado:");
        encarceladoLabel.setToolTipText("Encarcelado");
        jPanel1.add(encarceladoLabel);

        encarceladoTextField.setToolTipText("");
        encarceladoTextField.setEnabled(false);
        encarceladoTextField.setPreferredSize(new java.awt.Dimension(90, 26));
        jPanel1.add(encarceladoTextField);

        especuladorLabel.setText("Especulador:");
        especuladorLabel.setToolTipText("Especulador");
        jPanel1.add(especuladorLabel);

        especuladorTextField.setEnabled(false);
        especuladorTextField.setPreferredSize(new java.awt.Dimension(90, 26));
        jPanel1.add(especuladorTextField);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encarceladoLabel;
    private javax.swing.JTextField encarceladoTextField;
    private javax.swing.JLabel especuladorLabel;
    private javax.swing.JTextField especuladorTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPanel propiedades;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTextField saldoTextField;
    // End of variables declaration//GEN-END:variables
}