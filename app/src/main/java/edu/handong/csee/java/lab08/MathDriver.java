package edu.handong.csee.java.lab08;
import edu.handong.csee.java.lab08.math.MathCalculator;

public class MathDriver {

	    public static void main(String[] args){
	        MathDriver myDriver = new MathDriver();
	        myDriver.run(args);
	    }
	    // run method
	    public void run(String[] args){

	        MathCalculator mathCalculator = new MathCalculator();

	        
	        mathCalculator.setName(args[0]);

	        switch(args[1]){
	            case "Max":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Max Answer: " + 
	                                    mathCalculator.getMax(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Min":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Min Answer: " + 
	                                    mathCalculator.getMin(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Abs":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Abs Answer: " + 
	                                    mathCalculator.getAbs(Integer.parseInt(args[2])));
	                break;
	            case "Sum":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Sum Answer: " + 
	                                    mathCalculator.getSum(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Diff":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Diff Answer: " + 
	                                    mathCalculator.getDiff(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Product":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Product Answer: " + 
	                                    mathCalculator.getProduct(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Quotient":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Quotient Answer: " + 
	                                    mathCalculator.getQuotient(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Remainder":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Remainder Answer: " + 
	                                    mathCalculator.getRemainder(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Power":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Power Answer: " + 
	                                    mathCalculator.getPower(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Factorial":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Factorial Answer: " + 
	                                    mathCalculator.getFactorial(Integer.parseInt(args[2])));
	                break;
	            case "Gcd":
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Gcd Answer: " + 
	                                    mathCalculator.getGcd(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Lcm":                
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Lcm Answer: " + 
	                                    mathCalculator.getLcm(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
	                break;
	            case "Square":                
	                System.out.println("Name: " + mathCalculator.getName() + 
	                                    ", Square Answer: " + 
	                                    mathCalculator.getSquare(Integer.parseInt(args[2])));
	                break;
	            default: 
	                System.out.println("Invalid command!!!");
	        }
	    }  
}
