package co.anbu;
import co.anbu.entity.Account;

public class AccountDetails {

	public static void main(String[] args) {
		Account a1,a2;
		a1 = new Account(100.5, "Saving");
		System.out.println(a1.printAccountDetails());
		a2 = new Account(20, "Current");
		System.out.println(a2.printAccountDetails());
		a1.depositAmount(20);
		System.out.println(a1.printAccountDetails());
	}

}
