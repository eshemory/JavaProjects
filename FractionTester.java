/**
 * 
 */
package lab6;

/**
 * @author sheelij
 *
 */
public class FractionTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f1 = new Fraction(20, 60);
		Fraction f2 = new Fraction(4,5);
		Fraction f3 = new Fraction(f1);
		
		System.out.println("Constructors/toString check:");
		System.out.println("Fraction f1 is " + f1);
		System.out.println("Fraction f2 is " + f2);
		System.out.println("Fraction f3 is " + f3);
		System.out.println("Is f1 a copy of f3? " + f1.toString().equals(f3.toString()));
		System.out.println();
		
		System.out.println("Value check:");
		System.out.println("Fraction f1 has a value of " + f1.getValue());
		System.out.println("Fraction f2 has a value of " + f2.getValue());
		System.out.println("Fraction f3 has a value of " + f3.getValue());
		System.out.println();
		
		System.out.println("Equality check:");
		System.out.println("f1 equals f2? " + f1.equals(f2));
		System.out.println("f2 equals f3? " + f2.equals(f3));
		System.out.println("f3 equals f1? " + f3.equals(f1));
		System.out.println();
		
		System.out.println("Mutator/Division by zero check:");
		f1.setDenominator(0);
		System.out.println("f1's denominator has been zeroed and is now " + f1);
		System.out.println("f1 has a value of " + f1.getValue());
		f2.setNumerator(0);
		f2.setDenominator(0);
		System.out.println("f2 has been zeroed and is now " + f2);
		System.out.println("f2 has a value of " + f2.getValue());
		
		System.out.println("Tests complete!");

	}

}
