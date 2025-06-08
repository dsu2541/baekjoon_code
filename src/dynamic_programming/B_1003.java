package dynamic_programming;

import java.util.Scanner;

public class B_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        int[] zero_arr = new int[cnt];
        int[] one_arr = new int[cnt];

        //반복문 시작 전에 0~40까지 피보나치수열 값을 계산해놓음
        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        one[0] = 0;

        zero[1] = 0;
        one[1] = 1;

        for(int i=2;i<=40;i++){
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }

        for(int i=0;i<cnt;i++){
            int input = sc.nextInt();
            zero_arr[i] = zero[input];
            one_arr[i] = one[input];
        }

        for(int i=0;i<cnt;i++){
            System.out.println(zero_arr[i] + " " + one_arr[i]);
        }
    }
}