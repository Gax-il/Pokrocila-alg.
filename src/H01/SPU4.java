package H01;

import java.util.ArrayList;
import java.util.Scanner;

public class SPU4 {
    public static void main(String[] args) {
        ArrayList<Float> data = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Zadejte první délku");
        data.add(input.nextFloat());
        System.out.println("Zadejte druhou délku");
        data.add(input.nextFloat());
        System.out.println("Zadejte třetí délku");
        data.add(input.nextFloat());

        data.sort(Float::compareTo);

        float a = data.get(0);
        float b = data.get(1);
        float c = data.get(2);

        float epsilon = 0.01f;

        boolean trojUloha = (c < a + b) && (Math.abs((c * c) - (a * a + b * b)) <= epsilon);

        if (trojUloha) {
            System.out.printf(
                    "Pro hodnoty %.2f, %.2f a %.2f je pravoúhlý trojúhelník možný%n",
                    a, b, c
            );
        } else {
            System.out.printf(
                    "Pro hodnoty %.2f, %.2f a %.2f není pravoúhlý trojúhelník možný%n",
                    a, b, c
            );
        }
    }
}