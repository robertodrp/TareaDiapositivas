
package ico.fes.flo;



import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout extends Frame {
    Button btn = new Button("Norte");
    Button btn2 = new Button("Sur");
    Button btn3 = new Button("Este");
    Button btn4 = new Button("Oeste");
  
    
    
    public FlowLayout(){
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        setLayout((LayoutManager) new FlowLayout());
        add(btn);
        add(btn2);
        add(btn3);
        add(btn4);
        
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
        FlowLayout principal = new FlowLayout();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}