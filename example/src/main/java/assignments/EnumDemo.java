package assignments;

import com.demo.example.package1.Read;

public class EnumDemo {
	public static void main(String[] args) {
		System.out.println("Enter the day of week");
		String n = Read.input.next();
		try {
			DayOfWeek ob = DayOfWeek.valueOf(n);
			ob.display();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
