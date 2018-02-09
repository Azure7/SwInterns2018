/* created by Qiying Li */
import java.util.Scanner;

public class CheckPalindrome {

	public static int CheckPalindrome(String st) {
		if (st.length() == 0 || st.length() == 1) {
			return 1;
		}
		if (st.charAt(0) == st.charAt(st.length()-1)) {
			return 1*CheckPalindrome(st.substring(1,st.length()-1));
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String userInput = scanner.nextLine();
		
		long beginTime = System.currentTimeMillis();
		int isPalin = CheckPalindrome(userInput);
		if (isPalin == 1) 
			System.out.println(userInput + "is a Palindrome.");
		else
			System.out.println(userInput + " is not a Palindrome.");					
		long endTime = System.currentTimeMillis();
		System.out.println("checked in " + (endTime-beginTime) + " ms");
	}
}
