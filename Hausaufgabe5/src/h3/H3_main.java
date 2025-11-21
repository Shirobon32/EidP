package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int[][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int input = 519184;
		int rest = 0;	
		
		for (int i = 0; i < einheiten[0].length; i++) {
			 rest = input % einheiten[0][i];
			 input = input - rest;
			 einheiten[1][i] = input / einheiten[0][i];
			 input = rest;
		}
		
		
		
		for (int i = 0; i < einheiten[0].length; i++) {
			if(einheiten[0][i] >10000) {
				System.out.print(einheiten[0][i] +  " ");
			}else if(einheiten[0][i] >1000) {
				System.out.print(einheiten[0][i] +  "  ");
			}else if(einheiten[0][i] >100) {
				System.out.print(einheiten[0][i] +  "   ");
			}else if(einheiten[0][i] >10) {
				System.out.print(einheiten[0][i] +  "    ");
			}else {
				System.out.print(einheiten[0][i] +  "     ");
			}
			
		}
		System.out.println(" ");
		for (int i = 0; i < einheiten[0].length; i++) {
			System.out.print("    "+ einheiten[1][i] + " ");
		}
		
		
	}

}
