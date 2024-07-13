		Scanner scan = new Scanner(System.in);
		
		int total = 1000;
		String islemler = "1.İşlem: Bakiye Öğrenme\n"
				  +"2.İşlem: Para Çekme\n"
				  +"3.İşlem: Para Yatırma\n"
				  +"4.İşlem: Çıkış için q'a basın";
		
		
		System.out.println("*******************************");
		System.out.println(islemler);
		System.out.println("*******************************");
		
		while(true) {
			System.out.print("İşlem seçiniz==> ");
			String islem = scan.nextLine();
			
			if(islem.equals("q")){
				System.out.println("Sistemden çıkılıyor...");
				System.out.println("Çıkış yapıldı.");
				break;
			}
			else if(islem.equals("2")) {
				System.out.println("Çekilecek tutarı giriniz==> ");
				int bakiye = scan.nextInt();
				if (bakiye>total) {
					System.out.println("Yetersiz bakiye");
					continue;
				}
				else {
					total = total-bakiye;
					System.out.println("İşleminiz başarıyla gerçekleştirilmiştir.");
					System.out.println("Kalan bakiyeniz==> " + total);
					break;
					}
				}
			else if (islem.equals("3")){
				System.out.print("Yatırılacak tutarı giriniz==> ");
				int bakiye = scan.nextInt();
				total = total+bakiye;
				System.out.println("Toplam bakiyeniz==> " + total);
			
			}
			else if (islem.equals("1")){
				System.out.println("Bakiyeniz==> " + total);
			}
		}
