
package ico.fes.gridb;



        
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayOut extends Frame {
    public GridBagLayOut(){
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gridbag = new GridBagLayout();
        
        setLayout(gridbag);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0; 
        
        Button boton0 = new Button("Boton 0");
        gridbag.setConstraints(boton0, gbc);
        add(boton0);
        Button boton1 = new Button("Boton 1");
        gridbag.setConstraints(boton1, gbc);
        add(boton1);
        Button boton2 = new Button("Boton 2");
        gridbag.setConstraints(boton2, gbc);
        add(boton2);
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        Button boton3 = new Button("Boton 3");
        gridbag.setConstraints(boton3, gbc);
        add(boton3);
        
        Button boton4 = new Button("Boton 4");
        gridbag.setConstraints(boton4, gbc);
        add(boton4);
        
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
        GridBagLayOut principal = new GridBagLayOut();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }

    public void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}