package org.componentes.sensores;

public class Nivel {

    public static int subir(int valor) {
        valor = valor + 1;
        return valor;
    }

    public static int bajar(int valor) {
        valor = valor - 1;
        return valor;
    }
}
