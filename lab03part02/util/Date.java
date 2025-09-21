public class Date{
	
	private int day;
	
	private int month;
	
	private int year;
	
	public Date(int day, int month, int year){
		
		setDay(day);
		
		setMonth(month);
		
		setYear(year);
		
	}
	
	public void setDay(int day){
		
		if(day > 31){
			
			day = 1;
			
		}
		
		else{
			
			this.day = day;
			
		}
		
	}
	
	public int getDay(){
		
		return day;
		
	}
	
	public void setMonth(int month){
		
		if(month > 12){
			
			month = 1;
			
		}
		
		else{
			
			this.month = month;
			
		}
		
	}
	
	public int getMonth(){
		
		return month;
		
	}
	
	public void setYear(int year){
		
		this.year = year;
		
	}
	
	public int getYear(){
		
		return year;
		
	}
	
	@Override
	public String toString(){
		
		return String.format("%d/%d/%d", day, month, year);
		
	}
	
	public boolean equals(Object o){
		
		Date d = (Date) o;
		
		boolean result = false;
		
		if(day == d.day && month == d.month && year == d.year)
			result = true;
		
		return result;
		
	}
	
}