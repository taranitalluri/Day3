package DAY3;

public class BankApp {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setAccountHolderName("xyz");
		b1.setBalance(20000);
		b1.doDeposit(1000);
		b1.doWithdrawal(5000);
		if(b1.isStatus()) {
			System.out.println(b1.getAccountHolderName()+" is Active"+". Balance is "+b1.getBalance());
		}	else {
			System.out.println(b1.getAccountHolderName()+" is Inactive"+". Balance is "+b1.getBalance());;
		}

		BankAccount b2 = new BankAccount();
		b2.setAccountHolderName("abc");
		b2.setBalance(2000);
		b2.doDeposit(1000);
		b2.doWithdrawal(5000);
		if(b2.isStatus()) {
			System.out.println(b2.getAccountHolderName()+" is Active. Balance is "+b2.getBalance());
		} else {
			System.out.println(b2.getAccountHolderName()+" is Inactive. Balance is "+b2.getBalance());
		}
	}

}

