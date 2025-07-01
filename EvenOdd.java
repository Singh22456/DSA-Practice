import java.util.*;

public class EvenOdd {
    public static void Segregate(int[] arr,int n){
        int[] arr1=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr1[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                arr1[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Segregate(arr,n);
        for (int i = 0; i < n; i++) {
           System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
