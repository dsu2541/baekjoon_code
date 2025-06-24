package implementation;

import java.util.Scanner;

public class B_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[10];

        int cnt = String.valueOf(input).length();
        for(int i=0;i<cnt;i++){
            int num = input % 10;
            if(num==9){
                arr[6]++;
            }else{
                arr[num]++;
            }
            input /= 10;
        }

        if(arr[6] > 0){
            arr[6] = (arr[6] + 1) / 2;
        }

        int max = arr[0];  // 배열 첫 값을 기준으로 시작
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}