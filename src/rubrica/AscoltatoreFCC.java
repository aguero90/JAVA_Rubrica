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
public class AscoltatoreFCC implements ActionListener{
    
    public static final String NUMERO = "numero";
    public static final String NOME = "nome";
    public static final String CERCA = "cerca";
    private FinestraCercaContatto fcc;
    
    public AscoltatoreFCC(FinestraCercaContatto f){
        this.fcc = f;
    }
    
     public void actionPerformed(ActionEvent e){
        String azione = e.getActionCommand();
        switch(azione){
            case NOME: {
                        fcc.setCercaPerNumero(false);
                        fcc.setSfondoNumero(false);
                        fcc.setEditableNumero(false);
                        fcc.setSfondoNome(true);
                        fcc.setEditableNome(true);
                        break;
            }
            case NUMERO:{
                        fcc.setCercaPerNome(false);
                        fcc.setSfondoNome(false);
                        fcc.setEditableNome(false);
                        fcc.setSfondoNumero(true);
                        fcc.setEditableNumero(true);
                        break;
            }
            case CERCA: {
                        if(fcc.èAttivo("nome")){
                            Lista.RicercaNome(fcc.getTextNome());
                        }
                        else{
                            Lista.RicercaNumero(fcc.getTextNumero());
                        }
                        break;
            }
            default: JOptionPane.showMessageDialog(null, "Errore in riga 52 Ascoltatore");
        }
       
     }
    
}
