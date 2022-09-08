package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgave1{

    public static void main(String [] args) {

        int l = parseInt(showInputDialog("Lengde av rektangel"));
        int b = parseInt(showInputDialog("Bredde av rektangel"));
        int areal = l*b;

        String utTxt = "Areal = " + areal;

        showMessageDialog(null, utTxt);
    }

}
