import java.util.Scanner;
Scanner scan = new Scanner(System.in);

    /* 
        1-) First of all we need to take a number that user want to find the factorial. Due to that we ask the number and set it to num.

        2-) After we set the number we need one variable that we can keep the factorial. Set it factorial.

        3-) We have to make at least one loop and for loop is easy and practical for this case.

        4-) Rest of it is math.

    */

		System.out.print("Input a number ==> ");
		int num = scan.nextInt();
		int factorial=1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
			System.out.println("Factorial of " + i + " = " + factorial);
		}
		
		System.out.println(factorial);
