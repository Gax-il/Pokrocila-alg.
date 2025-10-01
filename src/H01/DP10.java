package H01;

import java.util.Scanner;

public class DP10 {
    public static void main(String[] args) {
        float max, pom;

        Scanner input = new Scanner(System.in);

        System.out.println("Napis 1. cislo");
        max = input.nextFloat();
        System.out.println("Napis 2. cislo");
        pom = input.nextFloat();
        max = pom > max ? pom : max;
        System.out.println("Napis 3. cislo");
        pom = input.nextFloat();
        max = pom > max ? pom : max;
        System.out.println("Napis 4. cislo");
        pom = input.nextFloat();
        max = pom > max ? pom : max;

        System.out.printf("Maximum je %f", max);




    }
}
