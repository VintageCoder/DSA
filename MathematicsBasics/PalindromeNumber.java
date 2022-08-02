package MathematicsBasics;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n=13531;
		int rev=reverse(n);
		if(n==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
}
