package lab_assignment3;

public class Time {

	private int hour;
	private int min;
	private int sec;

	public Time() {
		setTime(0, 0, 0);
	}

	public Time(int hour, int min, int sec) {
		setTime(hour, min, sec);
	}

	public void setTime(int hour, int min, int sec) {
		if (hour == 24 && min == 0 && sec == 0) {
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		} else if (hour >= 0 && hour < 24 && min >= 0 && min <= 60 && min >= 0 && sec <= 60 && sec >= 0) {
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		} else {
			System.out.println("Invalid time values.");
			// Set default values
			this.hour = 0;
			this.min = 0;
			this.sec = 0;
		}
	}

	public void display() {
		System.out.println("Time : " + hour + " : " + min + " : " + sec);
	}

	public Time addTime(Time time2) {

		int totalhour = this.hour + time2.hour;
		int totalmin = this.min + time2.min;
		int totalsec = this.sec + time2.sec;

		if (totalsec >= 60) {
			totalmin = totalmin + totalsec / 60;
			totalsec = totalsec % 60;
		}

		if (totalmin >= 60) {
			totalhour = totalhour + totalmin / 60;
			totalmin = totalmin % 60;
		}

		if (totalhour >= 24) {
			totalhour = totalhour % 24;
		}

		return new Time(totalhour, totalmin, totalsec);
		
	}

	public static void main(String[] args) {
		Time time1 = new Time(12, 30, 30);
		Time time2 = new Time(4, 20, 20);

		System.out.println("Time 1:");
		time1.display();

		System.out.println("Time 2:");
		time2.display();

		Time sum = time1.addTime(time2);
		System.out.println("Sum of Time 1 and Time 2:");
		sum.display();
	}
}
