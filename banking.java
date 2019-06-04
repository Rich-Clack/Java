class bank{
	private int amount;
	public void deposit(int money){
		amount+=money;
	}
	public void withdraw(int money){
		if(money<amount){
		amount-=money;
	}
		else{
			System.out.println("Not enough funds in your account");
	}
	}
	public void balance(){
		System.out.println("Your current balance is :£"+amount);
	}
	public bank(){
		System.out.println("Welcome to the Bank of Java");
	}
}
class banking{
	public static void main(String xyz[]){
		bank ref;
		ref=new bank();
	}
}