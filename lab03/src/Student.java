public class Student{
	
	private String studentID = "SP25-BCS-";
	
	private String name;
	
	private String gender;
	
	private Date dateOfBirth;
	
	private Address address;
	
	private static int registrationNumber = 1;
	
	public Student(){
		
	}
	
	public Student(String studentID, String name, String gender, Date dateOfBirth, Address address){
		
		this.studentID = studentID;
		
		this.name = name;
		
		this.gender = gender;
		
		this.dateOfBirth = dateOfBirth;
		
		this.address = address;
		
	}
	
	public Student(String name, String gender, Date dateOfBirth, Address address){
		
		this.studentID = studentID + registrationNumber++;
		
		this.name = name;
		
		this.gender = gender;
		
		this.dateOfBirth = dateOfBirth;
		
		this.address = address;
		
	}
	
	public Student(Student s){
		
		this.studentID = s.studentID;
		
		this.name = s.name;
		
		this.gender = s.gender;
		
		this.dateOfBirth = s.dateOfBirth;
		
		this.address = s.address;
		
	}
		
	public void setStudentID(String studentID){
		
		this.studentID = studentID;
		
	}
	
	public String getStudentID(){
		
		return studentID;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public void setGender(String gender){
		
		this.gender = gender;
		
	}
	
	public String getGender(){
		
		return gender;
		
	}
	
	public void setDateOfBirth(Date dateOfBirth){
		
		this.dateOfBirth = dateOfBirth;
		
	}
	
	public Date getDateOfBirth(){
		
		return dateOfBirth;
		
	}
	
	public static void setRegistrationNumber(int regNum){
		
		registrationNumber = regNum;
		
	}
	
	public static int getRegistrationNumber(){
		
		return registrationNumber;
		
	}
	
	@Override
	public String toString(){
		
		return String.format("Student ID: %s\r\nStudent name: %s\r\nStudent gender: %s\r\nDate of birth: %s\r\nStudent address: %s\r\n", studentID, name, gender, dateOfBirth.toString(), address.toString());
		
	}
	
	@Override
	public boolean equals(Object o){
		
		Student s = (Student) o;
		
		return(studentID == s.getStudentID());
		
	}
	
}