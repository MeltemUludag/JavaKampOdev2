package classesWithAttributes;

public class Product {
	
	public Product() {
		System.out.println("Yapıcı blok çalıştı");
	}
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
		id=id;
	}

	private String getName() {
		return name;
	}

	private void setName(String name){
		this.name = name;
		
	}
		
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String Description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	

	}


