package org.componentes.sensores;

public class Nivel {
    static int nivel;

    public int getPlanta() {
        return nivel;
    }

    public void subir() {
        nivel++;
    }

    public void bajar() {
        nivel--;
    }
}
