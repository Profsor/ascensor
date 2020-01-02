package org.componentes.elevadores;

import org.componentes.sensores.Bascula;

public class Ascensor {
    int posicionActual;
    int pesoMax;

    public Ascensor(int i) {
        this.pesoMax = i;
        this.posicionActual = 0;
    }

    public void llamar(int i) {
        this.cerrarPuerta();
        if (this.comprobarCarga()) {
            this.ir(i - this.getPosicionActual());
        } else {
            this.avisoSobrecarga();
        }
        this.abrirPuerta();
    }

    private void ir(int i) {
    }

    private int getPosicionActual() {
        return 0;
    }

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
