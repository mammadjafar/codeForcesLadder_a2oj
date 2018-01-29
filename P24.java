import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * we find pile with the min number of pebbles.
 * we can do all the same for this pile, for other one more with this.
 * But after that only one pebble for each color. we check if we have enough colors.
 * then make output and find what length should be for each pile
 * 
 */

public class P24 {
	
	public static void main(String [] args) {
		p509b();
	
	}
	
	public static void p509b() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int min = 110;
		int max = 0;
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
			if(min > arr[i])
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		if(max-min-1 > k-1) {
			System.out.println("NO");
			return;
		}
		
		System.out.println("YES");
		
		String ls = "";
		
		for(int i=0; i<=min; i++)
			ls += "1 ";
		int num=2;
		
		for(int i=min+1; i<max; i++) {
			ls += num;
			ls += " ";
			num++;
		}
		
		int kj , ind;
		
		for(int i=0; i<n; i++) {
			ind = min*2;
			kj = arr[i];
			if(kj>min)
				ind+=2;
			kj -= min;
			kj--;
			if(kj > 0) {
				if(kj < 10) {
					ind += kj*2;
				} else if (kj <= 100) {
					ind += 18;
					kj -= 9;
					ind += kj*3;
				}
			}
			System.out.println(ls.substring(0, ind));
		}
	}
	
	

}
