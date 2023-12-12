
public class Hora {
	private int hours, minutes, seconds;
	
	public Hora(int hours, int minutes, int seconds) {
		if(hours>=0&&hours<60) {
			this.hours = hours;
		}
		else {
			throw new IllegalArgumentException("Hora invalida");
		}
	}
}
