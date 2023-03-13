package finalexam;

public class Money {
	private int dollars;
	private int cents;
	
	public Money(int dollars, int cents) {
		int totalCents = dollars * 100 + cents;
		this.dollars = totalCents / 100;
		this.cents = totalCents % 100;
	}
	
	public Money(int dollars) {
		this.dollars = dollars;
		this.cents = 0;
	}
	
	public Money() {
		this.dollars = 0;
		this.cents = 0;
	}
	
	public static Money add(Money a, Money b) {
		int totalCents = (a.dollars + b.dollars) * 100 + (a.cents + b.cents);
		
		int dollars = totalCents / 100;
		int cents = totalCents % 100;
		
		return new Money(dollars, cents);
		
	}
	
	public static Money minus(Money a, Money b) {
		int totalCents = (a.dollars - b.dollars) * 100 + (a.cents - b.cents);
		
		int dollars = totalCents / 100;
		int cents = totalCents % 100;
		
		return new Money(dollars, cents);
	}
	
	public boolean equals(Money that) {
		return (this.dollars == that.dollars && this.cents == that.cents);
	}
	
	public String toString() {
		String str = "$" + this.dollars + "." + this.cents;
		return str;
	}

	/**
	 * @return the dollars
	 */
	public int getDollars() {
		return dollars;
	}

	/**
	 * @param dollars the dollars to set
	 */
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	/**
	 * @return the cents
	 */
	public int getCents() {
		return cents;
	}

	/**
	 * @param cents the cents to set
	 */
	public void setCents(int cents) {
		int totalCents = cents;
		this.dollars = totalCents / 100;
		this.cents = totalCents % cents;
	}
	
	
}
