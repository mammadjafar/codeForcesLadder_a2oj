import java.util.Scanner;

	/*  http://codeforces.com/problemset/problem/285/B
	 * in the problem we have starting position and final position
	 * and we have positions after each shuffle. 
	 * so we just save current position and find where we will land our marble after each shuffle
	 * 
	 */

public class P15 {
	
	
	
	public static void main(String [] args) {
		p285b();
	}
	
	public static void p285b() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int t = in.nextInt();
		int [] inp = new int[n+1];
		for(int i = 1 ; i<=n; i++) {
			inp[i] = in.nextInt();
		}
		for(int i =0 ; i<n+1; i++) {
			if(s==t) {
				System.out.println(i);
				return;
			}
			s = inp[s];
		}
		System.out.println(-1);
	}
	

}
