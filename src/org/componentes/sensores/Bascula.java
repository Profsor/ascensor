package org.componentes.sensores;

public class Bascula {

    public static final int MAXIMO_PESO = 600;
    public static final int MINIMO_PESO = 10;

    /**
     *  Genera un valor aleatorio para establecer el peso de carga en el ascensor.
     *  El valor está comprendido entre el MAXIMO_PESO y MINIMO_PESO.
     * @return Devuelve el valor entero
     */
    public int getPeso() {
        int pesoActual = (int) Math.floor(Math.random()*(MAXIMO_PESO - MINIMO_PESO +1)+MINIMO_PESO);
        return pesoActual;
    }

}
