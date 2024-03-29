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
public class SorpresaJugadorEspeculador extends Sorpresa {

    SorpresaJugadorEspeculador(int valor, String texto) {
        super.init();
        this.valor = valor;
        this.texto = texto;
    }

    @Override
    void aplicarAJugador(int actual, ArrayList<Jugador> todos) {
        if (super.jugadorCorrecto(actual, todos)) {
            super.informe(actual, todos);
            Especulador jugador = new Especulador(todos.get(actual), this.valor);
            todos.set(actual, jugador);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n *--* Valor:" + valor + "*--*";
    }
}
