package Assignmentinterfaces;

	class KingFisher implements Airfare {
	    private String flightName;
	    private double price;

	    public KingFisher() {
	        this.flightName = "KingFisher";
	        this.price = 4500.0;
	    }

	    public KingFisher(String flightName, double price) {
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
	        System.out.println("Ticket booked with KingFisher. Price: " + price);
	    }
	}

