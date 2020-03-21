import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static long[] arr;

    static long P(int n) {


        int index = n-1;

        if (n <= 0) {
            System.exit(0);
        } else if (n <= 3) {
            arr[index] = 1;
        } else if (n <= 5) {
            arr[index] = 2;
        } else {
            if(arr[index] == -1)
                arr[index] = P(n-1) + P(n-5);
        }
        return arr[index];
    } // P

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long input = sc.nextInt();

        List<Long> results = new ArrayList<Long>();

        for (int i = 0; i < input; i++) {
            int n = sc.nextInt();
            arr = new long[n];
            Arrays.fill(arr, -1);

            results.add(P(n));

        } // for

        for (long result : results) {
            System.out.println(Long.toString(result));
        }
    } // main

} // end class
