package week2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		
		String[] split = test.split(" ");
		
		for(int i=0;i<split.length;i++) {
			
			if(i%2==1) {				
				for(int j=split[i].length()-1;j>=0;j--) {
					System.out.print(split[i].charAt(j));
				}
				System.out.print(" ");
			}else
			{
				System.out.print(split[i]+ "  ");
			}
			
		}
		
		
		 
	

	}

}
