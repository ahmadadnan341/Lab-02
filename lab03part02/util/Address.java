public class Address{
	
	private String town;
	
	private String city;
	
	private String country;
	
	public void setTown(String town){
		
		this.town = town;
		
	}
	
	public String getTown(){
		
		return town;
		
	}
	
	public void setCity(String city){
		
		this.city = city;
		
	}
	
	public String getCity(){
		
		return city;
		
	}
	
	public void setCountry(String country){
		
		this.country = country;
		
	}
	
	public String getCountry(){
		
		return country;
		
	}
	
	public Address(String town, String city, String country){
		
		setTown(town);
		
		setCity(city);
		
		setCountry(country);
		
	}
	
	@Override
	public String toString(){
		
		return String.format("%s, %s, %s", town, city, country);
	
	}

}