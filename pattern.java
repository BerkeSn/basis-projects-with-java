		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number of line");
		int a = scan.nextInt();
		
		for(int j=0;j<=a;j++) {
			for(int i = 0;i<j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * This is a reverse one.
		for(;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
