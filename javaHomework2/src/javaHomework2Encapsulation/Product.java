package javaHomework2Encapsulation;

public class Product {
	
	public Product(int Id, String name, String description, double price,int stockAmount) {
		
		System.out.println("Yapıcı blok çalıştı");
		this.Id = Id;
		this.description = description;
		this.stockAmount = stockAmount;
		this.price = price;
		this.name = name;
		
		
	}
	private int Id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	public String getKod() {
		return name.substring(0,1)+ Id;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	

}
