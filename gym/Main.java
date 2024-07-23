package gym;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("İdman programına hoşgeldiniz.");
		String idmanlar = "Geçerli hareketler...\n"
						  +"Burpee\n"
						  +"Pushup\n"
						  +"Situp\n"
						  +"Squat\n";
		System.out.println(idmanlar);
		
		System.out.println("Bir idman oluşturun...");
		
		System.out.println("Burpee sayısı: ");
		int burpee = scan.nextInt();
		
		System.out.println("Pushup sayısı: ");
		int pushup = scan.nextInt();
		
		System.out.println("Situp sayısı: ");
		int situp = scan.nextInt();
		
		System.out.println("Squat sayısı: ");
		int squat = scan.nextInt();
		
		scan.nextLine();
		
		Idman idman = new Idman(burpee,pushup,situp,squat);
		
		System.out.println("İdmanınız başlıyor...");
		
		while(idman.idmanBittiMi()==false) {
			System.out.println("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
			String tur = scan.nextLine();
			
			System.out.println("Bu hareketten kaç tane yapacaksınız ?: ");
			int sayi = scan.nextInt();
			
			
			scan.nextLine();
			
			idman.hareketYap(tur, sayi);
		}
	}
}
