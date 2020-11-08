import java.util.Scanner;

public class MaxValue{
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int max=0;
		int count=1;
		int number=0;
		System.out.print("Enter numbers: ");
		do {
			number=input.nextInt();
			if (number>max) {
				count=0;
				max=number;
			}
			if(number==max) {
				count++;
			}
		}
		while (number!=0);		
		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);
	}
}