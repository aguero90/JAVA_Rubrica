package rubrica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class AscoltatoreFIC implements ActionListener {
    
    public final static String OK = "Ok";
    private FinestraInserisciContatto fic;
    
    public AscoltatoreFIC(FinestraInserisciContatto f){
        this.fic = f;
    }
    
    public void actionPerformed(ActionEvent e){
        String azione = e.getActionCommand();
        if(azione.equals(OK)){
            Nodo n = new Nodo(fic.getTextNome(), fic.getTextNumero());
            Lista.InserisciContatto(n);
            fic.dispose();
            FinestraPrincipale fp = new FinestraPrincipale();
        }
     }
}
