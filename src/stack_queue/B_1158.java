package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder result = new StringBuilder("<");
        while(!queue.isEmpty()){
            for(int i=1;i<K;i++){
                queue.offer(queue.poll());
            }

            result.append(queue.poll());

            if(!queue.isEmpty()){
                result.append(", ");
            }
        }

        result.append(">");

        System.out.print(result);
    }
}