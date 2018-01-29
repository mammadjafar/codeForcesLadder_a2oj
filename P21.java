import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * Just sort the dirties and check if there is no more 
 * than 2 consecutive dirties. And first and last stairs our special cases.
 * In Java don't forget to L for long.  
 */

public class P19 {
	
	public static void main(String [] args) {
		p362b();
	}
	
	public static void p362b() {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		
		LinkedList<Long> arr = new LinkedList<Long>();
		
		for(long i=0; i<m; i++) {
			arr.add(in.nextLong());
		}
		
		if(arr.contains(1l) || arr.contains(n)) { // L for long
			System.out.println("NO");
			return;
		}
			
		Collections.sort(arr);
		
		int dc = 0; // dirty count
		long curr = 0; // current for loop
		
		for(long h : arr) {
			if(curr + 1 == h)
				dc++;
			else 
				dc = 1;
			if(dc > 2) {
				System.out.println("NO");
				return ;
			}
			curr = h;
		}
		System.out.println("YES");
	}

}
