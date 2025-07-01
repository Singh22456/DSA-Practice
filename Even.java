import java.util.*;

public class Even {
    public static ArrayList<Integer> gre (ArrayList<Integer> arr){
        Collections.sort(arr);
        int n=arr.size();
        ArrayList<Integer> res= new ArrayList<>(Collections.nCopies(n,0));
        int ptr1=0;int ptr2=n-1;
        for (int i = 0; i < arr.size(); i++) {
            if((i+1)%2==0){
                res.set(i,arr.get(ptr2--));
            }else{
                res.set(i,arr.get(ptr1++));
            }
        }
        for (int i = 0; i < n; i++) {
            arr.set(i,res.get(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr.add(a);
        }
        ArrayList<Integer> res=gre(arr);
        System.out.println(arr);
        
    }
}
