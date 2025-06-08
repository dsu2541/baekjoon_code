package two_pointer;

import java.util.Arrays;
import java.util.Scanner;

public class B_3273 {
    public static void main(String[] args) {
        //정렬, 투 포인터
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        Arrays.sort(arr);

        int start = 0;
        int end = cnt-1;
        int result = 0;

        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum == num){
                result++;
                start++;
                end--;
            }else if(sum > num){
                end--;
            }else{
                start++;
            }
        }

        System.out.print(result);
    }
}