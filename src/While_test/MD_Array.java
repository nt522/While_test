package While_test;

public class MD_Array {

	public static void main(String[] args) {

		int [][] array1 = new int[5][5];
		
		//first for statement will assign row valuess
		//second for statement will assign column values
		for(int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				//1==0;k==0;
				//array1[0][0] = (0*0) + 0;
				array1[i][k] = (i*k) +k;
				//i==0; k==1;
				// array1[0][1] =(0*1) + 1
				System.out.println("Array row " + i + " Array column " + k + " Array value = " + array1[i][k]);
			}
			
		}
		//Array1[0][0] == 0,0
		//Array1[0][1]
		//Array1[0][2]
		//Array1[0][3]
		//Array1[0][4]
		
	}

}
