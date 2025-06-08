import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();

        int[] arr = new int[total+1];
        for(int i=1;i<=total;i++){
            arr[i] = i;
        }

        int order = 0;
        int[] result_arr = new int[total+1];
        int result_order = 0;
        for(int i=1;i<=total;i++){
            int cnt = num;
            while(cnt>0){
                order++;
                if(order > total){
                    order = 1;
                }
                if(arr[order] > 0){
                    cnt--;

                    if(cnt == 0){
                        result_arr[result_order] = arr[order];
                        arr[order] = -1;
                        result_order++;
                    }
                }
            }
        }

        System.out.print("<");
        for(int i=0;i<=total-1;i++){
            System.out.print(result_arr[i]);

            if(i!=total-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}