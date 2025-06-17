package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

//        List를 쓰면 list.add(0, last);에서 시간복잡도가 O(n)이므로
//        결국 O(n^2)가 되서 시간초과뜸. 그래서 Queue로 써야됨
//        List<Integer> list = new ArrayList<>();
//        for(int i=num;i>=1;i--){
//            list.add(i);
//        }
//
//        while(list.size() > 1){
//            list.remove(list.size() - 1);
//            if(list.size() <= 1){
//                break;
//            }else{
//                int last = list.remove(list.size() - 1);
//                list.add(0, last);
//            }
//        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=num;i++){
            queue.offer(i);
        }

        while(queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.print(queue.peek());
    }
}