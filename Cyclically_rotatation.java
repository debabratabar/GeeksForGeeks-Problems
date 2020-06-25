package GeeksforGeeks;

import java.util.Scanner;

public class CyclicallyRotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for (int counter=0;counter<T;counter++){
            int N= sc.nextInt();
            int[] arr= new int[N];
            for (int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int last_term = arr[N-1];
            for (int i=N-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last_term;
            for (int element:arr
                 ) {
                System.out.print(element+" ");

            }
        }

    }
}
