package H01;

import java.util.Scanner;

public class SPU7 {
    public static void main(String[] args) {
        float tepl;
        int tep;

        int roz = 0;
        int cel = 0;

        float maxtepl=0;
        float celproctep=0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Zadejte teplotu pac.");
            tepl = sc.nextFloat();
            System.out.println("Zadejte tep pac.");
            tep = sc.nextInt();
            if (tep == 0 && tepl == 0) {
                break;
            }
            maxtepl = tepl > maxtepl ? tepl : maxtepl;

            cel++;

            if (tepl > 36 && tepl < 37 && tep >= 55 && tep <= 85) {
                roz++;
                celproctep+=tep;
            }
        }

        System.out.printf("Z celkoveho poctu %d dat proslo %d lidi coz tvori %f procent\n", cel, roz, (float)roz/(float)cel*100);

        System.out.printf("Nejvyssi teplota byla %.2f a prumerny tep pacientu co prosli %f", maxtepl, maxtepl/roz);




    }
}
