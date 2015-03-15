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
public class AscoltatoreFP implements ActionListener {
    
    //ascoltatori per "FinestraPrincipale"
    public final static String INSERISCICONTATTO = "inserisci";
    public final static String CERCACONTATTO = "cerca";
    public final static String ELIMINAMODIFICACONTATTO = "eliminamodifica";
    //private Frame[] frame; 
    private JFrame fp;
    private FinestraInserisciContatto fic;
    private FinestraCercaContatto fcc;
    private FinestraEliminaModificaContatto femc;
    private FinestraModificaContatto fmc;
    
    public AscoltatoreFP(JFrame f){
        this.fp = f;
    }
    
    public void actionPerformed(ActionEvent e){
        String azione = e.getActionCommand();
        switch(azione){
            case INSERISCICONTATTO: ApriInserisciContatto(); break;
            case CERCACONTATTO: ApriCercaContatto(); break;
            case ELIMINAMODIFICACONTATTO: ApriEliminaModificaContatto(); break;
            default: JOptionPane.showMessageDialog(null, "Errore in riga 26 Ascoltatore");
         }
     }
    
    public void ApriInserisciContatto(){
        //Problema: COme faccio ad ottenere il riferimenro a 'FinestraPrincipale' e a 'FInestraInserisciCOntatto'?
        //frame = FinestraPrincipale.getFrames(); //se non uso il costruttore
        //frame[0].setVisible(false);
        //fp.setVisible(false); // se uso il costruttore
        fp.dispose();
        fic = new FinestraInserisciContatto();
    }
    
    public void ApriCercaContatto(){
        //frame = FinestraPrincipale.getFrames();
        //frame[0].setVisible(false);
        fp.dispose();
        fcc = new FinestraCercaContatto();
    }
    
    public void ApriEliminaModificaContatto(){
        //frame = FinestraPrincipale.getFrames();
        //frame[0].setVisible(false);
        fp.dispose();
        femc = new FinestraEliminaModificaContatto();
    }
    
}
