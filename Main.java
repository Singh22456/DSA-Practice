import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 10;
		int[] pair = new int[] {0,0};
		int [][] dir = new int [][] {
		    {1,0},
		    {0,1},
		    {-1,0},
		    {0,-1}
		};
		
		for(int i=0;i<n;i++,count+=10){
		    pair[0]+= (count*dir[i%4][0]);
		    pair[1]+=(count*dir[i%4][1]);
		}
		System.out.print(pair[0] +" "+ pair[1]);
	}
}