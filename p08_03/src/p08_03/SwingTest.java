/**
 * 
 */
package p08_03;

/**
 * 
 * @author Ioritz Lopetegi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTest
{

	//Botoiak hasieratu
	private static JLabel	label		= new JLabel("--");
	private static JButton	btnGarbitu	= new JButton("Garbitu");
	private static JButton	btnIdatzi	= new JButton("Idatzi");

	public static void ekintzak(ActionEvent e)
	{


		//Gure objetuan datuak idatziko edo ezabatuko ditugu aukeraren arabera, garbitu aukeratuz gero testua hutsik eta idatzi sakatuz gero
		// Kaixo mundua mezua ikusiko dugu label batean,label hau aldakorra da
		Object obj = e.getSource();
		if (obj == btnGarbitu)
		{
			label.setText("");
		}
		if (obj == btnIdatzi)
		{
			label.setText("Kaixo mundua");
		}
	}

	public static void main(String[] args)
	{

		//Gure JFrame-ari estiloa ematen diogu
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} 
		catch (Exception e)
		{
		}

		JFrame frame = new JFrame("Gertakaria kontrolatzen");


		//Garbitu botoia sakatzerakoan zer egin behar den zehazten dugu, hau da testua hustu
		btnGarbitu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ekintzak(e);
			}
		});

		//idatzi botoia sakatzerakoan zer egingo den zehazten da
		btnIdatzi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ekintzak(e);
			}
		});

		//Gure labelak geitzen ditugu, biak bestela hutsu sakatzerakoan adibidez ez da ikusiko
		frame.getContentPane().add(label);
		frame.getContentPane().add(btnGarbitu);
		frame.getContentPane().add(btnIdatzi);
		frame.addWindowListener(new WindowAdapter()

				//Gure aplikazioan Lehioa isteko zehaztend a
				{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});

		//Gure JFrame-aren estiloa aldatzen dugu, kokapena , ikuspegia etab...
		frame.setLayout(new GridLayout(0, 1));
		frame.pack();
		frame.setVisible(true);
	}
}