class loops5{
	public static void main(String xyz[]){
		int A,B,C;
		A=1;
		B=10;
		C=100;
		for(;A<=10 && B<=100 && C<=900;){
			System.out.println(A+"-"+B+"-"+C);
			A++;
			B+=10;
			C+=100;
		}
	}
}