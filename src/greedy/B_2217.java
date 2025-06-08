package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int min = 0;
        int length = cnt;
        int num = 0;
        int equal_cnt = 0;
        Arrays.sort(arr);

        for(int i=0;i<cnt;i++){
            if(arr[i] > min){
                min = arr[i];
                if(equal_cnt != 0){
                    length -= equal_cnt;
                }
                equal_cnt = 1;
            }else{
                equal_cnt++;
            }

            num = min * length;
            if(num > max){
                max = num;
            }
        }

        System.out.print(max);
    }
}