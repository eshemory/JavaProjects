/**
 * 
 */
package lab8;

import java.util.Random;

/**
 * @author sheelij
 *
 */
public class StandardDeviation {
	
	public static double standardDeviation(int[] array, int count)
	{
		double average = 0.0;
		for (int i = 0; i < count; i++)
		{
			average += array[i];
		}
		average = average / count;
		
		double variance = 0.0;
		
		for (int i = 0; i < count; i++) 
		{
			variance += Math.pow((array[i] - average), 2.0);
		}
		variance = variance / count;
		
		return Math.sqrt(variance);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[100];
		
		int count = 20;
		
		for (int i = 0; i < count; i++)
		{
			array[i] = rand.nextInt(100);
		}
		System.out.println("The array is: ");
		for (int i = 0; i < count; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.printf("The standard deviation of the numbers is %.2f %n", standardDeviation(array, count));

	}

}
