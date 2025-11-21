package assignments;

public enum DayOfWeek {
	sunday("sun","orange"), monday("moon","white"), tuesday("mars","red"), wednesday("mercury","green"), thursday("jupiter","yellow"), friday("venus","white"), saturday("saturn","blue");
	String owner;
	String color;
	DayOfWeek(String x, String y){
		owner =x;
		color =y;
	}
	
	public void display() {
		System.out.println("Owner is "+owner+" Color "+color);
	}
}
