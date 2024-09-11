package calisanlar_listesi;

public class Yazilimci extends Calisan {
	
	private String diller;
	
	public Yazilimci(String ad, String soyad, int id, String diller) {
		super(ad,soyad,id);
		
		this.diller = diller;
		
		
	}
	public void formatAt(String isletim_sistemi) {
		System.out.println(getAd() + isletim_sistemi +" ne format atıyor...");
	}
	
	
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Yazılımcının bildiği diller: " + diller);
	}
	
	
}