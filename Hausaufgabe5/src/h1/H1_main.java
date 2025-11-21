package h1;



public class H1_main {

	public static void main(String[] args) {
	
		int[] myArray = {0,1,2,3,4};
		int save = 0;
		
		for(int i = 0; i < (myArray.length)/2; i++) {
			save = myArray[i];
			myArray[i] = myArray[myArray.length-1-i];
			myArray[myArray.length-1-i] = save;
		}
		
		for(int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}
		
	}

}
