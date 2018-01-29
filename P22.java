import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * Little interesting :)
 * In this problem we can use brute-force with 2 loops, and find count 
 * for all beginning indexes. But it'll give us a TIME LIMIT.
 * So one good way is to memorize intermediate answers. So in every inner loop
 * we just subtract first on and go from end.
 * 
 */

public class P22 {
	
	public static void main(String [] args) {
		p279b();
	}
	
	public static void p279b() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long t = in.nextLong();
		
		long books[] = new long[n];
		
		for(int i=0; i<n; i++)
			books[i] = in.nextLong();
		
		long count = 1;
		long maxCount = 0;

		long t1 = t;
		int j=0;
		for(int i=0; i<n; i++){
			count--;
			t1 += i>0?books[i-1]:0;
			for(; j<n; j++){
				if(books[j] <= t1) {
					t1 -= books[j];
					count++;
				}
				else
					break;
			}
			if(maxCount < count)
				maxCount=count;
		}
		
		System.out.println(maxCount);
	}

}
