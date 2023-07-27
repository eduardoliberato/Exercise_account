package Bank;

public class account {
	
	private double balance;
	private int numberAccount;
	private String name;
	
	public account(double balance, int numberAccount, String name) {
		this.balance = balance;
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public account(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double deposit(double balance){
		return this.balance += balance;
	}
	
	public double withdraw(double balance){
		return this.balance -= balance + 5;
		//5 is the cost of the transaction
	}
	
	//transform the atributes of the object in to string
	public String toString() {
		
		return "Account " + numberAccount + 
				", Holder: " + name +
				", Balance: $ " + 
				String.format("%.2f", balance);
		
	}


}
