class second{
	int phy,che;
	public void message(){
		System.out.println("Hello");
		System.out.println("my dodgy friend");
	}
}

class test2{
	public static void main(String xyz[]){
		second x;
		x=new second();
		x.phy=75;
		x.message();
	}
}