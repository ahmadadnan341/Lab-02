public class App{
	
	public static void main(String args[]){
		
		Product p1 = new Product("Apple", 101, 1.25, false);
		
		Product p2 = new Product();
		
		p2.setProductName("Football");
		
		p2.setProductID(130);
		
		p2.setProductPrice(35.00);
		
		p2.setInStock(true);
		
		p1.showProductData();
		
		System.out.println();
		
		p2.showProductData();
		
	}
	
}