package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    static void main() throws FileNotFoundException {
        Scanner fin= new Scanner(new File("data.txt"));

        int[] nums = new int[6];

        for (int i=0; i<6; i++) {
            nums[i] = fin.nextInt();
        }

        int count = 0;

        for (int i=0; i<nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        System.out.print(count);

    }
}
