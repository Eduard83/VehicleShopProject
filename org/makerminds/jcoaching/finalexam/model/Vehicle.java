package org.makerminds.jcoaching.finalexam.model;

/**
 * class for vehicle objects.
 * 
 * @author <Eduard-Shahu>
 *
 */
public class Vehicle {
	
	// TODO Vehicle implementation
	// TODO add attributes and Getters / Setters
	 private int id;
	    private String manufacturer;
	    private String model;
	    private int horsePower;
	    private double price;
	    private String color;
	    private int mileage;
	    private int productionYear;   
	    private String fuelType;
	    private String transmission;

	    public Vehicle(int id, String manufacturer, String model, int horsePower, double price, String color,
				int mileage, int productionYear, String fuelType, String transmission) {
	        this.id = id;
	        this.manufacturer = manufacturer;
	        this.model = model;
	        this.horsePower = horsePower;
	        this.price = price;
	        this.color = color;
	        this.mileage = mileage;
	        this.productionYear = productionYear;
	        this.fuelType = fuelType;
	        this.transmission = transmission;
	    }

	// ... getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	// Method to convert the vehicle to a file string
	public String toFileString() {
	    return id + "|" + manufacturer + "|" + model + "|" + horsePower + "|" + price + "|" + color +
	    		"|" + mileage + "|" + productionYear + "|" + fuelType + "|" + transmission;
	}
	@Override
	public String toString() {
	        return id + "," + manufacturer + "," + model + "," + horsePower + "," + price + "," + color + "," + mileage + ","
	               + productionYear + "," + fuelType + "," + transmission;
	}
}
	
