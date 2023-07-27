package Program;

import Bank.account;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("what is your name? \n");
		String name = sc.nextLine();
		System.out.println("What is your account number? \n");
		int numberAccount = sc.nextInt();
		System.out.println("Are you going to do an inicial deposit?(y/n) ");
		char answer = sc.next().charAt(0);

		account account = new account(numberAccount, name);

		if (answer == 'y') {
			System.out.println("How much are you going to deposit? \n ");
			double balance = sc.nextDouble();
			account.deposit(balance);
			System.out.println(account);
		} else {
			System.out.println(account);
		}
		
		System.out.println("How much are you going to deposit?\n");
		double balance = sc.nextDouble();
		account.deposit(balance);
		System.out.println(account);
		
		System.out.println("How much are you going to withdraw?\n");
		balance = sc.nextDouble();
		account.withdraw(balance);
		System.out.println(account);
	}

}
