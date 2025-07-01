public class Serch{
    public static int BSerch(int[] arr,int target,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target=6;
        int low=arr[0];
        int n=arr.length;
        int high=arr[n-1];
        int result= BSerch(arr,target,low,high);
        System.out.print(result);
    }
}