package net.pruebas.basicas;

import org.componentes.elevadores.Ascensor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class AscensorTest {

    @org.junit.jupiter.api.Test
    void setPlantaActual() {

    }

    @org.junit.jupiter.api.Test
    void llamar() {
        Ascensor elevador = new Ascensor(300);
        elevador.llamar(6);
        assertEquals(6,elevador.getPlantaActual());
    }

    @org.junit.jupiter.api.Test
    void getPlantaActual() {
    }
}