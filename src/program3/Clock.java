package program3;
import static java.lang.System.out;
/*
 * Will Ence
 * 9/18
 */
public class Clock {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds;
		long totalMinutes;
		long totalHours;
		
		totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		out.println(currentHours - 7 + ":" + currentMinutes + ":" + currentSeconds);
		
	}

}
