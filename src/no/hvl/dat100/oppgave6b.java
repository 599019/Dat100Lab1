package no.hvl.dat100;

import easygraphics.*;

public class oppgave6b extends EasyGraphics {

    public static void main(String[] args) {
        launch(args);
    }

    public void run() {
        makeWindow("Det tyske flagget");

        setColor(0, 0, 0);
        fillRectangle(50, 50, 300, 66);
        setColor(255, 0, 0);
        fillRectangle(50, 116, 300, 66);
        setColor(255, 255, 0);
        fillRectangle(50, 182, 300, 67);
        drawRectangle(50, 50, 300, 200);
    }

}