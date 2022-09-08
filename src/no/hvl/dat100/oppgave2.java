package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgave2 {

    public static void main(String [] args) {

        int a = parseInt(showInputDialog("Tall 1"));
        int b = parseInt(showInputDialog("Tall 2"));
        int c = parseInt(showInputDialog("Tall 3"));
        int d = parseInt(showInputDialog("Tall 4"));

        int minTall = Math.min(Math.min(a, b), Math.min(c, d));

        String utTxt = "Minste tall = " + minTall;

        showMessageDialog(null, utTxt);
    }

}
