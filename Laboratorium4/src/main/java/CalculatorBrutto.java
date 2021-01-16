import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

public class CalculatorBrutto {
	
	public static void main(String[] args) {

		System.out.println("Prosty kalkulator wynagrodzenia dla 1 progu podatkowego i osob zamieszkanych blisko miejsca pracy");
	    Scanner input = new Scanner(System.in);
	    System.out.print("Podaj wynagrodzenie brutto: ");

	    try {
	    	double salary = input.nextDouble();
			double netto = netSalary(salary);
		    System.out.print("Wynagrodzenie netto wynosi: ");
		    System.out.format("%.2f%n", netto);
		    System.out.print("Kwota calkowita ktora ma do zaplacenia pracodawca: ");
		    double totalAmount = totalAmountEmployee(salary);
		    System.out.format("%.2f%n", totalAmount);
	    } 
		catch(java.util.InputMismatchException e) {
			System.out.println("Podano zla kwote");	
		}
	    
	    input.close();
	    
	    Map<String, String> map = new HashMap<String, String>();
	    map.put("A","B");
	    map.put("C","D");
	    map.put("ASD", "QWERTY");
	    
	    Gson gson = new Gson();
	    System.out.println(gson.toJson(map));
	    
	    
	    
	}
	
	
	public static double netSalary(double salary) {
	
		double premium1 = salary * 0.0976; 						// Skladka emerytalna
		double premium2 = salary * 0.015; 						// Skladka rentowa
		double premium3 = salary * 0.025; 						// Skladka chorobowa
		double sumPremium = premium1 + premium2 + premium3; 	
		double premiumPremium = salary - sumPremium; 			// Podstawa wymiaru skladki na ubezpiecznie zdrowotne przykladowe
		double premium4 = premiumPremium * 0.09;				// Skladka na ubezpiecznie zdrowotne 
		double premium5 = premiumPremium - 250; 				// Koszt uzyskania przychodu
		double premium6 = premium5 * 0.17 - 43.76; 
		double premium7 = premiumPremium * 0.0775; 				// Skladka zdrowotna
		double premium8 = premium6 - premium7; 					// Zaliczka na podatek dochodowy do pobrania 
		
		salary = salary - sumPremium - premium4 - premium8;
		
		return salary;
	}
	
	public static double totalAmountEmployee(double salary) {
		
		double plus1 = salary * 0.0976;		// Skladka na ubezpieczenie emerytalne w wysokosci 9,76%
		double plus2 = salary * 0.0650; 	// Skladka na ubezpieczenie rentowe w wysokoscu 6,50%
		double plus3 = salary * 0.0167;		// Skladka na ubezpieczenie wypadkowe w wysokosci 1,67% 
		double plus4 = salary * 0.0245;		// Skladka na Fundusz Pracy 2,45%
		double plus5 = salary * 0.0010;		// Skladka na Fundusz Gwarantowanych Swiadczen Pracowniczych 0,10%
		
		salary = salary + plus1 + plus2 + plus3 + plus4 + plus5;
		
		return salary;
		
	}
	
	
}
