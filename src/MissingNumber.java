import java.util.*;

/*class to check which number is missing in the sequence of array*/
public class MissingNumber {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void insertValues(int[] array, int range) {
		
		for(int i=0; i<range; i++) {
			
			array[i] = sc.nextInt();
		}
	}
	
	//method to check the missing number
	public static int checkMissingNumber(int[] array, int range) {
		
		int totalSum = (range * (range + 1)) / 2;
		int missingSum = 0;
		
		for(int i=0; i<range; i++) {
			
			missingSum += array[i];
			
		}
		
		return (totalSum - missingSum);
			
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the range: ");
		
		int range = sc.nextInt();
		int[] array = new int[range];
		
		System.out.println("Enter the numbers in the array:");
		insertValues(array, range);
		
		int result = checkMissingNumber(array, range);
		
		System.out.println("Missing value is: " + result);

	}

}
