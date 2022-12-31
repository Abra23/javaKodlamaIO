package entities;

public class Campaign {
	private int id;
	private String name;
	private int price;
	private int inStock;
	
	public Campaign() {
		
	}
	
	
	
	public Campaign(int id, String name, int price, int inStock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.inStock = inStock;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getInStock() {
		return inStock;
	}



	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	
	

}
