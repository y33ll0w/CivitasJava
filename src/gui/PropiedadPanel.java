/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.TituloPropiedad;

/**
 *
 * @author thejoker
 */
public class PropiedadPanel extends javax.swing.JPanel {
    private TituloPropiedad tituloPropiedad;
    
    /**
     * Creates new form PropiedadPanel
     */
    public PropiedadPanel() {
        initComponents();
    }

    void setPropiedad(TituloPropiedad tituloPropiedad) {
        String estado;
        
        this.tituloPropiedad = tituloPropiedad;
        
        this.nombrePropiedadTextField.setText(tituloPropiedad.getNombre());
        this.casasTextField.setText(Integer.toString(tituloPropiedad.getNumCasas()));
        this.hotelesTextField.setText(Integer.toString(tituloPropiedad.getNumHoteles()));
        estado = (tituloPropiedad.getHipotecado()) ? "Si" : "No";
        this.hipotecadaTextField.setText(estado);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombrePropiedadLabel = new javax.swing.JLabel();
        nombrePropiedadTextField = new javax.swing.JTextField();
        casasLabel = new javax.swing.JLabel();
        casasTextField = new javax.swing.JTextField();
        hotelesLabel = new javax.swing.JLabel();
        hotelesTextField = new javax.swing.JTextField();
        hipotecadaLabel = new javax.swing.JLabel();
        hipotecadaTextField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(250, 105));

        jPanel1.setPreferredSize(new java.awt.Dimension(240, 100));

        nombrePropiedadLabel.setText("Nombre:");
        nombrePropiedadLabel.setToolTipText("Nombre");
        jPanel1.add(nombrePropiedadLabel);

        nombrePropiedadTextField.setToolTipText("Nombre");
        nombrePropiedadTextField.setEnabled(false);
        jPanel1.add(nombrePropiedadTextField);

        casasLabel.setText("Nº Casas:");
        casasLabel.setToolTipText("Numero de casas");
        jPanel1.add(casasLabel);

        casasTextField.setToolTipText("Numero de casas");
        casasTextField.setEnabled(false);
        jPanel1.add(casasTextField);

        hotelesLabel.setText("Nº de Hoteles:");
        hotelesLabel.setToolTipText("Numero de hoteles");
        jPanel1.add(hotelesLabel);

        hotelesTextField.setToolTipText("Numero de hoteles");
        hotelesTextField.setEnabled(false);
        jPanel1.add(hotelesTextField);

        hipotecadaLabel.setText("Hipotecada:");
        hipotecadaLabel.setToolTipText("hipotecada");
        jPanel1.add(hipotecadaLabel);

        hipotecadaTextField.setToolTipText("hipotecada");
        hipotecadaTextField.setEnabled(false);
        jPanel1.add(hipotecadaTextField);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel casasLabel;
    private javax.swing.JTextField casasTextField;
    private javax.swing.JLabel hipotecadaLabel;
    private javax.swing.JTextField hipotecadaTextField;
    private javax.swing.JLabel hotelesLabel;
    private javax.swing.JTextField hotelesTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombrePropiedadLabel;
    private javax.swing.JTextField nombrePropiedadTextField;
    // End of variables declaration//GEN-END:variables
}
