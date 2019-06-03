class results{
	private int phy,che,mat;
	public void physics(int p){
		if (p>=0 && p<=150){
			phy=p;
		}
		else{
			System.out.println("Invalid Physics Marks");
		}
	}
	public void chemistry(int c){
		if (c>=0 && c<=150){
			che=c;
		}
		else{
			System.out.println("Invalid Chemistry Marks");
		}
	}
	public void maths(int m){
		if (m>=0 && m<=150){
			mat=m;
		}
		else{
			System.out.println("Invalid Maths Marks");
		}
	}


	public void showresults(){
		int total;
		total=phy+che+mat;
		System.out.println("Total Scores :"+total);
		if (total>300){
			System.out.println("You have passed");
		}
		else{
			System.out.println("You chose poorly");
		}
	}
}

class school2{
	public static void main(String xyz[]){
		results peter,james;
		peter=new results();
		james=new results();
		peter.maths(50);
		peter.chemistry(100);
		peter.physics(100);
		james.physics(120);
		james.chemistry(1000);
		james.maths(110);

		System.out.println("Peter :");
		peter.showresults();
		System.out.println("James :");
		james.showresults();
	}
}		