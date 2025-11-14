package h2;

public class H2_main {

	public static void main(String[] args) {
		
		boolean x = true;
		boolean y = true;
		boolean a = true;
		boolean b = true;
		boolean c = true;
		int input = 0;
		
		switch(input){
		case 0:
			x = false;
			y= false;
			break;
		case 1:
			x = false;
			y= true;
			break;
		case 10:
			x = true;
			y= false;
			break;
		case 11:
			x = true;
			y= true;
			break;	
		
		}
		
		if ( x && y ) {
			a = true;
		}else {
			a = false;
		}
		
		if ( x || y ) {
			b = true;
		}else {
			b = false;
		}
		
		if( y ) {
			c = false;
		}else {
			c = true;
		}
		
		System.out.println(" x is = " + x + ", y is = " + y + ", a is = " + a + ", b is = " + b + ", c is = " + c );
	}

}
