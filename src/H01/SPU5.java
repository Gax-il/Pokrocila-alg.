package H01;

import java.util.Scanner;

import static java.lang.System.exit;

public class SPU5 {
    public static void main(String[] args) {
        float a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("Koeficient a je");
        a = input.nextFloat();
        System.out.println("Koeficient b je");
        b = input.nextFloat();
        System.out.println("Koeficient c je");
        c = input.nextFloat();

        if (a == 0 && b ==0) {
            System.out.println("Degenerativni");
            exit(0);
        }

        if (a == 0) {
            System.out.printf("Jednoduchy koren %f", -c/b);
            exit(0);
        }

        if (c == 0) {
            System.out.printf("Kořen je %f", -b/a);
        }



        float dscr = b*b-4*a*c;

        float x1,x2;

        x1 = (-b + (float)Math.sqrt(Math.abs(dscr)))/(2*a);
        x2 = (-b - (float)Math.sqrt(Math.abs(dscr)))/(2*a);

        System.out.printf("%s koreny jsou %f a %f", dscr<0 ? "Komplexni" : "Reálné", x1,x2);



    }



}
