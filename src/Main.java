
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter number n ");
		int n = input.nextInt();

		String ans;
		if (n % 2 == 1) {
			ans = "The number \"n\" is odd";
		} else {

			ans = "The number \"n\" is even";

		}
		System.out.println(ans);

		input.close();

	}

}