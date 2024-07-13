		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number==> ");
		int num = scan.nextInt();
		
		int total=0;
		
		do {
			total += num%10;
			num = num/10;
		}while(num>0);
		
		System.out.println("Sum of your number is ==> " + total);
