class printrev{
	public static void main(String xyz[]){
		String msg="Hello my Friends";
		String word="";
        for(int i=msg.length()-1; i >= 0; i--){    
            word=word+msg.charAt(i);    
        }    
System.out.println("Reverse of string: "+word);   
	}
}
