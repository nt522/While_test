package Test_Launch;

public class Array {

	public static void main(String[] args) {


		int [] a;
		a = new int[10];
		
		int sum = 0;
		
		for(int i =0; i<a.length; i++) {
			
			if(a[i]==4) {
				break;
			}
			a[i] = i+1;
			sum += a[i];
			
			System.out.println("Sum = " + sum);
			
			//System.out.println("Array size= " + i + " vlaue will be = " + a[i] );
		}
	}

}
