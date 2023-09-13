package While_test;

public class Sort_class {

	public static void main(String[] args) {


		int num [] = {5,3,4,1,2};
		int temp =0;
		
		// num will be {1,2,3,4,5}
		
		System.out.println("Before sorting");
		
		for(int i=0; i<num.length; i++) {
			System.out.println("Num" + i + "=" + num[i]);
		}
		
		for(int i=0; i<num.length; i++) {
			for(int k=1; k<num.length; k++) {
				// i ==0 k==1
				
				//num[0]>num[0]
				
				// i == 0, k==2
				if (num[i]>num[k])
				{
					//temp =5
					temp = num[i];
					
					num[i] = num[k];
					num[k] = temp;
				}
			}
		}
		for(int i =0; i<num.length; i++) {
			System.out.println("Arranged Num = " + i + " " + num[i]);
		}
			
		
	}

}
