package Week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Deposit Overridded");
	}

	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();


	}

}
