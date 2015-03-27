
/**
 * This Class compute and return a BMI.
 * @author fca
 * @version 20150328.V1
 */
public class BMICalc {

	/**
	 * Instance variables: <br>
	 * weight "gewicht" in kg <br>
	 * size "groesse" in cm
	 */
	private double gewicht; // in kg
	private double groesse; // in cm

	
	// Constructor
	/**
	 * Enter a weight "gewicht" and a size "groesse". <br>
	 * To example: BMICalc.BMICalc(50, 160)
	 * @param gewicht weight in kg
	 * @param groesse size in cm
	 */
	public BMICalc(double gewicht, double groesse) {
		this.gewicht = gewicht;
		this.groesse = groesse;
	}

	/**
	 * Calculate and show you the BMI. 
	 * @return the BMI for this weight and this size
	 */
	public double getBMI() {
		return this.gewicht * 10000 / this.groesse / this.groesse;
	}

	/**
	 * Get the weight.
	 * @return this weight
	 */
	public double getGewicht() {
		return this.gewicht;
	}

	/**
	 * Get the size.
	 * @return this size
	 */
	public double getGroesse() {
		return this.groesse;
	}

}
