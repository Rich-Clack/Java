class results{
	public static void main (String xyz[]){
		int phy,che,mat,total;
		float per;
		phy=50;che=50;mat=100;
		total=phy+che+mat;
		per=total*100/450;
		System.out.println("Total Marks :"+total);
		System.out.println("Percentage :"+per);
	if(per>=60){
		System.out.println("Congrats you have passed the exams");
	}
	if(per<60){
		System.out.println("What a tool, you have failed. GET OUT");
		System.out.println("I'm sorry, I didnt mean that. Have another try on me");
	}
}
}