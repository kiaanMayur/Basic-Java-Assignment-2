import java.util.Scanner;

/*class to check whether a number is pallindrome or not
 * pallindrome number when spelled backwards is same as original
 * 123 is not pallindrome since it reads backward as 321, 321 != 123
 * 121 is pallindrome since it reads backward as 121, 121 == 121
 * */
public class Pallindrome {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int number, rev=0, temp, rem;
			System.out.println("Enter the NO.");
			number = sc.nextInt();
			temp = number;
			while(temp > 0) {
				rem = temp % 10;
				rev = (rev * 10) + rem;
				temp = temp / 10;
				
			}
			
			if(rev == number)
					System.out.println("True");
			else
					System.out.println("False\n From left to right, it reads, " + number + ". From right to left, it becomes " + rev + ". Therefore it is not a pallindrome.");
			
			sc.close();	
	}
}