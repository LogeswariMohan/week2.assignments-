package week2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";
		// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
// Build the logic to find the count of each
				//Convert the String to character array
				char A[] = test.toCharArray();
				//Traverse through each character (using loop)
				for(int i=0;i<A.length;i++) {
					if(Character.isLetter(A[i])) {
						letter++;
					}
					else if(Character.isDigit(A[i])) {
						num++;
					}
					else if(Character.isSpaceChar(A[i])) {
						space++;
					}
					else {
						specialChar++;
					}
				}
				//Find if the given character is what type using (if)
							//i)  Character.isLetter
							//ii) Character.isDigit
							//iii)Character.isSpaceChar
							//iv) else -> consider as special character
		

				//print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

				

	}

}
