class college{
	private int run, jump, swim, total; float per;
	private void calculations(){
		total=run+jump+swim;
		per=total*100/450;
	}
	public void running(int r){
		if (r>=0 && r<=150){
			run=r;
		}
		else{
			run=-1;
			System.out.println("Invalid result for Running");
		}
	}
	public void jumping(int j){
		if (j>=0 && j<=150){
			jump=j;
		}
		else{
			jump=-1;
			System.out.println("Invalid result for Jumping");
		}
	}
	public void swiming(int s){
		if (s>=0 && s<=150){
			swim=s;
		}
		else{
			swim=-1;
			System.out.println("Invalid result for Swimming");
		}
	}	
public void showresults(){
	if(run==-1 || jump==-1 || swim==-1){
		System.out.println("No Results");
	}
	else{
		calculations();
		System.out.println("Total Marks :"+total);
		System.out.println("Percentage :"+per);
	}
}
}
class college1{
	public static void main(String xyz[]){
		college rich;
		rich=new college();
		rich.swiming(100);
		rich.running(130);
		rich.jumping(125);

		rich.showresults();

	}
}




