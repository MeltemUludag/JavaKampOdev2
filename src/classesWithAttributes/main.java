package classesWithAttributes;

public class main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		

	}

}
