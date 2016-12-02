
public class JavaSession1Assignment3 {
/*
 * Give two examples of data that cannot be stored in a variable of type int
 * 
 */
	public static void main(String[] args) {

		int z = 1;
		boolean a = false;
		char b = 'a';
		
		z = a;  //error type mismatch
		a = b;	//error type mismatch

	}

}
