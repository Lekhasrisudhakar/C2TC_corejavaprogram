package Assignmentinterfaces;

	class AirIndia implements Airfare {
	    private String flightName;
	    private double price;

	    
	    public AirIndia() {
	        this.flightName = "AirIndia";
	        this.price = 5000.0;
	    }

	    
	    public AirIndia(String flightName, double price) {
	        this.flightName = flightName;
	        this.price = price;
	    }

	   
	    public String getFlightName() {
	        return flightName;
	    }

	    public double getPrice() {
	        return price;
	    }

	   
	    public void setFlightName(String flightName) {
	        this.flightName = flightName;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    
	    public void bookTicket() {
	        System.out.println("Ticket booked with AirIndia. Price: " + price);
	    }
	}

