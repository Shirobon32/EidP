package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = -5,b=5,c=5;
		returner(a);
		quadrater(b);
		geradier(c);
		
		
	}
	
	public static void returner(int a) {
		if (a< 0) {
			a = a * -1;
		}
		System.out.println(a);
	}
	
	public static void quadrater(int a) {
		a = a *a;
		System.out.println(a);
	}
	
	public static void geradier(int a) {
		if( a % 2 == 0) {
			System.out.println("die Zahl ist gerade!");
		}else if ( a%2 == 1) {
			System.out.println("die Zahl ist ungerade!");
		}else {
			System.out.println("die Zahl ist komisch");
		}
	}

}
