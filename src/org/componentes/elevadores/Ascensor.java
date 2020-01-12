package org.componentes.elevadores;

import org.componentes.sensores.Bascula;
import org.componentes.sensores.Nivel;

public class Ascensor {
    int pesoMax;
    boolean puertaCerrada;
    private int plantaActual;

    public void setPlantaActual(int plantaActual) {
        this.plantaActual = plantaActual;
    }

    /**
     * Crea un ascensor, posicionado en la planta baja (0).
     * Se indica el peso máximo que soporta del ascensor.
     * Comienza en la planta 0, o planta baja.
     * Inicialmente la puerta está cerrada.
     * @param i peso máximo de carga que soporta el ascensor.
     */
    public Ascensor(int i) {
        this.pesoMax = i;
        this.puertaCerrada = true;
        setPlantaActual(0);
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

        if ((i - getPlantaActual()) > 0) {
            for (int j=getPlantaActual(); j < i; j++) {
                setPlantaActual(Nivel.subir(getPlantaActual()));
            }
        } else {
            for (int j = getPlantaActual(); j > i; j--){
                setPlantaActual(Nivel.bajar(getPlantaActual()));
            }
        }
    }

    /**
     * Indica la planta actual en la que está el ascensor.
     * @return devuelve el valor de la variable privada
     */
    private int getPlantaActual() {
        return this.plantaActual;
    }

    /**
     * Verifica que la carga del ascensor no supera el máximo permitido.
     * @return devuelve el valor de la variable privada
     */
    private boolean comprobarCarga() {
        Bascula pesaje = new Bascula();
        return pesaje.getPeso() <= this.pesoMax;
    }

    private void cerrarPuerta() {
        this.puertaCerrada = true;
    }

    private void avisoSobrecarga() {
    }

    private void abrirPuerta() {
        this.puertaCerrada = false;
    }
}
