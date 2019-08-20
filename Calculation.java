//Author: Wandji Collins
import javax.swing.JOptionPane;
import java.lang.Math.Sq

public class Calculation {

	public static void main(String[] args){

		String resistance =
				JOptionPane.showInputDialog("Enter the resistance");
		String inductance =
				JOptionPane.showInputDialog("Enter the inductance");
		String capacitance =
				JOptionPane.showInputDialog("Enter the capacitance");
		String afrequency =
				JOptionPane.showInputDailog("Enter the value of omega");

		int R = Integer.parseInt(resistance);
		int L = Integer.parseInt(inductance);
		int C = Integer.parseInt(capacitance);
		int w = Integer.parseInt(afrequency);

		int Rprime = 1 / (R * R);
		int omegaC = w * C;
		int omegaL = 1 / (w * L);

		int zum = 1 / Math.Sqr((Rprime+(omegaC-omegaL) * (Rprime+(omegaC-omegaL))));

		//Display the Inductance
		JOptionPane.showMessageDialog(null, "The Inductance is" + zum, "Inductance of an electric circuit", JOptionPane.PLAIN_MESSAGE);

	}

}
