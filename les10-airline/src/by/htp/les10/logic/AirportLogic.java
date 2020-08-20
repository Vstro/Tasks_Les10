package by.htp.les10.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les10.entity.Airline;
import by.htp.les10.entity.Airport;

public class AirportLogic {
	
	public List<Airline> airlinesByDestination(Airport airport, String destination) {
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();
		
		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);
			
			if (airline.getDestination().equals(destination)) {
				result.add(airlines.get(i));
			}
		}
		
		return result;
	}
	
	public List<Airline> airlinesByWeekDay(Airport airport, String weekDay) {
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();
		
		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);
			
			if (airline.getActiveWeekDays().contains(weekDay)) {
				result.add(airlines.get(i));
			}
		}
		
		return result;
	}
	
	public List<Airline> airlinesAfterHour(Airport airport, int hour) {
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();
		
		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);
			
			if (airline.getLeavingHour() > hour) {
				result.add(airlines.get(i));
			}
		}
		
		return result;
	}
	
	public List<Airline> airlinesDayHour(Airport airport, String weekDay, int hour) {
		List<Airline> firstResult = new ArrayList<Airline>();
		List<Airline> secondResult = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();
		
		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);
			
			if (airline.getActiveWeekDays().contains(weekDay)) {
				firstResult.add(airlines.get(i));
			}
		}
		
		for (int i = 0; i < firstResult.size(); i++) {
			Airline airline = firstResult.get(i);
			
			if (airline.getLeavingHour() > hour) {
				secondResult.add(firstResult.get(i));
			}
		}
		
		return secondResult;
	}

}
