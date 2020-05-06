
package ico.fes.ev;

    
import ico.fes.awt.Ventana;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class eventoBásico extends Frame {

    public eventoBásico() {
        super("Mi primer ventana AWT");
        setSize(600, 340);
        
        addWindowListener(
            new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }

    public static void main(String[] args) {
        Ventana principal = new Ventana();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}