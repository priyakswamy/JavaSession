import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number = s.nextInt();
		String num = number.toString();
		String rev = null;
		String temp = "";
		while (number != 0) {
			rev = temp + number % 10;
			temp = rev;

			number = number / 10;
		}
		System.out.println(rev);

		if (num.equalsIgnoreCase(rev)) {
		System.out.println(num + "is a palindrome number");
		}
		else {
			System.out.println(num + " is not a palindrome number");
		}*/
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	int number = s.nextInt();
	int rev =0,sum =0;
	while(number!=0) {
		rev = number%10;
		sum = (sum*10) + rev;
		number = number/10;
		
		
	}
	System.out.println(sum);

	if(number==sum) {
		System.out.println("number is a palindrome");
	}
	else {
		System.out.println("number is not");
	}
	}

}
