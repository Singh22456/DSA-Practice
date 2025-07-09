import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Leader {
    static  List<Integer> Lead(int[] arr,int n){
        List<Integer> result = new ArrayList<>();
        int maxRight=arr[n-1];
        result.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxRight){
                maxRight=arr[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> result=Lead(arr, n);
        for (int val : result) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
