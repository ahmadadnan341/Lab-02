public class StudentTest{
	
	public static void main(String args[]){
		
		Student s1 = new Student("Hamza Adnan", "Male", new Date(7, 12, 2005), new Address("Johar Town", "Lahore", "Pakistan"));
		
		Student s2 = new Student("Ahmad Adnan", "Male", new Date(11, 10, 2004), new Address("Johar Town", "Lahore", "Pakistan"));
		
		Student s3 = new Student(s2);
		
		System.out.println(s1.toString());
		
		System.out.println(s2.toString());
		
		System.out.println(s3.toString());
		
		System.out.println(s3.equals(s1));
		
		System.out.println(s3.getDateOfBirth().equals(s2.getDateOfBirth()));
		
	}
	
}