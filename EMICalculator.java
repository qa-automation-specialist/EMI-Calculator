package cloudberryday2project;


import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        // Step 1: Take loan amount
        System.out.print("Enter Loan Amount: ");
        double principal = scanner.nextDouble();

        // Step 2: Take annual interest rate
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = scanner.nextDouble();

        // Step 3: Take loan tenure in years
        System.out.print("Enter Loan Tenure (in years): ");
        int years = scanner.nextInt();

        // Step 4: Convert values for EMI formula
        double monthlyRate = annualRate / (12 * 100); // monthly interest
        int months = years * 12; // total months

        // Step 5: EMI Formula Calculation
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                   / (Math.pow(1 + monthlyRate, months) - 1);

        // Step 6: Display EMI
        System.out.println("Your Monthly EMI is: " + emi);

        scanner.close();
    }

	}

