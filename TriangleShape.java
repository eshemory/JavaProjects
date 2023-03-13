/**
 * 
 */
package exam3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author sheelij
 *
 */
public class TriangleShape {

	public static final NumberFormat formatter = new DecimalFormat("#0.000");
	public static final Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String resp = null;
		
		do {
			System.out.println("Enter the three sides of a triangle and ");
			System.out.println("I will calculate its area and perimeter!");
			
			System.out.print("Enter side a: ");
			double a = scan.nextDouble();
			System.out.print("Enter side b: ");
			double b = scan.nextDouble();
			System.out.print("Enter side c: ");
			double c = scan.nextDouble();
			scan.nextLine();
			
			if(a + b <= c || a + c <= b || b + c <= a) {
				System.out.println("A triangle with these side lengths is not possible!");
			}else {
			double perimeter = a + b + c;
			double semiPerimeter = perimeter / 2;
			double areaSquared = (semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
			double area = Math.sqrt(areaSquared);
			
			System.out.println("The perimeter of the triangle is " + formatter.format(perimeter));
			System.out.println("The area of the triangle is " + formatter.format(area));
			
			
			}
			System.out.print("Would you like to exit? (y/n) ");
			resp = scan.nextLine();
			
		}while(resp.equalsIgnoreCase("n"));
		
		System.out.println("Bye!");
	}

}
