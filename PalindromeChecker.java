/**
 * 
 */
package lab5;

import java.util.Scanner;

/**
 * @author sheelij
 *
 */
public class PalindromeChecker {

	/**
	 * @param args
	 */
	
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("** Palindrome Tester **");
		
		String response = "y";
		while(response.equalsIgnoreCase("y")) {
			// Loop for the user
			System.out.println("Enter a word and I'll check if it's a palindrome -");
			System.out.print("word? ");
			response = scan.nextLine();
			
			boolean isPalindrome = true;
			
			for(int lo = 0, hi = response.length() - 1; 
					isPalindrome && lo < hi; 
					lo++, hi--) {
				if(response.charAt(lo) != response.charAt(hi)) {
					isPalindrome = false;
				}
					
				}
				if(isPalindrome) {
					System.out.println("The word you entered is a palindrome!");
				}
				else
					System.out.println("What you entered is not a palindrome!");
				
				System.out.println("Would you like to try another word? (y/n) ");
				response = scan.nextLine();
			}
			System.out.println("Goodbye!");
		}
	}


