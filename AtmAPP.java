

import java.util.*;

public class AtmAPP {

	public static void main(String[] args)
	{
		int atmnumber=12345;
		int atmpin=123;
		AtmOperationImpl op=new AtmOperationImpl();
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Wellcome to ATM machine");
		System.out.println("Enter ATM Number : ");
		int atmNumber=scan.nextInt();
		System.out.println("Enter PIN : ");
		int pin=scan.nextInt();
		
		if((atmnumber==atmNumber)&& (atmpin==pin))
		{
			System.out.println("Validation Done");
			while(true)
				{
				
				System.out.println("1.view Available Balance\n2.Withdraw Amount\n3.Deposite Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter The Choice");
				int ch=scan.nextInt();
				if(ch==1)
				{
					
					op.viewbalance();
					
				}
				else if(ch==2)
				{
					System.out.println("Enter withdraw amount:\n Please enter multiple of 500 and 1000's");
					int withdrawAmount=scan.nextInt();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if (ch==3)
				{
					System.out.println("entet Amount to deposite:");
					int depositeAmount =scan.nextInt();
					op.depositeAmount(depositeAmount);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
				}
				else if(ch==5)
				{
					
					System.out.println("Collect Your ATM card \n Thank you for Chosing ATM");
					System.exit(5);
					
				}
				else
				{
					System.out.println("Please Enter Correct choice");
				}				}
			
		}
		else
		{
			System.out.println("invalid Atm Number or Password");
			System.exit(0);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


}
