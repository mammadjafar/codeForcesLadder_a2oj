import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * If result position is 0 then its row and column should be all zero.
 * So we first find all zero rows and columns.
 * then we wright zero to all zero cols and rows and 1 to other ones.
 * It only doesn't work if all rows are non-zero or all cols 
 * are non-zero so we add special case for that
 *   
 */

public class P18 {
	
	
	
	public static void main(String [] args) {
		p486b();
	}
	
	public static void p486b() {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		int arr [][] = new int [m][n];
		int a;
		
		Set<Integer> zRow = new HashSet<>(); // only zero rows
		Set<Integer> zCol = new HashSet<>(); // only zero columns
		
		boolean oneFlag = false;
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++) {
				a = in.nextInt();
				arr[i][j] = a;
				if(a==0) {
					zRow.add(i);
					zCol.add(j);
				}
				else oneFlag = true; // its for our special case
			}
		
		if(zRow.size() == m || zCol.size() == n){
			if(oneFlag) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				for(int i=0; i<m; i++) {
					for(int j=0; j<n; j++) {
						System.out.print("0 ");
					}
					System.out.println();
				}
			}
			return;
		}
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 1 && zRow.contains(i) && zCol.contains(j)) {
					System.out.println("NO");
					return;
				}
			}
		
		
		System.out.println("YES");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 0 || zRow.contains(i) || zCol.contains(j)) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}	
			}
			System.out.println();
		}

		
		
	}
	
	
	

}
