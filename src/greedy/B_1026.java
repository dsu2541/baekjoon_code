package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        Integer[] A = new Integer[cnt];
        Integer[] B = new Integer[cnt];

        String[] inputA = br.readLine().split(" ");
        for (int i = 0; i < cnt; i++) {
            A[i] = Integer.parseInt(inputA[i]);
        }

        String[] inputB = br.readLine().split(" ");
        for (int i = 0; i < cnt; i++) {
            B[i] = Integer.parseInt(inputB[i]);
        }

        //A는 오름차순, B는 내림차순 순서로 배열 인덱스 저장
        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < cnt; i++) {
            result += A[i] * B[i];
        }

        System.out.print(result);
    }
}