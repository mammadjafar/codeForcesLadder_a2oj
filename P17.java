import java.util.Scanner;

/*
 * In this Problem we first find least possible numbers
 * only considering rows. Then check for diagonals and increment
 * to handle diagonals     
 */

public class P17 {
	
	
	
	public static void main(String [] args) {
		p259b();
	}
	
	public static void p259b() {
		Scanner in = new Scanner(System.in);
		int arr [][] = new int [3][3];
		
		long sum = 0;
		long a,b,c;
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				arr[i][j] = in.nextInt();
		
		sum = arr[0][1] + arr[0][2];
		if(sum < arr[1][0] + arr[1][2])
			sum = arr[1][0] + arr[1][2];
		if(sum < arr[2][0] + arr[2][1])
			sum = arr[1][0] + arr[1][1];
		sum++;
		a = sum - (arr[0][1] + arr[0][2]);
		b = sum - (arr[1][0] + arr[1][2]);
		c = sum - (arr[2][0] + arr[2][1]);
		
		while(
			((long) a + b + c != (long) arr[2][0] + b + arr[0][2]) ||
			((long) arr[0][1] + b + arr[2][1] != (long) arr[1][0] + b + arr[1][2])
			) {
			a++;
			b++;
			c++;
		}
		arr[0][0] = (int) a;
		arr[1][1] = (int) b;
		arr[2][2] = (int) c;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			
		}
	}
	
	/*
	a 3 6
	5 b 5
	4 7 c
	
	a + 3 + 6
	5 + b + 5
	4 + 7 + c
	
	3 3 6
	5 2 5
	4 7 1
	
	4 3 6
	5 3 5
	4 7 2
	
	5 3 6
	5 4 5
	4 7 3
	
	6 3 6
	5 5 5
	4 7 4
	
	9  a - 3
	10 b - 2
	11 c - 1
	
	*/
	

}
