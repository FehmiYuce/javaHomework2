package javaHomework2Encapsulation;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("Ürün eklendi "+ product.getName());

	}
	
	public void Remove(Product product) {
		System.out.println("Ürün kaldırıldı "+ product.getDescription());
	}
	
	public void Update(Product product) {
		System.out.println("Ürün güncellendi "+ product.getId());
	}

}
