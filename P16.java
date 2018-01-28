import java.util.Scanner;

/*
 * In this Problem we first check is we have some element in second string 
 * which is not in first. Also we should check the count. so first calculate 
 * each char in each string, then check in first string. in second loop we 
 * check if we can do it with just deletion (automaton). If not just automaton
 * we check if length's are the same and no need for tree it's array. and last one is both     
 */

public class P15 {
	
	
	
	public static void main(String [] args) {
		p448b();
	}
	
	public static void p448b() {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String t=in.next();
		int fre1[]=new int[27];
		int fre2[]=new int[27];
	
	for(int i=0;i<s.length();i++){
		fre1[s.charAt(i)-'a']++;
	}
	for(int i=0;i<t.length();i++){
		fre2[t.charAt(i)-'a']++;
	}

	for(int i=0;i<fre2.length;i++){
		if(fre1[i]<fre2[i]){
			System.out.println("need tree");
			return;
		}
	}
	int co=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==t.charAt(co))
			co++;
		if(co==t.length()){
			System.out.println("automaton");
			
			return;
		}
	    }
	if(s.length() == t.length())
	{
		System.out.println("array");
		return;
	}

	System.out.println("both");

	
	}
	
	
	

}
