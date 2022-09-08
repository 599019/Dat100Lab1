package no.hvl.dat100;

import easygraphics.*;

public class oppgave6c extends EasyGraphics {

    public static void main(String[] args) {
        launch(args);
    }

    public void run() {
        makeWindow("Det tyske flagget");

        double prosent = Double.parseDouble(getText("Flaff størelse i %:"));
        int pros = (int) prosent;

        // Flag i 1% størelse
        int h = pros;
        int b = 5 * pros;
        int x = 50;
        int y1 = x;
        int y2 = y1 + h;
        int y3 = y2 + h;

        setColor(0, 0, 0);
        fillRectangle(x, y1, b, h);
        setColor(255, 0, 0);
        fillRectangle(x, y2, b, h);
        setColor(255, 255, 0);
        fillRectangle(x, y3, b, h);

    }

}