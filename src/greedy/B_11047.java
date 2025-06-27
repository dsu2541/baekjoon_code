package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        N--;
        while(K>0){
            if(K>=arr[N]){
                K -= arr[N];
                result++;
            }else{
                N--;
            }
        }

        System.out.print(result);
    }
}