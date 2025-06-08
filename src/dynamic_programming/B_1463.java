package dynamic_programming;

import java.util.Scanner;

public class B_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] num = new int[input + 1];
        num[1] = 0;

        if(input > 1){
            for (int i = 2; i <= input; i++) {
                //case 1: 1을 뺀경우
                num[i] = num[i-1] + 1;

                //case 2: 2를 나눈 경우d
                if(i%2 == 0){
                    num[i] = Math.min(num[i], num[i/2]+1);
                }

                //case 3: 3을 나눈 경우
                if(i%3 == 0){
                    num[i] = Math.min(num[i], num[i/3]+1);
                }
            }
        }

        System.out.print(num[input]);
    }
}