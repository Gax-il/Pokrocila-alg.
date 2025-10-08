package MT_08_10_25;

import java.util.Scanner;

public class MT1A {
    public static void main(String[] args) {
        int window_count = 0;
        int window_max = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nVložte počet umytých oken pro brigádníka č. %d : ", i+1);
            int user_input = input.nextInt();
            if (user_input < 10) {
                System.out.println("---- Málo výkonný brigádník, vyřadit ----\n");
            }
            if (window_max < user_input) {
                window_max = user_input;
            }
            window_count+=user_input;
        }

        System.out.printf("\n\nDnes bylo umyto celkem %d oken.\nJeden brigádník dnes umyl maximálně %d oken.", window_count, window_max );

    }

}
