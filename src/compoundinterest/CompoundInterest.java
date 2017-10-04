/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Diego Trujillo <diego.trujillo@alumni.nmt.edu>
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        
        System.out.print("This application computes earnings from compounded"
                + " interest"
                + "\n\nPlease enter the initial amount of money invested: $");
        
        double Pinvestment = scanner.nextDouble();
        
        //Interest in percentage points
        System.out.print("Enter the interest rate: %");
        double pointInterest =scanner.nextDouble();
        //conversion from percentage points into decimal
        double Rinterest = pointInterest / 100.0;
        
        System.out.print("Enter the number of years: ");
        
        double Nyears = scanner.nextDouble();
        
        //Apply the equation : P(1+R/100)^n
        double finalWorth = Pinvestment * Math.pow((1+(Rinterest/100.0 ) ), Nyears);
        
        //Earnings is whatever has been added to the investment.  
        double earnings = finalWorth - Pinvestment;
        
        System.out.println("\n\n An Investment of "+Pinvestment+" dollars"
                + "\n at a rate of "+Rinterest+" % interest compounded annually"
                + "\n for "+Nyears+" years will be worth"
                + "\n $"+moneyFormat.format(finalWorth)+"."
                + "\n That is an earning of $"+moneyFormat.format(earnings)+".");
    }
    
}
