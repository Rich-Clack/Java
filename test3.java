class maths{
	public void addition(int a, int b){
		int result;
		result=a+b;
		System.out.println("Result of the addition is :"+result);
	}
	public int subtraction(int a, int b){
		int answer;
		answer=a-b;
		return answer;
	}
}
class test3{
	public static void main(String xyz[]){
		maths x;
		x=new maths();
		x.addition(2,10);
		System.out.println("Result of the subtraction is :"+x.subtraction(100,5));
	}
}