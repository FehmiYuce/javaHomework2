package javaHomework2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 3, 5, 7, 9, 0 };
		int aranacak = 0;

		Boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			mesajVer("Aradığınız sayı mevcut:" + aranacak);
		} else {
			mesajVer("Aradığınız sayı mevcut değil:" + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
