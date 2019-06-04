class accounts{
	public void tax(){
		System.out.println("Tax Rate is : 22.5");
	}
	public void tax(int salary){
		float t;
		t=salary*22.5f/100;
		System.out.println("Your Tax is :"+t);
	}
	public void tax(int salary, float tax_rate){
		float t;
		t=salary*tax_rate/100;
		System.out.println("Your tax is :"+t);
	}
}
class accountstest{
	public static void main(String xyz[]){
		accounts ref=new accounts();
		ref.tax();
		ref.tax(2000);
		ref.tax(2000,15);
	}
}