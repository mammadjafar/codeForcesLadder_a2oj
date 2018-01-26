import java.util.Scanner;
/*
 * http://codeforces.com/contest/265/problem/B
 *
 * in this problem we just need to calculate 
 * difference between current position and 
 * next position we should move to, ot find how much 
 * time we need to move vertically
 * and add time to eat nuts (n) and also time to move 
 * from current tree to next tree (n-1)
 * 
 */

public class P14 {
	
	public static void main(String [] args) {
		p265b();
	}
	
	public static void p265b() {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int curH = 0;
		int dest = 0;
		long sum = 2*n-1;
		while(n-->0) {
			dest = in.nextInt();
			sum += Math.abs(curH-dest);
			curH = dest;
		}
		System.out.println(sum);
	}

}
