package Test_Launch;

import java.awt.FlowLayout;
import javax.swing.*;

public class Test_While {

	public static void main(String[] args) {
				while(true) {
				
				JFrame f = new JFrame("Frame Hook");

				int size1 = (int)(Math.random()*500+ 500);
				int size2 = (int)(Math.random()*500+ 600);

				f.setSize(size1, size2);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setVisible(true);
				
				f.setLayout(new FlowLayout());
				JButton b1 = new JButton("HaHaHa");

				f.add(b1);
				f.setVisible(true);

				}
			}

}
	


