package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 99;
		int c = 100;
		int d = 9;
		
		d = 0;
		if(a == b) {
			d++;
		}
		if(a == b | a==c) {
			d++;
		}
		if(a + b == c) {
			d++;
		}
		if(a + b + c >= 100) {
			d++;
		}
		System.out.println("Es sind "+ d + " Eigenschaften erfüllt");
	}

}
