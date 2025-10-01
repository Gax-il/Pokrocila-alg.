package H01;

import java.util.Scanner;

public class SPU6 {
    public static void main(String[] args) {
        int spesl = 0;

        Scanner input = new Scanner(System.in);

        int cislo;

        while (true) {
            cislo = input.nextInt();
            if (cislo == 0){
                System.out.printf("Cisel delitelnych 3 a zaroven lichych jste zadal %d",spesl);
                break;
            }
            if (cislo % 3 == 0 && cislo%2 == 1) {
                spesl++;
            }
        }
    }
}
