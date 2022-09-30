package javaHomework2Encapsulation;

public class classesWithAttributes {

	public static void main(String[] args) {
		Product product = new Product(4255,"Asus","Asus Rog Strix",20000,500);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Remove(product);
		productManager.Update(product);
		
		System.out.println(product.getId());
		System.out.println(product.getKod());
		System.out.println(product.getDescription());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getStockAmount());


	}

}
