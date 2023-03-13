/**
 * 
 */
package lab3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author sheelij
 *
 */
public class Menu {

	public static void main(String[] args) {
		
		NumberFormat moneyFormatterG = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		NumberFormat moneyFormatterUS = NumberFormat.getCurrencyInstance();
		
		String dishAGerman = "Königsberger Klopse";
		String dishAUS = "Meatballs in White Sauce";
		double dishAPrice = 8.99;
		String dishBGerman = "Dampfkartoffeln"; 
		String dishBUS = "Boiled Potatoes";
		double dishBPrice = 2.99;
		String dishCGerman = "Gruene Bohnen";
		String dishCUS = "Green Beans";
		double dishCPrice = 1.99;
		String dishDGerman = "Gurkensalat";
		String dishDUS = "Cucumber Salad";
		double dishDPrice = 3.99;
		String dishEGerman = "Quarkspeise";
		String dishEUS = "Quark Pudding";
		double dishEPrice = 4.99;
		double exchangeRate = 1.02;
		
		System.out.println("**********          Speisekarte          **********\n");
		
		System.out.printf(" %25s %10s \n", 
				dishAGerman, moneyFormatterG.format(dishAPrice * exchangeRate));
		System.out.printf(" %25s %10s \n", 
				dishBGerman, moneyFormatterG.format(dishBPrice * exchangeRate));
		System.out.printf(" %25s %10s \n", 
				dishCGerman, moneyFormatterG.format(dishCPrice * exchangeRate));
		System.out.printf(" %25s %10s \n", 
				dishDGerman, moneyFormatterG.format(dishDPrice * exchangeRate));
		System.out.printf(" %25s %10s \n", 
				dishEGerman, moneyFormatterG.format(dishEPrice * exchangeRate));
		System.out.println("\n");
		
		
		System.out.println("**********              Menu              **********\n");
		
		System.out.printf(" %25s %10s \n", 
				dishAUS, moneyFormatterUS.format(dishAPrice));
		System.out.printf(" %25s %10s \n", 
				dishBUS, moneyFormatterUS.format(dishBPrice));
		System.out.printf(" %25s %10s \n", 
				dishCUS, moneyFormatterUS.format(dishCPrice));
		System.out.printf(" %25s %10s \n", 
				dishDUS, moneyFormatterUS.format(dishDPrice));
		System.out.printf(" %25s %10s \n", 
				dishEUS, moneyFormatterUS.format(dishEPrice));

	}

}
