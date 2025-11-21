package h2;

public class H2_main {
	
	public static void main(String[] args) {
		
		int n = 962;
		int digits = 0;
		
		int[] a = new int[9];
		
		for (int i = 0; i < 9; i ++) {
			a[a.length-1-i]  = n%10;
			if(n%10 > 0) {
				digits++;
			}
			n = n - n%10;
			n = n /10;
		}
		
		for(int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		System.out.println("Digits: " +digits);
		
		
	}


}
