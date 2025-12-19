import java.util.HashMap;
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        System.out.println(result);

    }
}
