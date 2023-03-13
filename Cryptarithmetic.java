/**
 * 
 */
package lab5;

/**
 * @author sheelij
 *
 */
public class Cryptarithmetic {

	/**
	 * @param args
	 */
	public static int D;

	public static void main(String[] args) {
		int T = 0, O = 0, G = 0, D = 0;

		int leftSide = 4 * (T * 100 + O * 10 + O);
		int rightSide = G * 1000 + O * 100 + O * 10 + D;

		for (int i = 0; i < 10; i++) {
			T = i;
			for (int j = 0; j < 10; j++) {
				if (j == i)
					continue;
				O = j;
				for (int k = 0; k < 10; k++) {
					if (k == j || k == i)
						continue;
					G = k;
					for (int l = 0; l < 10; l++) {
						if (l == k || l == i || l == j)
							continue;
						D = l;
						if ((4 * (T * 100 + O * 10 + O)) == (G * 1000 + O * 100 + O * 10 + D))
							System.out.println("T = " + T + "  O = " + O + "  G = " + G + "  D = " + D);
					}
				}

			}

		}

	}

}
