package calisanlar_listesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Hoşgeldiniz...");
		String islemler = "İşlemler...\n"
				+"1. Yazılımcı İşlemleri\n"
				+ "2.Yönetici İşlemleri\n"
				+ "Çıkış için 'q' ya basın";
		
		
		while(true) {
			
			System.out.println("********************");
			System.out.print("İşlemi seçiniz: ");
			System.out.println(islemler);
			System.out.println("********************");
			
			String islem = scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("İşlemden çıkılıyor...");
				break;
			}
			else if(islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Berke", "Şen", 1, "Java, C#");
				
				String yazilimci_islem = "1. Format At\n"
						+ "2. Bilgileri Göster\n"
						+ "Çıkış için 'q' ya basın.";
				
				System.out.println(yazilimci_islem);
				
				while(true) {
					System.out.print("İşlemi seçiniz: ");
					String y_islem = scan.nextLine();
					
					if(y_islem.equals("q")) {
						System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
						break;
					}
					else if(y_islem.equals("1")) {
						System.out.print("İşletim Sistemi: " );
						String isletim_sistemi = scan.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					}
					else if(y_islem.equals("2")) {
						yazilimci.bilgileriGoster();
					}
					else {
						System.out.println("Geçersiz işlem");
						}
					}
			}
			else if(islem.equals("2")) {
					Yonetici yonetici = new Yonetici("Onur", "Şen", 2,10);
						
					String yonetici_islem = "Yönetici işlemleri\n"
							+ "1. Zam Yap\n"
							+ "2.Bilgileri Göster\n"
							+ "Çıkış İçin 'q' ya basın.";
					System.out.println(yonetici_islem);
					
					while(true) {
						System.out.println("İşlem seçiniz: ");
						String x_islem = scan.nextLine();
						
						if (x_islem.equals("q")) {
							System.out.println("Yönetici işlemlerinden çıkılıyor...");
							break;
						}
						else if(x_islem.equals("1")) {
							System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz==> ");
							int zam = scan.nextInt();
							scan.nextLine();
							
							yonetici.zamYap(zam/2);
						}
						else if(x_islem.equals("2")) {
							yonetici.bilgileriGoster();
						}
						else {
							System.out.println("Geçersiz işlem");
						}
					}
			}
		}
	}
}