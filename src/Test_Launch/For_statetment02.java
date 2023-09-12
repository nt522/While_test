package Test_Launch;

public class For_statetment02 {

	public static void main(String[] args) {


		for(int i=1; i<10; i++) {
			// i ==1;
			
			/*
			 * if(i==3) { continue; }
			 */
			
			for(int k=1; k<10; k++) {
				System.out.println(i + " * " + k + " = " + i*k);
			}
			
			if(i==3) {
				continue;
			}
		}
	}

}
