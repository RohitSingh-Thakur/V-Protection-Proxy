package proxy;

import java.time.LocalDate;

public class Teacher {
public static void main(String[] args) {
	DailySession dailySession = new StudentProxy(new Attendance(LocalDate.now(), true));
	dailySession.attendSession();
}
}
