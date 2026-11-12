package lt.vcd;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Iveskite laptopo kaina: ");
        int p = in.nextInt();
        System.out.print("Iveskite kiek studentas jau yra sutaupes: ");
        int s = in.nextInt();
        System.out.print("Iveskite kiek studentas gali isleisti laptopui kas savaite: ");
        int m = in.nextInt();
        int k = 0;

        while(s < p) {
            s += m;
            k++;
        }

        System.out.print("Studentas gales isigyti laptopa uz " + k + " savaiciu.");
    }
}
