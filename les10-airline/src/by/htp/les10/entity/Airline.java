package by.htp.les10.entity;

public class Airline{
	private String destination;
	private int num;
	private String planeType;
	private int leavingHour;
	private String activeWeekDays;

	public Airline() {
		this.destination = "Unknown";
		this.num = 0;
		this.planeType = "Common";
		this.leavingHour = 12;
		this.activeWeekDays = "Mo, Tu, We, Th, Fr";
	}
	
	public Airline(String destination, int num, String planeType, int leavingHour, String activeWeekDays) {
		this.destination = destination;
		this.num = num;
		this.planeType = planeType;
		this.leavingHour = leavingHour;
		this.activeWeekDays = activeWeekDays;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getLeavingHour() {
		return leavingHour;
	}

	public void setLeavingHour(int leavingHour) {
		this.leavingHour = leavingHour;
	}

	public String getActiveWeekDays() {
		return activeWeekDays;
	}

	public void setActiveWeekDays(String activeWeekDays) {
		this.activeWeekDays = activeWeekDays;
	}

	@Override
	public String toString() {
		return "Airline to " + destination + " [" + num + "]: planeType - " + planeType + ", leavingHour - "
				+ leavingHour + ", activeWeekDays - " + activeWeekDays;
	}

}
