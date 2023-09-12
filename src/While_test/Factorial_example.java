package While_test;

public class Factorial_example {

	public static void main(String[] args) {
		int num =5;
		int factor_sum =1;
		int num2 = 1;
		
		if(num==0) {
			System.out.println("Factorial number :" + "1");
		}else if (num==1) {
			System.out.println("Factorial number :" + "1");
		}else {
			
			while(num2>num) {
				factor_sum = factor_sum * num2;
				num2++;
				System.out.println("Factor_cum :" + factor_sum);
			}
		}
		
		
	}

}
