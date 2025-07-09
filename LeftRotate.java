
import java.util.Scanner;

public class LeftRotate {
    static void leftRotate(int[] arr,int n,int  k){
        k=k%n;
        swap(arr, 0, n-1);
        swap(arr, 0, k-1);
        swap(arr, k, n-1);
    }
    static void swap(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        leftRotate(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
