package javaHomework2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Okul çok yorucuydu.";
		String yeniMesaj = ulkeVer();
		System.out.println(yeniMesaj);
		double sayi = topla(6.6,3.3);
		System.out.println(sayi);
		double toplam = topla2(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10);
		System.out.println(toplam);

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static double topla (double sayi1 , double sayi2) {
		return sayi1+sayi2;
	}
	
	public static double topla2(double...sayilar) {
		double toplam = 0;
		for(double sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	public static String ulkeVer() {
		return "Türkiye";
		
	}

}
