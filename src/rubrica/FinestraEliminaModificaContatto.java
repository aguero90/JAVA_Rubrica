/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Alessandro
 */
public class FinestraEliminaModificaContatto extends JFrame {
    
    private JComboBox elenco = new JComboBox();
    private JButton elimina = new JButton("Elimina");
    private JButton modifica = new JButton("Modifica");
    private AscoltatoreFEMC afemc = new AscoltatoreFEMC(this);
    
    public FinestraEliminaModificaContatto(){
        
        super("Elimina/Modifica Contatto");
        this.elenco = RiempiElenco();
        Container cfec = this.getContentPane();
        cfec.add(elenco);
        cfec.add(elimina);
        cfec.add(modifica);
        cfec.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(250,100);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        elimina.addActionListener(afemc);
        elimina.setActionCommand(AscoltatoreFEMC.ELIMINA);
        modifica.addActionListener(afemc);
        modifica.setActionCommand(AscoltatoreFEMC.MODIFICA);
    }
    
    
    public JComboBox RiempiElenco(){
        JComboBox riempita = new JComboBox();
        Nodo temp = Lista.testa;
        while(temp != null){
            riempita.addItem(temp.toString());
            temp = temp.getNext();
        }
        return riempita;
    }
    
    public String getJComboText(){
        String s = (String)this.elenco.getSelectedItem();
        return s;
    }
}
