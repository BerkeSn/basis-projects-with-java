import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numb = scan.nextInt();
		
		String prime = "prime number";
		
		for(int i=2;i<numb;i++) {
			if(numb%i==0) {
				prime="not a prime number";
			}
		}
		
		System.out.println(prime);
		
		
	}
