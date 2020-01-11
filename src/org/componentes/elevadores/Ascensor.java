package org.componentes.elevadores;

import org.componentes.sensores.Bascula;
import org.componentes.sensores.Nivel;

public class Ascensor {
    int pesoMax;

    /**
     * Crea un ascensor, posicionado en la planta baja (0).
     * Se indica el peso máximo que soporta del ascensor.
     * @param i peso máximo de carga que soporta el ascensor.
     */
    public Ascensor(int i) {
        this.pesoMax = i;
        Nivel.setNivel(0);
    }

    /**
     * @param i  se trata de la planta destino desde donde se llama al ascensor, o donde se quiere ir.
     *
     *           Realiza las comprobaciones y acciones anteriores y posteriores al movimiento del ascensor.
     */
    public void llamar(int i) {
        this.cerrarPuerta();
        if (this.comprobarCarga()) {
            this.ir(i );
        } else {
            this.avisoSobrecarga();
        }
        this.abrirPuerta();
    }

    /**
     * Acción directa de trasladar el ascensor de una planta a otra.
     * @param i Planta destino.
     */
    private void ir(int i) {
        Nivel altura = new Nivel();
        if ((i - this.getPosicionActual())<0) {
            for (int j=Nivel.getNivel(); j==i; j++) {
                altura.subir();
            }
        } else {
            for (int j=this.getPosicionActual(); j==i; j--){
                altura.bajar();
            }
        }
    }

    /**
     * Indica la planta actual en la que está el ascensor.
     * @return
     */
    private int getPosicionActual() {
        return Nivel.getNivel();
    }

    /**
     * Verifica que la carga del ascensor no supera el máximo permitido.
     * @return
     */
    private boolean comprobarCarga() {
        Bascula pesaje = new Bascula();
        return pesaje.getPeso() <= this.pesoMax;
    }

    private void cerrarPuerta() {
    }

    private void avisoSobrecarga() {
    }

    private void abrirPuerta() {
    }
}
