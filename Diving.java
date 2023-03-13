/**
 * 
 */
package lab8;

import java.util.Scanner;

/**
 * @author sheelij
 *
 */
public class Diving {

	public final Scanner keyboard = new Scanner(System.in);
	private double[] scores = new double[7];

	public void readScores() {
		System.out.println("Scores should be in the range 0 to 10.");
		
		for (int i = 0; i < 7; i++)
		{
			System.out.print("Enter score for Judge #" + (i + 1) + ": ");
			scores[i] = keyboard.nextInt();
			if (scores[i] < 0 || scores[i] > 10)
			{
				System.out.println("Error in input. Try again!");
				i--;
			}
		}
		// TODO This method should prompt the user for judge's scores
		// It should query the user as shown in the trial run
		// Check for proper input range
		// The method should loop until correct input is received
		
	}

	public double computeSum() {
		double sum = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < 7; i++)
		{
			if(scores[i] >= scores[max])
			{
				max = i;
			}
			if(scores[i] <= scores[min])
			{
				min = i;
			}
			sum = sum + scores[i];
		}
		sum = sum - (scores[max] + scores[min]);
		
		// This method should add all the scores in the array 
		// except the max and min scores
		// It should return the sum of all scores excluding the max and min.
		return sum;
	}

	public double computeScore() {
		// This method will invoke computeSum to get the trimmed sum
		// It should query the user for the degree of difficulty
		// Check for proper input range
		// The method should loop until correct input is received
		// It should then multiply the sum with the valid degree of 
		// difficulty and 0.6. The final result should be returned.
		double degreeOfDifficulty = 0;
		double overallScore = 0;
		while (degreeOfDifficulty < 1.2 || degreeOfDifficulty > 3.8)
		{
			System.out.print("Enter the degree of difficulty for this dive: ");
			degreeOfDifficulty = keyboard.nextDouble();
			if(degreeOfDifficulty < 1.2 || degreeOfDifficulty > 3.8)
			{
				System.out.println("Degree of difficulty should be in the range 1.2 to 3.8.");
				System.out.println("Try again!");
			}
			
			overallScore = (computeSum() * degreeOfDifficulty) * 0.6;
		}
		
		return overallScore;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Diving dd = new Diving();
		dd.readScores();
		System.out.printf("The diver's overall score is %.3f %n", dd.computeScore());
	}

}
