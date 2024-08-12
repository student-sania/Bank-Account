import java.util.*;
class BankAccount{
	double accountNumber;
	double balance;
	String holderName;
	public void setDetails(double accountNumber,double balance,String  holderName){
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.holderName=holderName;
	}
	public double deposite(double amount){
		if (amount > 0){
		    this.balance+=amount;
		}
		return amount ;
		
	}
	public double withdraw(double amount){
		if (amount > 0 && amount < balance){
	    	this.balance-=amount;
		}
		return amount ;
		
	}
	public double checkBalance(){
		return this.balance;
	}
	public void displayDetails(){
		System.out.println("Account Number is:"+this.accountNumber);
	    System.out.println("Balance is:"+this.balance);
	    System.out.println("Holder Name is:"+this.holderName);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount obj1= new BankAccount();
		System.out.println("Enter Account Number");
		double accountNumber=sc.nextDouble();
		System.out.println("Enter Balance");
		double balance =sc.nextDouble();
		System.out.println("Enter Holder Name");
		String holderName=sc.nextLine();
		obj1.setDetails(accountNumber,balance,holderName);
		obj1.displayDetails();
		
		System.out.println("Enter Deposite");
		double deposite =sc.nextDouble();
		System.out.println("Deposite Amount:"+obj1.deposite(deposite));
		
		System.out.println("Enter Withdraw");
		double withdraw= sc.nextDouble();
		System.out.println("Withdraw Amount:"+obj1.withdraw(withdraw));
		System.out.println("Balance:"+obj1.checkBalance());
		
		BankAccount obj2= new BankAccount();
		System.out.println("Enter Account Number");
		double accountNumber2=sc.nextDouble();
		System.out.println("Enter Balance");
		double balance2 =sc.nextDouble();
		System.out.println("Enter Holder Name");
		String holderName2=sc.nextLine();
		obj2.setDetails(accountNumber2,balance2,holderName2);
		obj2.displayDetails();
		
		System.out.println("Enter Deposite");
		double deposite2 =sc.nextDouble();
		System.out.println("Deposite Amount:"+obj2.deposite(deposite2));
		
		System.out.println("Enter Withdraw");
		double withdraw2= sc.nextDouble();
		System.out.println("Withdraw Amount:"+obj2.withdraw(withdraw2));
		System.out.println("Balance:"+obj2.checkBalance());
	}
}