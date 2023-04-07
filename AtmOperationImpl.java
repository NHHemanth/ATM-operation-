
import java.util.*;

class AtmOperationImpl implements AtmOperationInterf
{
	
	ATM atm=new ATM();
	Map<Double,String> ministatement =new HashMap<>();
	
	public void viewbalance() 
	{
	 System.out.println("Available balance is : "+ atm.getBalance() );
		
	}


	public void withdrawAmount(double withdrawAmount) {
		
		if(withdrawAmount%500==0 || withdrawAmount%1000==0 )
		{
			if(withdrawAmount<=atm.getBalance())

			{
				ministatement.put(withdrawAmount,"Amount Withdrawn");
				System.out.println(withdrawAmount+"collect the cash!!");
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewbalance();
			}
			else {
				System.out.println("insufficient balance");
			}
				
		}
		else
			
		{
			System.out.println("enter amount multiple of 500 or 1000");
		}
		
		
	}


	public void depositeAmount(double depositeAmount) {
		
		ministatement.put(depositeAmount,"Amount deposited");
		System.out.println(depositeAmount+"deposited amount succesfully!!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewbalance();
		
	}

	
	public void viewMiniStatement() 
	{
		for(Map.Entry<Double,String> m:ministatement.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue() );
		}
		
		
		
	}


	

}
