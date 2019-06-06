class Printvert{
	public static void main(String xyz[]){
		String msg="Hello my Friends";
		String word="";
		int i=0;
		while (i<msg.length()){
			if (msg.substring(i,i+1).equals(" ")){
			System.out.println(word);
			word="";
		}
			else{
				word=word+msg.substring(i,i+1);
	
		}
			i=i+1;
	}
	System.out.println(word);
	}
}