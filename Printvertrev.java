class Printvertrev{
	public static void main(String xyz[]){
		String msg="Hello my Friends";
		String word="";
		int i=(msg.length());
		while (i>0){
			if (msg.substring(i-1,i).equals(" ")){
			System.out.println(word);
			word="";
		}
			else{
				word=msg.substring(i-1,i)+word;
	
		}
			i=i-1;
	}
	System.out.println(word);
	}
}