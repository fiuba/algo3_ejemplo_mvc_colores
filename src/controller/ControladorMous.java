package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.ModeloObservable;
import view.VistaModeloDato;

public class ControladorMous extends MouseAdapter {

    ModeloObservable modelo;

    VistaModeloDato vista;

    public ControladorMous(ModeloObservable modelo, VistaModeloDato vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mousePressed(MouseEvent mouseEvent) {

        // Ojo al piojo.
        // El manejo de las coordenadas del mouse debe ser encapsulado por la clase Posicion
        // modelo.inicializarModeloDato(new Posicion(mouseEvent.getX(), mouseEvent.getY()));

        modelo.inicializarModeloDato(vista.posicion);
        modelo.notifyObservers(vista);
    }
}
