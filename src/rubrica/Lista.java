/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista {

    static Nodo testa = null;
    static int confronto;

    public static void InserisciContatto(Nodo n) {

        //Lista Vuota
        if (testa == null) {
            testa = n;
            return;
        }

        //Lista ha almeno 1 elemento
        confronto = n.getNome().compareTo(testa.getNome());
        if (confronto < 0) {
            n.setNext(testa.getNext());
            testa = n;
            return;
        } else if (confronto == 0) {
            JOptionPane.showMessageDialog(null, "Il contatto è già in lista!");
            return;
        }

        Nodo temp = testa.getNext();
        Nodo prec = testa;

        while (temp != null) {
            confronto = n.getNome().compareTo(temp.getNome());
            if (confronto < 0) {//ho trovato dove inserire il nodo
                n.setNext(temp);
                prec.setNext(n);
                return;//appena lo trovo, inserisco ed esco
            }
            if (confronto == 0) {
                JOptionPane.showMessageDialog(null, "Il contatto è già in lista!");
                return;
            }
            temp = temp.getNext();
            prec = prec.getNext();
        }
        prec.setNext(n);//n dovrebbe già avere il campo next a null
    }

    public static int getLunghezza() {
        Nodo temp = testa;//testa non lo modifico mai perché l'ho definito come statico
        int lunghezza = 0;
        while (temp != null) {
            lunghezza++;
            temp = temp.getNext();
        }
        return lunghezza;
    }

    public static Nodo RicercaNome(String s) {
        Nodo temp = testa;
        while (temp != null) {
            if (temp.getNome().equals(s)) {
                return temp;
            }
            temp = temp.getNext();
        }
        JOptionPane.showMessageDialog(null, "Il contatto cercato non c'è!");
        return null;
    }

    public static Nodo RicercaNumero(String s) {
        Nodo temp = testa;
        while (temp != null) {
            if (temp.getNumero().equals(s)) {
                return temp;
            }
            temp = temp.getNext();
        }
        JOptionPane.showMessageDialog(null, "Il contatto cercato non c'è!");
        return null;
    }

    public static void CancellaContatto(Nodo c) {
        Nodo temp = testa;
        if (temp != null && ControllaNodi(temp, c)) {
            testa = temp.getNext();
            return;
        }
        Nodo prec = temp;
        temp = temp.getNext();
        while (temp != null) {
            if (ControllaNodi(temp, c)) {//potrebbe esserci un problema perché confronta i puntatori
                prec.setNext(temp.getNext());
                return;
            }
            prec = temp;
            temp = temp.getNext();
        }
        JOptionPane.showMessageDialog(null, "Il contatto da cancellare non c'è!");
    }

    public static void ModificaContatto(Nodo n, String nome, String numero) {
        boolean n1, n2;
        n1 = nome.isEmpty();
        n2 = numero.isEmpty();
        if (n1 && n2) {
            JOptionPane.showMessageDialog(null, "Non hai inserito i nuovi valori!");
        }
        if (n2) {
            ModificaNomeContatto(n, nome);
        }
        if (n1) {
            ModificaNumeroContatto(n, numero);
        }
    }

    public static void ModificaNomeContatto(Nodo n, String nome) {
        n.setNome(nome);
    }

    public static void ModificaNumeroContatto(Nodo n, String numero) {
        n.setNumero(numero);
    }

    public static void CreaRubricaDaFile() {
        try {
            FileReader rlol = new FileReader("src\\rubrica\\lista contatti.txt");
            Scanner lettura = new Scanner(rlol);
            String s;
            String[] divise;
            if (lettura.hasNextLine()) {
                s = lettura.nextLine();
                divise = s.split(" ");
                Nodo nuovo = new Nodo(divise[0].concat(" ".concat(divise[1])), divise[2]);
                testa = nuovo;
                Nodo temp = testa;
                while (lettura.hasNextLine()) { //restituisce true se c'è un'altra linea da leggere, false altrimenti
                    s = lettura.nextLine();
                    divise = s.split(" ");//in divise ora c'è {nome, cognome, numero}
                    nuovo = new Nodo(divise[0].concat(" ".concat(divise[1])), divise[2]);// nel nodo metto nome + " " + cognome
                    temp.setNext(nuovo);
                }
            }
            rlol.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Errore nella creazione della rubrica!");
        }

    }

    public static void ScriviRubricaSuFile() {
        try {
            FileWriter wlol = new FileWriter("src\\rubrica\\lista contatti.txt"); //Se apro in scrittura mi sovrascrive tutto
            Nodo temp = testa;
            while (temp != null) {
                wlol.write(temp.getNome());
                wlol.write(" ");
                wlol.write(temp.getNumero());
                wlol.write('\r');
                temp = temp.getNext();
            }
            wlol.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Errore nel salvataggio della rubrica!");
        }
    }

    public static boolean ControllaNodi(Nodo n1, Nodo n2) {
        if (n1.getNome().equals(n2.getNome()) && n1.getNumero().equals(n2.getNumero())) {
            return true;
        }
        return false;
    }

}
