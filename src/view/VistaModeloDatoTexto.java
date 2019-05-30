package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import model.ModeloObservable;
import model.Posicion;

public class VistaModeloDatoTexto extends VistaModeloDato {

    private static final long serialVersionUID = -8926064027051595160L;

    public VistaModeloDatoTexto(Posicion posicion, ModeloObservable modelo) {
        super(posicion, modelo);
    }

    public void paintComponent(Graphics grafico) {

        super.paintComponent(grafico);

        Dimension dimension = getSize();

        grafico.setColor(Color.white);
        grafico.fillRect(0, 0, dimension.width, dimension.height);

        grafico.setColor(Color.black);
        grafico.setFont(new Font("helvetica", Font.BOLD, 12));

        String dato = Integer.toString(modelo.getModeloDato(posicion));

        grafico.drawString(dato, 10, 10);

    }

    @Override
    protected void updateVista() {
        repaint();

    }

}
