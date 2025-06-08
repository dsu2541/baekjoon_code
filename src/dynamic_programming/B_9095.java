package dynamic_programming;

import java.util.Scanner;

public class B_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        /*
        다이나믹 프로그래밍 - bottom-up 방식
        초기값 1~3은 개수를 지정하고, 4부터는 dp 점화식? 으로 계산
        예를들어 5는 4+1, 3+2, 2+3 3가지로 각 마지막에 1,2,3을 더하는 방식이므로
        앞에 2,3,4를 만드는 경우의 수를 전부 더해주면 된다.
        4,3,2를 만드는 방식의 갯수는 앞서 2~4를 만들때 배열에 저장한 값을 재사용한다.
         */

        int[] arr = new int[cnt];
        for(int i=0;i<cnt;i++){
            int input = sc.nextInt();
            int[] num = new int[Math.max(4, input + 1)];

            num[1] = 1;
            num[2] = 2;
            num[3] = 4;

            if(input > 3){
                for (int j = 4; j <= input; j++) {
                    //각각 마지막에 +1, +2, +3을 더하는 경우를 더해준다.
                    num[j] = num[j-1] + num[j-2] + num[j-3];
                }
            }

            arr[i] = num[input];
        }

        for(int i=0;i<cnt;i++){
            System.out.println(arr[i]);
        }
    }
}