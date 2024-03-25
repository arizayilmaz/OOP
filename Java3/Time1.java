package OOP3;

public class Time1 {
	private int hour;
	private int minute;
	private int second;
	
	public Time1(int hour,int minute, int second) 
	{
		setHour(hour);
		setMinute(minute);
		setSecond(second);

	}
	public void setHour (int h)
	{
		if(h>=59||h<=0)
		throw new IllegalArgumentException("hour must be in 0-23");
		this.hour = h;
	}
	public void setMinute(int m)
	{
		if(m>=59||m<=0)
		throw new IllegalArgumentException("min must be in 0-59");
		
		this.minute = m;
	}
	public void setSecond(int s)
	{
		if(s>=59||s<=0)
		throw new IllegalArgumentException("second must be in 0-59");
		this.second = s;
	}
	public String toString()
	{
		return String.format("%02d: %02d: %02d",this.hour,this.minute,this.second);
	}
//	public String toUniversalString() 
//	{
//		
//	}

}
