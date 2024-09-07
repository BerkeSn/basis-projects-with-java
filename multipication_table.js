package exam_1;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			String ans;
			String selections = "Please select your choice.\n"
					+ "1.) Addition\n"
					+ "2.) Subtraction\n"
					+ "3.) Multipication\n"
					+ "4.) Devide";
			
			System.out.println(selections);
			String select = scan.nextLine();
			
			
			int a,b;
			
			if(select.equals("1")) {
				
				System.out.print("Enter first number: ");
				a = scan.nextInt();
				System.out.print("Enter second number: ");
				b = scan.nextInt();
				System.out.println();
				
				System.out.println(a + " + " + b + " = " + a+b);
				
				System.out.print("Do you want to do one more? (y/N) ");
                ans = scan.nextLine();
                if (ans.equalsIgnoreCase("y")) {
                    System.out.println("Continuing...");
                    System.out.println();
                } else {
                    break;
                }
			}
			else if (select.equals("2")) {
				System.out.print("Enter first number: ");
				a = scan.nextInt();
				System.out.print("Enter second number: ");
				b = scan.nextInt();
				
				System.out.println(a + " - " + b + " = " + (a-b));
				
				System.out.print("Do you want to do one more? (y/N) ");
                ans = scan.nextLine();
                if (ans.equalsIgnoreCase("y")) {
                    System.out.println("Continuing...");
                    System.out.println();
                } else {
                    break;
                }
			}
			else if(select.equals("3")) {
				System.out.print("Enter first number: ");
				a = scan.nextInt();
				System.out.print("Enter second number: ");
				b = scan.nextInt();
				
				System.out.println(a + " * " + b + " = " + (a*b));
				
				System.out.print("Do you want to do one more? (y/N) ");
                ans = scan.nextLine();
                if (ans.equalsIgnoreCase("y")) {
                    System.out.println("Continuing...");
                    System.out.println();
                } else {
                    break;
                }
			}
			else if(select.equals("4")) {
				System.out.print("Enter first number: ");
				a = scan.nextInt();
				System.out.print("Enter second number: ");
				b = scan.nextInt();
				
				System.out.println(a + " / " + b + " = " + (a/b));
				
				System.out.print("Do you want to do one more? (y/N) ");
                ans = scan.nextLine();
                if (ans.equalsIgnoreCase("y")) {
                    System.out.println("Continuing...");
                    System.out.println();
                } else {
                    break;
                }
			}
			else {
				System.out.println("Please select one of selections.");
			}
		}
	}
}
