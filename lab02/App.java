public class App{
	
	public static void main(String args[]){
		
		Product p1 = new Product("Apple", 101, 1.25, false);
		
		Product p2 = new Product();
		
		Product p3 = new Product();
		
		Product p4 = new Product(null, 162, 36.00, false);
		
		p2.setProductName("Football");
		
		p2.setProductID(130);
		
		p2.setProductPrice(35.00);
		
		p2.setInStock(true);
		
		p4.setProductName("Chips");
		
		p1.showProductData();
		
		System.out.println();
		
		p2.showProductData();
		
		System.out.println();
		
		p3.showProductData();
		
		System.out.println();
		
		p4.showProductData();
		
		System.out.println();
		
		p4.showMango();
		
	}
	
}