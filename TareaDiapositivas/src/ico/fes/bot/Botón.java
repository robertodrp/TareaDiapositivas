
package ico.fes.bot;


import java.awt.Button;
import java.awt.Frame;

public class Botón  extends Frame {
Button boton1;
    public Botón() {
        super("Mi primer ventana AWT");
        setSize(600, 340);
        boton1 = new Button("Boton 1");
        add(boton1);
    }

    public static void main(String[] args) {
        Botón principal = new Botón();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}