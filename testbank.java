class bank{
	static int dollar;
	public void setdollar(int A){
		dollar=A;
	}
	public void amount(int b){
		System.out.println("The amount is :"+b*dollar);
	}
}

class testbank{
		public static void main(String xyz[]){
		bank hsbc, natwest, nbs;
		hsbc=new bank();
		natwest=new bank();
		nbs=new bank();
		hsbc.setdollar(100);
		nbs.amount(2);
		nbs.setdollar(50);
		natwest.amount(2);
	}
}
