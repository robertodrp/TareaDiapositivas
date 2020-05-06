
package ico.fes.awt;


import java.awt.Frame;
import java.awt.HeadlessException;


public class Ventana extends Frame{
    
    private String titulos;
    private int alto;
    private int ancho;
 

    public Ventana() throws HeadlessException {
        super("Sin título");
        super.setSize(200, 200);
    }

    public Ventana(String titulo, int alto, int ancho) throws HeadlessException {
        super(titulo);
        this.titulos = titulo;
        this.alto = alto;
        this.ancho = ancho;
        super.setSize(ancho , alto);
    }

    public String getTitulo() {
        return titulos;
    }

    public void setTitulo(String titulo) {
        this.titulos = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
    
}
