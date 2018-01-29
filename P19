import java.util.Scanner;

/*
 * in this problem we just need to calculate how many teams have home kit 
 * which is the same color with our home kit. One thing to consider is that 
 * input is big. 
 */

public class P19 {
	
	public static void main(String [] args) {
		p432b();
	}
	
	public static void p432b() {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int [][] kits = new int[n][2];
		
		int[] distHome = new int [100001];
		
		for(int i=0; i<100000; i++) {
			distHome[i]=0;
		}

		int h,a;
		
		for(int i=0; i<n; i++) {
			h = in.nextInt();
			a = in.nextInt();
			
			distHome[h]++;
				
			kits[i][0] = h; kits[i][1] = a;
		}

		for(int i=0; i<n; i++) {
			a = n - 1 - distHome[kits[i][1]];
			h = n - 1 + distHome[kits[i][1]];
			System.out.println( h + " " + a);
		}
		
	}

}
