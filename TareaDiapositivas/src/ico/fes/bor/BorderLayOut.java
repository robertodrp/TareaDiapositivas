
package ico.fes.bor;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayOut extends Frame {
    Button btn = new Button("Norte");
    Button btn2 = new Button("Sur");
    Button btn3 = new Button("Este");
    Button btn4 = new Button("Oeste");
    
    
    
    public BorderLayOut(){
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        setLayout(new BorderLayout());
        add("North", btn);
        add("South", btn2);
        add("West", btn3);
        add("East", btn4);
        
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
        BorderLayOut principal = new BorderLayOut();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}