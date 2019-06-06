class wordcount{
	public static void main(String xyz[]){
		int count=1;
		int i=0;
		String words ="I was here on the monday but not at the weekend";
		while ((i)<words.length()){
			if (words.substring(i,(i+1)).equals(" ")){
			count+=1;
			}
		i+=1;
	}	
	System.out.println("There are "+count+" word's' ");
	}
}