package week2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		//Declare A String value as"madam"
		String str = "madam";
		//Declare another String rev value as ""
		String rev = "";
		//Iterate over the String in reverse order
		for(int i=str.length()-1; i>=0; i--) {
			//Add the char into rev
			 rev = rev + str.charAt(i);
		}
		//Compare the original String with the reversed String, if it is same then print palinDrome 
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		 
		 //Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 

	}

}
