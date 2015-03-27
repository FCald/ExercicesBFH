import javax.swing.JOptionPane;

public class FBMICalculatorInputOptimiert {

	public static void main(String[] args) {
		
		double gewicht;			// Variable für Gewicht anlegen, um die Zahl zu speichern (Reservation Speicherplatz)
		int groesse;			// Variable für Grösse anlegen, dito Gewicht
		String stringInput;		// for holding the string values until converted
		
		
		stringInput = JOptionPane.showInputDialog("Wie schwer besch? (in Kg, z.B: 50)"); // Eingabe-Fenster
		gewicht = Double.parseDouble(stringInput);
		
		
		stringInput = JOptionPane.showInputDialog("Wie gross besch? (in cm, z.B: 170)");
		groesse = Integer.parseInt(stringInput);
	
		
// Programm soll den BMI berechnen		
		
//		int gewicht = 55; 										// Eingabe in kg
//		double groesse = 1.58; 									// Eingabe in m

		double bmi = gewicht * 10000 / (groesse * groesse); 			// Berechnung Gewicht durch (Grösse (in m) im Quadrat)

		String bmitext = String.valueOf(bmi); 					// Umwandlung von double in string
		bmitext = bmitext.substring(0, 4);						// Beschränkung auf 4 Stellen (Punkt gilt als 1 Stell!)
				
		
		// JOptionPane.showMessageDialog(null, "Du häsch en BMI vo: " + bmitext); // Ausgabe mit Fenster
		
		JOptionPane.showMessageDialog(null, "Metemne Gwicht vo " + gewicht + " kg" +
											"\nund ere Grössi vo " + groesse + " cm" +
											"\nesch dr BMI " + bmitext + " .");
		
//		JOptionPane.showOptionDialog(
//		System.out
//		.printf(
//				"%nMit der Groesse von %d cm%n"
//				+ "und dem Gewicht von %.1f kg%n"
//				+ "ergibt sich ein BMI von: %.1f",
//				groesse, gewicht, bmi));

			
	}

}
