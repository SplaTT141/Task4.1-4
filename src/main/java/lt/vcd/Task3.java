package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    static void main() throws FileNotFoundException {
        Scanner fin= new Scanner(new File("data.txt"));
        int n = fin.nextInt();

        int[] temp= new int[n];

        for (int i=0; i<n; i++) {
            temp[i] = fin.nextInt();
        }

        int negativeTempCount = 0;

        for (int t:temp) {
            if (t<0) {
                negativeTempCount++;
            }
        }

        if (negativeTempCount > 0)  {
            System.out.print(negativeTempCount);
        } else {
            System.out.print("No negative temperatures recorded");
        }
    }
}
