
import java.util.*;

public class Sweet17 {
	public static void main(String[] args) {
		HashMap<Character,Integer> hex = new HashMap<Character,Integer>();
		hex.put('A',10);
		hex.put('B',11);
		hex.put('C',12);
		hex.put('D',13);
		hex.put('E',14);
		hex.put('F',15);
		hex.put('G',16);
		hex.put('a',10);
		hex.put('b',11);
		hex.put('c',12);
		hex.put('d',13);
		hex.put('e',14);
		hex.put('f',15);
		hex.put('g',16);
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int decimal = 0, len = s.length() - 1;
		
		for (char ch: s.toCharArray()) {
			int val = 0;
			
			if (ch >= '1' && ch <= '9')
				val = ch - '0';
			else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
				val = hex.get(ch);
			
			decimal += (val * Math.pow(17, len--));
		}
		
		System.out.println("Answer: " + decimal);
	}
	
}