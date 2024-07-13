import java.util.Scanner

Scanner scan = new Scanner(System.in);
		
		int giris_hakki = 3;
		System.out.print("Lütfen bir kullanıcı adı belirleyiniz==> ");
		String sys_kul_adi = scan.nextLine();
		System.out.print("Lütfen bir şifre belirleyiniz==> ");
		String sys_parola = scan.nextLine();
		
		System.out.println("********************");
		System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
		System.out.println("********************");
		
		while(true) {
			System.out.println("Kullanıcı adı==> ");
			String kullanici = scan.nextLine();
			
			System.out.println("Parola==> ");
			String parola = scan.nextLine();
			
			
			if(sys_kul_adi.equals(kullanici) && sys_parola.equals(parola)) {
				System.out.println("Hoşgeldiniz " + sys_kul_adi);
				break;
			}
			
			else if(!sys_kul_adi.equals(kullanici) && sys_parola.equals(parola)) {
				System.out.println("Böyle bir kullanıcı bulunamamakta...");
				giris_hakki--;
				System.out.println("Kalan giriş hakkı denemeniz: " + giris_hakki);
			}
			else if (sys_kul_adi.equals(kullanici) && !sys_parola.equals(parola)) {
				System.out.println("Girdiğiniz şifre uyuşmamakta...");
				giris_hakki--;
				System.out.println("Kalan giriş hakkı denemeniz: " + giris_hakki);
			}
			else {
				System.out.println("Lütfen tekrar giriniz...");
				giris_hakki--;
				System.out.println("Kalan giriş hakkı denemeniz: " + giris_hakki);
			}
			if (giris_hakki<=0) {
				System.out.println("Giriş hakkınız kalmamıştır. İyi günler dileriz.");
				break;
			}
		}
