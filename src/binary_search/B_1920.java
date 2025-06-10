package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class B_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int find_cnt = sc.nextInt();
        int[] find_arr = new int[find_cnt];
        for(int i=0;i<find_cnt;i++){
            find_arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<find_cnt;i++){
            if(binary_search(arr, find_arr[i]) >= 0){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }

        System.out.print(sb);
    }

    //이분 탐색
    public static int binary_search(int[] arr, int find_num){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low + high) / 2;
            if(arr[mid] == find_num){
                return mid;
            }else if(arr[mid] > find_num){
                high = mid-1;
            }else if(arr[mid] < find_num){
                low = mid+1;
            }
        }

        return -1;
    }
}