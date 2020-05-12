/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws java.lang.Exception {
		//code
		
		try{
            Scanner sc= new Scanner(System.in);
            int T=sc.nextInt();
            for(int counter=0;counter<T;counter++) {

                int n = sc.nextInt();
                //int k=sc.nextInt();
                int[] array = new int[n];
                int[] final_array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();

                }
                final_array = Rotation(array);
                for (int ele : final_array
                ) {
                    System.out.print(ele + " ");

                }
                System.out.println();
            }

        }catch (Exception e){

        }

    }
    public  static  int[] Rotation(int[] arr){
        int[] final_array= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i+1<=arr.length-1){
                final_array[i+1]=arr[i];
            }
            else
            {
                int index=(i+1)-(arr.length-1)-1;
                final_array[index]=arr[i];
            }
        }


        return final_array;
	}
}
