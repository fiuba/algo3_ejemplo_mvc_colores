package model;

import javax.swing.JFrame;

import view.VentanaColor;
import view.VentanaTexto;

public class Juego {

    int tamanioGrilla = 20;

    ModeloObservable modelo;

    public void iniciar() {

        inicializarModelo();

        completarModelo();

        crearVentanas();
    }

    private void crearVetanaColor() {

        JFrame ventanaColor = new VentanaColor(tamanioGrilla, modelo);

        ventanaColor.setSize(500, 400);

        ventanaColor.setLocation(8, 0);

        ventanaColor.setVisible(true);

        ventanaColor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void crearVetanaTexto() {

        JFrame ventanaTexto = new VentanaTexto(tamanioGrilla, modelo);

        ventanaTexto.setSize(500, 400);
        ventanaTexto.setLocation(516, 0);
        ventanaTexto.setVisible(true);

        ventanaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void crearVentanas() {

        crearVetanaTexto();
        crearVetanaColor();
    }

    private void inicializarModelo() {

        modelo = new ModeloObservable(tamanioGrilla);
    }

    private void completarModelo() {

        for (int x = 0; x < tamanioGrilla; x++) {

            for (int y = 0; y < tamanioGrilla; y++) {

                int numeroAleatorio = (int) (Math.random() * 6);

                modelo.setModeloDato(new Posicion(x, y), numeroAleatorio);
            }
        }
    }

}
