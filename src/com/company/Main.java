package com.company;

public class Main {

    public static void main(String[] args) {
	    Flight flight = new Flight();
        Pilot pilot1 = new Pilot("Fred","8989898",20000.00);
        Pilot pilot2 = new Pilot("Barney","898989898",21000.00);
        FlightAttendant flightAttendant1 = new FlightAttendant("Mary", "01010101", 1000.00);
        FlightAttendant flightAttendant2 = new FlightAttendant("Daisy", "23232323", 1100.00);
        FlightAttendant flightAttendant3 = new FlightAttendant("Nancy", "34343434", 1200.00);

	    int i = 0;
	    while(i<50){

	         boolean checkPilots = checkIfPilotsReceivedCompass(pilot1, pilot2);
	         boolean checkFlightAttendants = checkIfFlightAttendantsSpeakLanguage(flight,flightAttendant1, flightAttendant2, flightAttendant3);
	         boolean checkFlight = flight.checkIfFlightIsReady();
	         if(checkPilots && checkFlightAttendants && checkFlight){
                 System.out.println("CLEARANCE PASSED");
             }else{
                 System.out.println("clearance failed");
             }
	         i++;
        }
    }


    public static boolean checkIfPilotsReceivedCompass(Pilot pilot1, Pilot pilot2){
        if(pilot1.receivedCompass() && pilot2.receivedCompass()){
            System.out.println("Both pilots received compasses");
            return true;
        }
        return false;
    }

    public static boolean checkIfFlightAttendantsSpeakLanguage(Flight flight, FlightAttendant flightAttendant1, FlightAttendant flightAttendant2, FlightAttendant flightAttendant3){
        if((flight.getLanguage() == flightAttendant1.getLanguage1() || flight.getLanguage() == flightAttendant1.getLanguage2()) &&
                (flight.getLanguage() == flightAttendant2.getLanguage1() || flight.getLanguage() == flightAttendant2.getLanguage2()) &&
                (flight.getLanguage() == flightAttendant3.getLanguage1() || flight.getLanguage() == flightAttendant3.getLanguage2()))
        {
            System.out.println("Flight attendants speak the language of the flight");
            return true;
        }
        return false;
    }
}
