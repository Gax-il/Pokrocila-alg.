package H01;

import java.util.Scanner;

public class SPU3 {
    public static void main(String[] args) {
        int tf1, tf2, tf3;

        //A
        Scanner input = new Scanner(System.in);

        System.out.println("Změřte si tep a zapište celo číselnou hodnotu");
        tf1=input.nextInt();

        System.out.println("Udělejte 30 dřepů v tempu 1 dřep za sekundu a ihned po dokončení změřte tep a zapište ho");
        tf2=input.nextInt();

        System.out.println("Teď si minutu odpočiňte a následně změřte tep, změřenou hodnotu zapište");
        tf3=input.nextInt();

        float ri = (float) (tf1 + tf2 + tf3 - 200) /10;
        System.out.printf("\n\nRuffierův index je %.1f\n", ri);

        //B
        String zdatnost;
        if (ri <=0) {
            zdatnost = "Výborná";
        } else if (ri <=5) {
            zdatnost = "Velmi dobrá";
        } else if (ri <=10) {
            zdatnost = "Průměrná";
        } else if (ri <= 15) {
            zdatnost= "Podprůměrná";
        } else {
            zdatnost="Nedostatečná";
        }

        System.out.printf("Zdatnost dle RI je %s\n", zdatnost);

    }
}
