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
public class AscoltatoreFMC implements ActionListener{
    
    public static final String MODIFICA = "modifica";
    private FinestraModificaContatto fmc;
    
    public AscoltatoreFMC(FinestraModificaContatto f){
        this.fmc = f;
    }
    
    public void actionPerformed(ActionEvent e){
        String azione = e.getActionCommand();
        if(azione.equals(MODIFICA)){
            fmc.dispose();
            String nome = fmc.getNomeText();
            String numero = fmc.getNumeroText();
            Nodo n = new Nodo(fmc.getVecchioNome(), fmc.getVecchioNumero());
            Lista.ModificaContatto(n, nome, numero);
        }
    }
}
