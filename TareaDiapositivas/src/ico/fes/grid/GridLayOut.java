
package ico.fes.grid;


 
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayOut extends Frame {
    Button btn = new Button("Presioname");
    Button btn2 = new Button("En segundo lugar a este");
    Button btn3 = new Button("Despues a este");
    Button btn4 = new Button("Por último este");
    /** Creates a new instance of Ventana2 */
    public GridLayOut(){
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        setLayout(new GridLayout(3,2 ));
        add(btn,0);
        add(btn2,1);
        add(btn3,2);
        add(btn4,3);
        
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
        GridLayOut principal = new GridLayOut();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}