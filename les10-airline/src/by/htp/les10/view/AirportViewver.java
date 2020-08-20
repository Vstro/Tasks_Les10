package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Airline;
import by.htp.les10.entity.Airport;

public class AirportViewver {

	public void printAll(String message, List<Airline> airlines) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);			
			System.out.println(airline.toString());
		}
	}
	
	public void printAll(String message, Airport airport) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		List<Airline> airlines = airport.getAirlines();
		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);			
			System.out.println(airline.toString());
		}
	}

}
