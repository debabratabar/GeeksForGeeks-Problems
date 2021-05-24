import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int left=0,right=n-1;
        int pos=0;
        boolean possible=false;
        while(left<=right){
            int mid =(arr[left]+arr[right])/2;
            if(mid>1){
                right--;
            }
            else if(mid<1){
                left++;
            }
            else{
                pos=left;
                possible=true;
                break;
            }
            
        }
        if(possible)
            return pos;
        else
            return -1;
    }
}
