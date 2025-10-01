package H01;

import java.util.Scanner;

public class SPU2 {
    public static void main(String[] args) {
        float rychlost_v_m_za_s;

        Scanner input = new Scanner(System.in);

        System.out.println("Napište rychlost v m/s");

        rychlost_v_m_za_s = input.nextFloat();

        double rychlost_pro_amiky = rychlost_v_m_za_s * 2.2369362921;

        System.out.printf("\nRychlost pro popelnice na hamburgery: %.2f mi/h\n", rychlost_pro_amiky);
    }
}
