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
public class FinestraPrincipale extends JFrame {
    
    private JButton inseriscicontatto = new JButton("Inserisci");
    private JButton cercacontatto = new JButton("Cerca");
    private JButton eliminamodificacontatto = new JButton("Elimina/Modifica");
    private AscoltatoreFP afp = new AscoltatoreFP(this);
    
    public FinestraPrincipale(){
        
        super("Rubrica");
        Container cfp = this.getContentPane();
        cfp.add(inseriscicontatto);
        cfp.add(cercacontatto);
        cfp.add(eliminamodificacontatto);
        this.setSize(350, 75);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        cfp.setLayout(new FlowLayout(FlowLayout.CENTER));
        inseriscicontatto.addActionListener(afp);
        inseriscicontatto.setActionCommand(AscoltatoreFP.INSERISCICONTATTO);
        cercacontatto.addActionListener(afp);
        cercacontatto.setActionCommand(AscoltatoreFP.CERCACONTATTO);
        eliminamodificacontatto.addActionListener(afp);
        eliminamodificacontatto.setActionCommand(AscoltatoreFP.ELIMINAMODIFICACONTATTO);
    }
}
