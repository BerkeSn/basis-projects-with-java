package calisanlar_listesi;

public class Yonetici extends Calisan{
	
	private int sorumlu_kisi_sayısı;
	
	public Yonetici(String ad, String soyad,int id, int sorumlu_kisi_sayisi) {
		super(ad,soyad,id);
		this.sorumlu_kisi_sayısı = sorumlu_kisi_sayisi;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayısı);
	}
	
	public void zamYap(int zam) {
		System.out.println(getAd() + " çalışanlara " + zam + " kadar zam yapılıyor...");
	}
	
}