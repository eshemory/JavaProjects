/**
 * 
 */
package lab2;

/**
 * @author sheelij
 *
 */
public class PigLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String first = "elijah";
		String last = "shemory";
		
		String firstLetter = first.substring(1, 2).toUpperCase();
		String firstEnd = first.substring(0, 1) + "ay";
		String firstPigLatin = firstLetter + first.substring(2) + firstEnd;
		
		String lastLetter = last.substring(1, 2).toUpperCase();
		String lastEnd = last.substring(0, 1) + "ay";
		String lastPigLatin = lastLetter + last.substring(2) + lastEnd;

		System.out.println("Your pig latin name is " + firstPigLatin + " " + lastPigLatin);
		
		

	}

}
