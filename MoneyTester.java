package finalexam;

public class MoneyTester {
	public static void main(String[] args) {
		Money m0 = new Money();
		
		Money m1 = new Money();
		m1.setDollars(3);
		m1.setCents(25);
		
		Money m2 = new Money(4, 100);
		Money m3 = new Money(5);
		Money m4 = Money.add(m1, m3);
		Money m5 = Money.minus(m1, m2);
		Money m6 = Money.minus(m4, m3);
		Money m7 = Money.add(m5, m2);
		
		if  (!m2.equals(m3)) {
			System.out.println("Error: Expected " + m3 + " but got " + m2 + " instead!");
			System.out.println("Failed!");
			System.exit(0);
		}
		if  (m2.equals(m1)) {
			System.out.println("Error: Expected unequal but got equal instead!");
			System.out.println("Failed!");
			System.exit(0);
		}

		if  (!m0.equals(m0)) {
			System.out.println("Error: Expected equal but got unequal instead!");
			System.out.println("Failed!");
			System.exit(0);
		}
		
		if (!m6.equals(m7)) {
			System.out.println("Error: Error in add-minus!");
			System.out.println("Failed!");
			System.exit(0);		
		}
		System.out.println("Passed all tests!");
	}
}
