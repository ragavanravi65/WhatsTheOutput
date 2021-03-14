package batch2;

import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeClass {

	public static void main(String[] args) {

		LocalDateTime date1=LocalDateTime.now();
		System.out.println(date1.plus(Period.ofDays(-1)));
	}

}
