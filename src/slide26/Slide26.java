/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide26;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Slide26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SINGLE = 1;   //DT
		final int HS = 2;   // HS
		final int HSR = 3; // HSR
		final int TCH = 4;  // TCH
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 doc than");
		System.out.println("2 ho so ket hon chung ");
		System.out.println("3 ho so ket hon rieng");
		System.out.println("4 thue cho chu ho");
		
		System.out.print("Status of you: ");
		int status = scanner.nextInt();
		System.out.print("Income of you: ");
		double income = scanner.nextDouble();
		
		double tax = 0;
		if (income >0 && income <= 8.350) {
			tax = income * 10;
		} else if (income >8.351 && income <= 33.950) {
			tax = income * 15;
		}else if (income >33.951 && income <= 82.250) {
			tax = income * 25;
		}else if (income >82.251 && income <= 171.550) {
			tax = income * 28;
		}else if (income >171.551 && income <= 372.950) {
			tax = income * 33;
		}else  {
			tax = income * 35;
		}
		if (status == SINGLE) {
			System.out.print("Tax for single filers: " + (tax / 100 ) + " USD" );
		} else if (status == HS) {
			System.out.println("tax for married file jointly: " + (tax / 100 ) + " USD");
		} else if (status == HSR) {
			System.out.println("tax for married file separately: " + (tax / 100 ) + " USD");
		} else if (status == TCH) {
			System.out.println("tax for head of household: " + (tax / 100 ) + " USD");
		} else {
			System.out.println("Wrong status");
		}
		scanner.close();
	}
}
