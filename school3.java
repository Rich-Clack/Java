class results{
	private int phy,che,mat;
	public void physics(int p){
		if (p>=0 && p<=150){
			phy=p;
		}
		else{
			phy=-1;
			System.out.println("Invalid Physics Marks");
		}
	}
	public void chemistry(int c){
		if (c>=0 && c<=150){
			che=c;
		}
		else{
			che=-1;
			System.out.println("Invalid Chemistry Marks");
		}
	}
	public void maths(int m){
		if (m>=0 && m<=150){
			mat=m;
		}
		else{
			mat=-1;
			System.out.println("Invalid Maths Marks");
		}
	}


	public void showresults(){
		int total;
		float per;
		total=phy+che+mat;
		per=total*100/450;		
		if (phy==-1 || che==-1 || mat==-1){
			System.out.println("No valid results, all results should be between 0 & 150");
		}
		else{

			System.out.println("The Result is :"+total);
			System.out.println("The Percentage is :"+per);
		}
	}
}

class school3{
	public static void main(String xyz[]){
		results james;

		james=new results();

		james.physics(120);
		james.chemistry(1000);
		james.maths(1100);

		james.showresults();

		
	}
}		