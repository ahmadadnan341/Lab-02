public class Person{
	
	private String name;
	
	private Gender gender;
	
	private Address address;
	
	public Person(String name, Address address, Gender gender){
		
		setName(name);
		
		setAddress(address);
		
		setGender(gender);
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public void setGender(Gender gender){
		
		this.gender = gender;
		
	}
	
	public Gender getGender(){
		
		return gender;
		
	}
	
	public void setAddress(Address address){
		
		this.address = address;
		
	}
	
	public Address getAddress(){
		
		return address;
		
	}
	
	@Override
	public String toString(){
		
		return String.format("Name: %s\r\nGender: %s\r\nAddress: %s", name, gender, address.toString());
		
	}
	
}