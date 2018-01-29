import java.util.Scanner;

/*
 * http://codeforces.com/problemset/problem/276/B
 *
 * Problem is little complicated. So "both sides play optimally well"
 * means that kind of both sides help also each other. so we just need to find
 * how many characters is there which have odd number of appearances. 
 * B'cos if there's even appearances we can make palindrome form it.  
 */

public class P20 {
	
	public static void main(String [] args) {
		p276b();
	}
	
	public static void p276b() {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int chars[] = new int[26];
		
		for(int i =0; i<26; i++)
			chars[i]=0;
		
		int cur;
		int odds = 0;
		
		for(int i =0; i<str.length(); i++){
			cur = str.charAt(i) - 'a';
			chars[cur]++;
			if(chars[cur]%2 != 0)
				odds++;
			else
				odds--;
		}
		if(odds == 1 || odds == 0){
			System.out.println("First");
			return;
		}
		odds--;
		if(odds % 2 == 0)
			System.out.println("First");
		else
			System.out.println("Second");
	}

}
