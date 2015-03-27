import javax.swing.JOptionPane;

/**
 * Test Class for BMICalc-Class.<br>
 * Ask for input and return the result in little windows.
 * 
 * @author fca
 * @version 20150328.V1
 * @see javax.swing.JOptionPane
 */
public class BMICalcTester {

	public static void main(String[] args) {

		/**
		 * For holding the string values until converted
		 */
		String stringInput;

		/**
		 * Input window for weight in kg.
		 */
		stringInput = JOptionPane
				.showInputDialog("Wie schwer besch? (in Kg, z.B: 50)");
		double gewicht = Double.parseDouble(stringInput);

		/**
		 * Input window for size in cm.
		 */
		stringInput = JOptionPane
				.showInputDialog("Wie gross besch? (in cm, z.B: 170)");
		double groesse = Double.parseDouble(stringInput);

		/**
		 * Create a new object for compute the bmi.
		 */
		BMICalc bmi1 = new BMICalc(gewicht, groesse);

		/**
		 * Change the double of .getBMI() into a string. Limited to 4
		 * characters. 
		 * --> It will be nice to have a methode like printf for round
		 * the double directly in the showMessageDialog.
		 */
		double bmi = bmi1.getBMI();
		String bmitext = String.valueOf(bmi); // Umwandlung von double in string
		bmitext = bmitext.substring(0, 4); // Beschränkung auf 4 Stellen (Punkt
											// gilt als 1 Stell!)

		// JOptionPane.showMessageDialog(null, "Du häsch en BMI vo: " +
		// bmitext);

		JOptionPane.showMessageDialog(null,
				"Metemne Gwicht vo " + bmi1.getGewicht() + " kg"
						+ "\nund ere Grössi vo " + bmi1.getGroesse() + " cm"
						+ "\nesch dr BMI " + bmitext + " .");

		// System.out.printf("%5.1f.", human1.getBMI());

	}

}
