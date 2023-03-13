package exam4;

public class HotDogStandTester {

	public static void main(String[] args) {
		HotDogStand stand1 = new HotDogStand(1, 0);
		HotDogStand stand2 = new HotDogStand(2, 10);
		HotDogStand stand3 = new HotDogStand(3, 20);
		
		System.out.println("Testing Constructor side effect...");
		int n = HotDogStand.getTotalSold();
		if ( n != 30) {
			System.out.println("Expected 30 hot dogs!");
			System.out.println("Got only " + n);
			System.out.println("Failed!");
		} else {
			System.out.println("Got " + n + "!");
			System.out.println("Passed!");
		}
		System.out.println();
		n = 10;
		System.out.printf("Selling %d hot dogs from %s, which already has sold %d hot dogs. %n", n, "stand1", stand1.getSold());
		for (int i = 0; i < n; i++)
			stand1.justSold();
		System.out.println("Testing getter...");
		n = stand1.getSold();
		if (n != 10) {
			System.out.println("Expected 10 hot dogs!");
			System.out.println("Got " + n + " instead!");
			System.out.println("Failed!");
		} else {
			System.out.println("Got " + n + "!");
			System.out.println("Passed!");
		}
		System.out.println();
		
		n = 20;
		System.out.printf("Selling %d hot dogs from %s, which already has sold %d hot dogs. %n", n, "stand2", stand2.getSold());
		for (int i = 0; i < n; i++)
			stand2.justSold();
		System.out.println("Testing getter...");
		n = stand2.getSold() ;
		if (n != 30) {
			System.out.println("Expected 30 hot dogs sold!");
			System.out.println("Got " + n + " instead!");
			System.out.println("Failed!");
		} else {
			System.out.println("Got " + n + "!");
			System.out.println("Passed!");
		}
		System.out.println();
		
		n = 30;
		System.out.printf("Selling %d hot dogs from %s, which already has sold %d hot dogs. %n", n, "stand3", stand3.getSold());
		for (int i = 0; i < n; i++)
			stand3.justSold();
		System.out.println("Testing getter...");
		n = stand3.getSold() ;
		if (n != 50) {
			System.out.println("Expected 50 hot dogs sold!");
			System.out.println("Got " + n + " instead!");
			System.out.println("Failed!");
		} else {
			System.out.println("Got " + n + "!");
			System.out.println("Passed!");
		}
		System.out.println();

		System.out.println("Testing IDs...");
		if (stand1.getIdentity() != 1 || stand2.getIdentity() != 2 || stand3.getIdentity() != 3) {
			System.out.println("Expected 1,2, and 3 as IDs!");
			System.out.printf("Got %d, %d, and %d instead %n", stand1.getIdentity(),
					stand2.getIdentity(), stand3.getIdentity());
			System.out.println("Failed!");
		} else {
			System.out.printf("Got %d, %d, and %d. %n", stand1.getIdentity(),
					stand2.getIdentity(), stand3.getIdentity());
			System.out.println("Passed!");
		}
		System.out.println();
		
		int a = stand1.getSold();
		int b = stand2.getSold();
		int c = stand3.getSold();
		int total = a+ b +c;
		System.out.println("Testing overall sales...");
		if (total != HotDogStand.getTotalSold() || total != 90) {
			System.out.printf("Expected %d hot dogs sales! %n", (a+b+c));
			System.out.printf("Got %d hot dogs instead %n", HotDogStand.getTotalSold());
			System.out.println("Failed!");
		} else {
			System.out.printf("Got %d hot dogs sold overall! %n", HotDogStand.getTotalSold());
			System.out.println("Passed!");
		}
		System.out.println("Done!");

	}

}
