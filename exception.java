class exception{
	public static void main(String xyz[]){
		int a,b,c;
		a=b=c=0;
		try{
			a=6;
			b=1.5;
			c=a/b;
			System.out.println("Result is :"+c);
		}
		catch(NumberFormatException exp1){
		}
		catch(ArithmeticException exp2){
		System.out.println("Cannot divide by zero");
		}
		catch()
	}
}