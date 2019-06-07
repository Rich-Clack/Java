class exception2{
	public static void main(String data[]){
		int first,second,result;
		first=second=result=0;
		try{
			first=Integer.parseInt(data[0]);
			second=Integer.parseInt(data[1]);
			result=first/second;
			System.out.println("Result :"+result);
			}
		catch(ArithmeticException exp1){
		System.out.println("You must know by now that you CANNOT divide by zero");
		}
		catch(NumberFormatException exp2){
		System.out.println("Numbers only, how can you divide letters !!");
		}
		catch(IndexOutOfBoundsException exp3){
		System.out.println("Out of bounds");
		}
	}
}