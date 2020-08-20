package by.htp.les10.main;

import by.htp.les10.entity.Airline;
import by.htp.les10.entity.Airport;
import by.htp.les10.logic.AirportLogic;
import by.htp.les10.view.AirportViewver;

public class Main {

	public static void main(String[] args) {
		Airport airp = new Airport();
		AirportLogic logic = new AirportLogic();
		AirportViewver view = new AirportViewver();
		
		airp.add(new Airline());
		airp.add(new Airline("Warszawa", 101, "Huge", 15, "Mo, We, Fr"));
		airp.add(new Airline("Moscow", 103, "Common", 14, "Mo, Fr"));
		
		view.printAll("Just all airlines:", airp);
		
		view.printAll("All airlines to Warszawa:", logic.airlinesByDestination(airp, "Warszawa"));
		
		view.printAll("All airlines leaving on Wednesday:", logic.airlinesByWeekDay(airp, "We"));
		
		view.printAll("All airlines leaving on Monday after 14 p.m.:", logic.airlinesDayHour(airp, "Mo", 14));

	}

}
