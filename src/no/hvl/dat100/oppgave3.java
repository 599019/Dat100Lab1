package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgave3 {

    public static void main(String [] args) {

        int d;
        do {
            d = parseInt(showInputDialog("Dag"));
        } while (d < 0 || d > 32);

        int m;
        do {
            m = parseInt(showInputDialog("Måned"));
        } while (m < 0 || m > 13);

        int a;
        do {
            a = parseInt(showInputDialog("År"));
        } while (a < 0 || a > 10000);


        String utTxt = "Dato = " + d + "." + m + "."+ a;
        showMessageDialog(null, utTxt);



    }

}