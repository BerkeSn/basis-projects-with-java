public class task_4 {
	public static int ebob(int a,int b) {
		int ebob = 1;
		
		for(int i=1;i<=a && i<=b;i++) {
			if((a%i==0) && (b%i==0)) {
				ebob = i;
			}
		}
		return ebob;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayı==> ");
		int a=scan.nextInt();
		
		System.out.println("İkinci sayı==> ");
		int b=scan.nextInt();
		
		System.out.println("İki sayının ebobu==> " + ebob(a,b));
		
	}
}
