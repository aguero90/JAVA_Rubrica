/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author alex
 */
public class AscoltatoreFEMC implements ActionListener{
    
    public static final String MODIFICA = "modifica";
    public static final String ELIMINA = "elimina";
    private FinestraEliminaModificaContatto femc;
    
    public AscoltatoreFEMC(FinestraEliminaModificaContatto f){
        this.femc = f;
    }
    
    public void actionPerformed(ActionEvent e){
        String azione = e.getActionCommand();
        switch(azione){
            case MODIFICA: ApriModificaContatto(); break;
            
            case ELIMINA: EliminaContatto(); break;
                
            default: JOptionPane.showMessageDialog(null, "Errore in riga 29 Ascoltatore");
        }
    }
    
    public void ApriModificaContatto(){
        femc.dispose();
        FinestraModificaContatto fmc = new FinestraModificaContatto();
        String[] s = femc.getJComboText().split(" ");
        fmc.setNomeText(s[0].concat(" ".concat(s[1])));
        fmc.setNumeroText(s[2]);
    }
    
    public void EliminaContatto(){
        femc.dispose();
        String[] s = femc.getJComboText().split(" ");
        Nodo n = new Nodo(s[0].concat(" ".concat(s[1])), s[2]);
        Lista.CancellaContatto(n);//problema! dice che il contatto da cercare non c'è
    }
    
}
