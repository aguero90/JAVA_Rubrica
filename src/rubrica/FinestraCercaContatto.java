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
public class FinestraCercaContatto extends JFrame {
    
    private JRadioButton cercapernome = new JRadioButton("Cerca per Nome:    ");
    private JRadioButton cercapernumero = new JRadioButton("Cerca per numero: ");
    private JTextField nome = new JTextField(10);
    private JTextField numero = new JTextField(10);
    private JButton cerca = new JButton("Cerca");
    private AscoltatoreFCC afcc= new AscoltatoreFCC(this);
    
    
    public FinestraCercaContatto(){
        
        super("Cerca Contatto");
        Container cfcc = this.getContentPane();
        cfcc.add(cercapernome);
        cfcc.add(nome);
        cfcc.add(cercapernumero);
        cfcc.add(numero);
        cfcc.add(cerca);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(300, 125);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Sistemare altrimenti chiude tutto il programma!
        cfcc.setLayout(new FlowLayout(FlowLayout.CENTER));
        cercapernome.setSelected(true);
        cercapernome.addActionListener(afcc);
        cercapernome.setActionCommand(AscoltatoreFCC.NOME);
        cercapernumero.addActionListener(afcc);
        cercapernumero.setActionCommand(AscoltatoreFCC.NUMERO);
        nome.addActionListener(afcc);
        nome.setActionCommand(AscoltatoreFCC.CERCA);
        numero.setBackground(Color.LIGHT_GRAY);
        numero.setEditable(false);
        numero.addActionListener(afcc);
        numero.setActionCommand(AscoltatoreFCC.CERCA);
        cerca.addActionListener(afcc);
        cerca.setActionCommand(AscoltatoreFCC.CERCA);
    }
    
    public void setCercaPerNome(boolean b){
        this.cercapernome.setSelected(b);
    }
    
    public void setCercaPerNumero(boolean b){
        this.cercapernumero.setSelected(b);
    }
    
    public String getTextNome(){
        return this.nome.getText();
    }
    
    public String getTextNumero(){
        return this.numero.getText();
    }
    
    public void setEditableNome(boolean b){
        this.nome.setEditable(b);
    }
    
    public void setEditableNumero(boolean b){
        this.numero.setEditable(b);
    }
    
    public void setSfondoNome(boolean b){
        if(b){
            this.nome.setBackground(Color.WHITE);
        }
        else{
            this.nome.setBackground(Color.LIGHT_GRAY);
        }
    }
    
    public void setSfondoNumero(boolean b){
        if(b){
            this.numero.setBackground(Color.WHITE);
        }
        else{
            this.numero.setBackground(Color.LIGHT_GRAY);
        }
    }
    
    public boolean èAttivo(String s){
        if(s.equals("nome")){
            return this.nome.isEditable();
        }
        else{
            return this.numero.isEditable();
        }
    }
    
}
