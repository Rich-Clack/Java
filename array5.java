class array5{
	public static void main(String xyz[]){
	int[][] myNumbers = { {1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30}};
	int a = myNumbers[0][2];
	int b = myNumbers[0][9];
	int c = myNumbers[1][2];
	int d = myNumbers[1][9];
	int e = myNumbers[2][2];
	int f = myNumbers[2][9];	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(a+b+c+d+e+f+1);
	}
}