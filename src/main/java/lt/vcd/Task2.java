package lt.vcd;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite skaicius viena po kito. Norint uzbaigti skaiciu ivedima iveskite 0:");
        int num;

        int evenCount = 0;
        int oddCount = 0;

        do {
            num = in.nextInt();

            if (num != 0) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        } while (num != 0);

        System.out.println("Lyginiu skaiciu: " + evenCount);
        System.out.println("Nelyginiu skaiciu: " + oddCount);
    }
}
