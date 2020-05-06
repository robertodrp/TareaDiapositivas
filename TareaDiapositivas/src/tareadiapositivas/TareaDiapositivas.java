
package tareadiapositivas;

import ico.fes.awt.Ventana;
import ico.fes.bor.BorderLayOut;
import ico.fes.bot.Botón;
import ico.fes.ev.eventoBásico;
import ico.fes.flo.FlowLayout;
import ico.fes.grid.GridLayOut;
import java.awt.Button;
import ico.fes.gridb.GridBagLayOut;

public class TareaDiapositivas {

     public static void main(String[] args) {
       
        Ventana v = new Ventana();
        v.setVisible(true);
        
        Ventana v2 = new Ventana("Hola mundo AWT", 600, 800);
        v2.setVisible(true);
        
         Button boton1;
         boton1 = new Button("Boton 1");
        add(boton1);
        
       
        GridBagLayOut principal = new GridBagLayOut();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }

    public TareaDiapositivas() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
     
    private static void add(Button boton1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
     

    
       