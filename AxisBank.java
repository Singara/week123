package week3.day1;

        public class AxisBank extends Bank{
		public void deposit() {
			System.out.println("Deposit -> AxisBank");
		}
	    public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		Bank a = new Bank();
		obj.deposit();
		a.deposit();	
	}
	}
	


