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
public class FinestraModificaContatto extends JFrame{
    
    private JLabel modificanome = new JLabel("Nuovo nome:     ");
    private JLabel modificanumero = new JLabel("Nuovo numero: ");
    private JTextField nome = new JTextField(10);
    private JTextField numero = new JTextField(10);
    private JButton modifica = new JButton("Modifica");
    private String vecchionome = "";
    private String vecchionumero = "";
    private AscoltatoreFMC afmc = new AscoltatoreFMC(this);
    
    public FinestraModificaContatto(){
        
        super("Modifica Contatto");
        Container cfmc = this.getContentPane();
        cfmc.add(modificanome);
        cfmc.add(nome);
        cfmc.add(modificanumero);
        cfmc.add(numero);
        cfmc.add(modifica);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(300, 125);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Sistemare altrimenti chiude tutto il programma!
        cfmc.setLayout(new FlowLayout(FlowLayout.CENTER));
        nome.addActionListener(afmc);
        numero.addActionListener(afmc);
        modifica.addActionListener(afmc);
        nome.setActionCommand(AscoltatoreFMC.MODIFICA);
        numero.setActionCommand(AscoltatoreFMC.MODIFICA);
        modifica.setActionCommand(AscoltatoreFMC.MODIFICA);
    }
    
    public void setNomeText(String s){
        this.vecchionome = s;
        this.nome.setText(s);
    }
    
    public String getNomeText(){
        return this.nome.getText();
    }
    
    public void setNumeroText(String s){
        this.vecchionumero = s;
        this.numero.setText(s);
    }
    
    public String getNumeroText(){
        return this.numero.getText();
    }
    
    public String getVecchioNome(){
        return this.vecchionome;
    }
    
    public String getVecchioNumero(){
        return this.vecchionumero;
    }
    
}
