package javaHomework2;

public class sayiBulma {

	public static void main(String[] args) {
		int [] sayilar = new int[] {32,2,5,7,9,0};
		int aranacak = 49;
		
		
		for(int i=1; i<sayilar.length; i++) {
			if(sayilar[i]==aranacak) {
				System.out.println("Aradığın sayı mevcuttur.");
				return;
			}	
		}
		System.out.println("Aradığın sayı mevcut değil.");
		

	}

}
