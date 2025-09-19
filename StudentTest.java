public class StudentTest{
	
	public static void main(String args[]){
		
		Student s1 = new Student();
		
		Student s2 = new Student("SP25-BCS-001", "Ali", "Male", "12/12/2004", "Johar Town, Lahore");
		
		Student s3 = new Student("Ahmad", "Male", "11/10/2004", "Judicial Colony Phase 2");
		
		Student s4 = new Student("Arham", "Male", "11/10/2004", "Judicial Colony Phase 2");
		
		Student s5 = new Student(s3);
		
		System.out.println(s1.toString());
		
		System.out.println(s2.toString());
		
		System.out.println(s3.toString());
		
		System.out.println(s4.toString());
		
		System.out.println(s5.toString());
		
	}
	
}