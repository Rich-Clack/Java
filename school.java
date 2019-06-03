class results{
	int phy,che,mat;

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

class school{
	public static void main(String xyz[]){
		results peter,james;
		peter=new results();
		james=new results();
		peter.mat=50;
		peter.che=100;
		peter.phy=100;
		james.phy=120;
		james.che=100;
		james.mat=110;

		System.out.println("Peter :");
		peter.showresults();
		System.out.println("James :");
		james.showresults();
	}
}