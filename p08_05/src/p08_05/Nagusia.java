/**
 * 
 */
package p08_05;



import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Nagusia {

	private static JFrame frame = new JFrame("Dadoak");
	private static JFrame frame2 = new JFrame("Partida");


	private static  JLabel label1 = new JLabel("Dadoak Aukeratu");
	private static  JLabel label2 = new JLabel("Aukeratu dado kopurua");
	private static JButton botoia1 = new JButton("Aukeratu dadoak");
	private static JButton botoiadado4 = new JButton("4eko dadoak");
	private static JButton botoiadado6 = new JButton("6eko dadoak");
	private static JButton botoiadado10 = new JButton("10eko dadoak");
	private static JButton botoiadado20 = new JButton("20eko dadoak");
	private static JTextField textfield1 =new JTextField();
	static int kopurua ;

	public static void main(String[] args) {

		frame.setLayout(null);
		frame.add(label1); 
		frame.add(botoia1);
		botoia1.setBounds(900,425,150,50);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


		botoia1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame2.setLayout( new FlowLayout());
				frame2.setVisible(true);
				frame2.setSize(400, 800);
				frame2.add(label1);

				label1.setBounds(20,20,30,40);
				frame2.add(botoiadado4);
				botoiadado4.setBounds(900,425,150,50);
				frame2.add(botoiadado6);
				botoiadado6.setBounds(900,425,50,50);
				frame2.add(botoiadado10);
				botoiadado10.setBounds(900,425,150,50);
				frame2.add(botoiadado20);
				botoiadado20.setBounds(900,425,150,50);
				textfield1.setSize(500, 500);
				textfield1.setText("                                        ");
				frame2.add(textfield1);
				textfield1.addActionListener(new ActionListener() { 
					@Override
					public void actionPerformed(ActionEvent e) {
						kopurua = Integer.valueOf(textfield1.getText());
						System.out.println(kopurua);
					}
				});

				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			}
		} );




	}

}
