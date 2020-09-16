public class DateTest {
	public static void displayDate(Date d) {
		System.out.printf("%d/%d/%d\n", d.getDay(), d.getMonth(), d.getYear());
	}
	public static void main(String[] args){
		Date d1 = new Date(12,10,2001);
		Date d2 = new Date(24,9,2010);
		
		displayDate(d1);
		displayDate(d2);
	}
}