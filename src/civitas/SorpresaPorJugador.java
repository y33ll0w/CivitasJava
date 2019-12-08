/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civitas;

import java.util.ArrayList;

/**
 *
 * @author thejoker
 */
public class SorpresaPorJugador extends Sorpresa {

    SorpresaPorJugador(int valor, String texto) {
        super(valor, texto);
    }

    @Override
    void aplicarAJugador(int actual, ArrayList<Jugador> todos) {
        if (super.jugadorCorrecto(actual, todos)) {
            super.informe(actual, todos);
            Jugador jugador = todos.get(actual);
            Sorpresa pago = new SorpresaPagarCobrar( -1 * this.valor, this.texto);

            for (int i = 0; i < todos.size(); i++) {
                if (i != actual) {
                    pago.aplicarAJugador(i, todos);
                }
            }

            Sorpresa cobro = new SorpresaPagarCobrar((todos.size() - 1) * this.valor, this.texto);
            cobro.aplicarAJugador(actual, todos);
        }
    }
}