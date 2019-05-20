package cal;

import java.util.Calendar;

public class MonthCal {
	private int year;
	private int month;
	public MonthCal(int year, int month) {
		this.year = year;
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public void show() {
		System.out.println(" 日 月 火 水 木 金 土");
		int youbi = getFirstYoubi();
		showSpace(youbi);
		int last = getLastDay();

		for(int day=1;day<=last;day++) {
			System.out.printf("%3d",day);
			youbi++;
			if( youbi == 7) {
				System.out.println();
				youbi=0;
			}
		}
		System.out.println();
	}
	public int getFirstYoubi() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int n = cal.get(Calendar.DAY_OF_WEEK)-1;
		return n;
	}
	public int getLastDay() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 0);
		int n = cal.get(Calendar.DAY_OF_MONTH);
		return n;
	}
	public void showSpace(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("   ");
		}
	}

}
