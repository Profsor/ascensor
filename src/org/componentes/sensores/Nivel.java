package org.componentes.sensores;

public class Nivel {
    /**
     * la variable nivel comienza en el suele nivel 0.
     */
    static int nivel;

    public static void setNivel(int i) {
        nivel = i;
    }

    public static int getNivel() {
        return nivel;
    }

    public void subir() {
        nivel++;
    }

    public void bajar() {
        nivel--;
    }
}
