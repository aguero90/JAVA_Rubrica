/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;
/**
 *
 * @author Alessandro
 */
public class Rubrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista.CreaRubricaDaFile();
        FinestraPrincipale fp = new FinestraPrincipale();
        //FinestraInserisciContatto fic = new FinestraInserisciContatto();
        //FinestraCercaContatto fcc = new FinestraCercaContatto();
        //FinestraEliminaModificaContatto fec = new FinestraEliminaModificaContatto();
        //FinestraModificaContatto fmc = new FinestraModificaContatto();
        //Lista.testa.setNome("Funziona");
        System.out.println("24");
        Lista.ScriviRubricaSuFile();
        System.out.println("26");
    }
}