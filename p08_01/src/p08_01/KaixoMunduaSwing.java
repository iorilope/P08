/**
 * 
 */
package p08_01;

import javax.swing.*;

public class KaixoMunduaSwing
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Kaixo mundua leihoa");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Kaixo mundua");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}