package proxy;

public class StudentProxy extends Student { //Protection Proxy

	public StudentProxy(Attendance attendance) {
		super(attendance);
	}

	@Override
	public void attendSession() {
		
		if(super.getAttendance().isPresent()) {
			super.attendSession();
		}else {
			throw new RuntimeException("Student is Absent");
		}
	}
}
