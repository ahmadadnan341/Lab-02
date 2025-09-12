public class Product{
	
	private String productName;
	
	private int productID;
	
	private double productPrice;
	
	private boolean isInStock;
	
	public Product(){
		
	}
	
	public Product(String name, int ID, double price, boolean available){
		
		setProductName(name);
		
		setProductID(ID);
		
		setProductPrice(price);
		
		setInStock(available);
		
	}
	
	public void setProductName(String name){
		
		productName = name;
		
	}
	
	public void setProductID(int ID){
		
		productID = ID;
		
	}
	
	public void setProductPrice(double price){
		
		productPrice = price;
		
	}
	
	public void setInStock(boolean available){
		
		isInStock = available;
		
	}
	
	public String getProductName(){
		
		return productName;
		
	}
	
	public int getProductID(){
		
		return productID;
		
	}
	
	public double getProductPrice(){
		
		return productPrice;
		
	}
	
	public boolean getInStock(){
		
		return isInStock;
		
	}
	
	public void showProductData(){
		
		System.out.println("Product Name: " + productName);
		
		System.out.println("Product ID: #" + productID);
		
		System.out.println("Product Price: $" + productPrice);
		
		if(isInStock == true){
			
			System.out.println("Product is in stock.");
			
		}
		
		else{
			
			System.out.println("Product is not in stock.");
			
		}
		
	}
	
}