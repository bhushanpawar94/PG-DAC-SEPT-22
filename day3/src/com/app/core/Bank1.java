
package com.app.core; // packge name- shoud match with folder strctre

import java.util.*;
public class Bank1{
	String name ;
	int bal,dep,with;
	long accno;
	 
	 void openAcc()
	 {
		 System.out.println("Enter your name= ");
		 Scanner sc= new Scanner (System.in);
		 name= sc.nextLine();
		 System.out.print("Enter the Account Number:  ");
		 accno= sc.nextLong();
		 System.out.println(" Account Created Successfully !");
	 }
	 void display()
	 {
		 if(name==null)
		 {
			 System.out.println("Account not created !");
		 }
		 else
		 {
			 System.out.println();
			 System.out.println("Name	: "+name);
			 System.out.println("Account number	: "+accno);
			 System.out.println("Balance	: "+bal);
		 }
	 }
	 void deposit()
	 {
		 System.out.println("Name	: "+name);
		 System.out.println("Account number	: "+accno);
	     System.out.println("Balance	: "+bal);
		 System.out.print("Enter amount to be deposit = ");
		 Scanner sc=new Scanner(System.in);
		 dep= sc.nextInt();
		 bal=bal+dep;
		System.out.println("Transaction Successful !");
		 System.out.print("Account Balance ="+bal);
	 }
	 
	 void withdraw()
	 {
		 System.out.println("Name	: "+name);
		 System.out.println("Account number	: "+accno);
	     System.out.println("Balance	: "+bal);
		 System.out.print("Enter the amount to withdraw = ");
		 Scanner sc= new Scanner(System.in);
		 with=sc.nextInt();
		 
		 if (with>bal)
		 {
			 System.out.println("Low Balance");
		 }
		 else
		 {
			 if((bal-with)<1000)
			 {
				 System.out.println("Transaction failed due to low balanced ");
				 System.out.println("Balance = "+bal);
			 }
			 else
			 {
				 System.out.println("Transaction Successful ");
				 bal= bal-with;
				 System.out.println("Account Balance = "+bal);
			 }
		 }
	 }
	 
		void checkBalance()
		{
			System.out.println("Account Balance =" +bal);
		}
		
		public static void main (String args[])
		{
			System.out.println("Welcome to CDAC Bank !");
			// check for spaces
			Bank1 b1=new Bank1();
			int b;
			do
			{
				System.out.println();
				System.out.println("Select any option from Below");
				System.out.println(" 1. Account opening ");	
                System.out.println(" 2. Display Information ");	
				System.out.println(" 3. Deposit Ammount ");
				System.out.println(" 4. Withdraw Ammount ");
				System.out.println(" 5. Check Account Balance ");
				System.out.println(" 6. Enter to Exit ");
				Scanner sc = new Scanner(System.in);
				
				b=sc.nextInt();
				switch(b)
				{
					case 1: b1.openAcc();
							break;
							
					case 2: b1.display();
							break;
							
					case 3: b1.deposit();
							break;
							
					case 4: b1.withdraw();
							break;
							
					case 5: b1.checkBalance();
							break;
							
					case 6: System.out.println("Thank you for using our Services");
							break;
							
					default: System.out.println("Invalid ");
				}
			}
			while(b!=6);
		}
}
					
				