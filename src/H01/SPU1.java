package H01;

import java.util.Scanner;

public class SPU1 {
    public static void main(String[] args) {
        int odvesna1, odvesna2;

        Scanner input = new Scanner(System.in);

        System.out.println("Napište délku odvěsny 1 v mm (bez desetiných míst):");
        odvesna1 = input.nextInt();

        System.out.println("Napište délku odvěsny 2 v mm (bez desetiných míst):");
        odvesna2 = input.nextInt();

        float prepona = (float)Math.sqrt(Math.pow(odvesna1, 2) + Math.pow(odvesna2, 2));

        System.out.printf("\nPřepona je dlouhá %.4fmm\n", prepona);
    }
}