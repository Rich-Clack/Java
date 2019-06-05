class maths2 extends maths1{
	public void multiply(int x,int y){
		int result=x*y;
		System.out.println("The result of your multiplication is :"+result);
	}
	public void subtract(int x,int y){
		int result=x-y;
		System.out.println("The result of your subtraction is :"+result);
	}
}
class mathtest{
	public static void main(String xyz[]){
		maths2 x=new maths2();
		x.multiply(3,9);
		maths2 y=new maths2();
		y.subtract(10,5);	
		maths1 p=new maths1();
		p.subtract(10,5);				
		maths2 z=new maths2();
		z.add(2,4);		
	}
}