package co.anbu;
class TestAccount{
	int actNo;
	String name;
	int amount;
	void createAccount(int a,String n){
		actNo = a;
		name = n;
		amount = 0;
	}
	void withDraw(int amt) {
		if(amt > amount) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount -= amt;
			System.out.println("Amount WithDraw Successfully");
		}
	}
	void insertAmount(int amt) {
		amount +=amt;
	}
	void displayDetails(){
		System.out.println("Account Number : " + actNo);
		System.out.println("Account Holder Name : " + name);
		System.out.println("Available Balance : " + amount);
	}
}
public class Account {
	public static void main(String[] args) {
		TestAccount n1 = new TestAccount(), n2 = new TestAccount();
		n1.createAccount(01, "Anbu");
		n1.insertAmount(1000);
		n2.createAccount(02, "Mai");
		n2.insertAmount(2000);
		n1.withDraw(20);
		n1.displayDetails();
		n2.displayDetails();
	}
}
