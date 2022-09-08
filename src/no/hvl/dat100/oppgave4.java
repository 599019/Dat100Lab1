package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgave4 {

    public static void main(String [] args) {

        int tottalSek = parseInt(showInputDialog("Sekunder"));

        int h = tottalSek/3600;
        int m = (tottalSek % 3600)/60;
        int s = tottalSek % 60;

        String utTxt = "KL: "+ h +":" +m +":" +s ;

        showMessageDialog(null, utTxt);
    }


}
