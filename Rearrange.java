import java.util.*;

public class Rearrange {
    public static void gre(ArrayList<Integer> arr){
        Collections.sort(arr);
        int n= arr.size();
        int ptr1=0, ptr2=n-1;
       ArrayList<Integer> res= new ArrayList<>(Collections.nCopies(n, 0));
        for(int i=0;i<n;i++){
            if((i)%2==0){
                res.set(i,arr.get(ptr2--));
            }
            else{
                res.set(i,arr.get(ptr1++));
            }
        }
        for(int i=0;i<n;i++){
            arr.set(i,res.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        gre(arr);
        System.out.println(arr);
    }
}
