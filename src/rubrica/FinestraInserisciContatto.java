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
public class FinestraInserisciContatto extends JFrame {
    private JLabel numero = new JLabel("Inserisci il numero del contatto: ");
    private JLabel nome = new JLabel("Inserisci il nome del contatto:     ");
    private JTextField textnumero = new JTextField(10);
    private JTextField textnome = new JTextField(10);
    private JButton ok = new JButton("Ok");
    private AscoltatoreFIC afic = new AscoltatoreFIC(this);
    
    public FinestraInserisciContatto(){
        
        super("Inserisci Contatto");
        Container cfic = this.getContentPane();
        cfic.add(nome);
        cfic.add(textnome);
        cfic.add(numero);
        cfic.add(textnumero);
        cfic.add(ok);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(350, 125);
        cfic.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        ok.addActionListener(afic);
        ok.setActionCommand(AscoltatoreFIC.OK);
        textnumero.addActionListener(afic);
        textnumero.setActionCommand(AscoltatoreFIC.OK);
    }
    
    public String getTextNome(){
        return textnome.getText();
    }
    
    public String getTextNumero(){
        return textnumero.getText();
    }
    
}
