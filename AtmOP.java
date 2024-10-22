//package com.ATM;

import java.util.Scanner;
public class AtmOP {
	double balance;
	void CheckBalance(Scanner sc) {
		System.out.println("your balance is "+balance);
		return;
	}
	void withdrawAmount(Scanner sc) {
		System.out.println("Enter withdraw amount:");
		double am =sc.nextDouble();
		if(!(am %100==0)) {
			System.out.println("Invalid cash,should be 100's");
			return;
		}else if(!(am<balance)) {
			System.out.println("Insufficient balance");
			return;
		}
		balance = balance-am;
		System.out.println("Your Amount is Sucessfully withdrawn");
		System.out.println("Your balance is "+balance);
		}
	void depositAmount(Scanner sc) {
		System.out.println("Enter deposit amount:");
		double am =sc.nextDouble();
		if(!(am %100==0)) {
			System.out.println("Invalid cash,should be 100's");
			return;
		   }
		balance = balance+am;
		System.out.println("Your Amount is Sucessfully Deposited");
		System.out.println("Your balance is "+balance);
		}

	
	public static void main(String [] args) {
		//Atm operations using control statemnts
		AtmOP ob=new AtmOP();
		String password="12345";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter pin:");
		String pass=sc.nextLine();
		if(!password.equals(pass)) {
			System.out.println("Access Denied");
			return;
		}
		boolean Exit=false;
		while(!Exit) {
			System.out.println("Select your option");
			System.out.println("1.CheckBalance");
			System.out.println("2.withdrawAmount");
			System.out.println("3.depositAmount");
			System.out.println("4.Exit");
			int op=sc.nextInt();
			switch(op) {
			case 1:ob.CheckBalance(sc);break;
			case 2:ob.withdrawAmount(sc);break;
			case 3:ob.depositAmount(sc);break;
			case 4:Exit=true;
				System.out.println("Thank you for using our services");
				break;
			default:System.out.println("invalid option!");
		
				}
		  }
   }
}


