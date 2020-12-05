package zad1;

import static org.junit.Assert.fail;

import java.util.Scanner;

public class CalculatorBrutto {
	
	public static void main(String[] args) {

		System.out.println("Prosty kalkulator wynagrodzenia dla 1 progu podatkowego i osob zamieszkanych blisko miejsca pracy");
	    Scanner input = new Scanner(System.in); 
	    System.out.print("Podaj wynagrodzenie brutto: ");
	    
	    try {
	    	double salary = input.nextDouble();
	    	fail("No exception");
			double netto = wynagrodzenieNetto(salary);
		    System.out.print("Wynagrodzenie netto wynosi: ");
		    System.out.format("%.2f%n", netto);
	    } 
		catch(java.util.InputMismatchException e) {
			System.out.println("Podano zla kwote");	
		}
	    
	    input.close();
	    
	    
	  

	    
	}
	
	
	public static double wynagrodzenieNetto(double salary) {
		
		
		double premium1 = salary * 0.0976; //skladka emerytalna
		double premium2 = salary * 0.015; // skladka rentowa
		double premium3 = salary * 0.025; // skladka chorobowa
		double sumPremium = premium1 + premium2 + premium3; // przykladowe 
		double premiumPremium = salary - sumPremium; //  podstawa wymiaru skladki na ubezpiecznie zdrowotne przykladowe
		double premium4 = premiumPremium * 0.09; //skladka na ubezpiecznie zdrowotne 
		double premium5 = premiumPremium - 250; // Koszt uzyskania przychodu
		double premium6 = premium5 * 0.17 - 43.76; // 
		double premium7 = premiumPremium * 0.0775; // skladka zdrowownta powiino wyjsc 
		double premium8 = premium6 - premium7; // zalicznka na podatek dochodowy do pobrania przykladowe 
		
		salary = salary - sumPremium - premium4 - premium8;
		
		return salary;
	}


}
