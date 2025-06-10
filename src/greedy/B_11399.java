package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        int total = 0;
        for(int i=0;i<cnt;i++){
            total += arr[i];
            sum += total;
        }

        System.out.print(sum);
    }
}