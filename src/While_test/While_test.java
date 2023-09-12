package While_test;

public class While_test {

	public static void main(String[] args) {
		int condition_value = 0;
		int sum = 0;
		
		while(condition_value<=10) {
			sum = sum + condition_value;
			
			condition_value++;
			
			System.out.println("Sum value: " + sum);
			System.out.println("Condition value: " + condition_value);
		}

	}

}
