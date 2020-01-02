package org.componentes.elevadores;

import org.componentes.sensores.Bascula;
import org.componentes.sensores.Nivel;

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
            this.ir(i );
        } else {
            this.avisoSobrecarga();
        }
        this.abrirPuerta();
    }

    private void ir(int i) {
        Nivel planta = new Nivel();
        if ((i - this.getPosicionActual())<0) {
            for (int j=this.posicionActual; j==i; j++) {
                planta.subir();
            }
        } else {
            for (int j=this.getPosicionActual(); j==i; j--){
                planta.bajar();
            }
        }
    }

    private int getPosicionActual() {
        Nivel altura = new Nivel();
        return altura.getPlanta();
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
