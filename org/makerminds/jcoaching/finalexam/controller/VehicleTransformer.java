package org.makerminds.jcoaching.finalexam.controller;


import java.util.List;
import java.util.stream.Collectors;


import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for transforming vehicle data into {@link Vehicle} objects.
 * 
 * @author <Eduard-Shahu>
 *
 */
public class VehicleTransformer {
	
	 /**
     * Transforms a data array into a {@link Vehicle} list
     * @param vehicleDataArray List of vehicle data strings
     * @return List of {@link Vehicle} objects
     */
    public List<Vehicle> transformDataArrayToVehicleObjects(List<String> vehicleDataArray) {
    	// TODO take data from String list and transform to list of vehicle objects
    	// TODO call method transformToVehicleObject
    	// Hint: use for loop
        /*List<Vehicle> vehicleList = new ArrayList<>();
        for (String vehicleData : vehicleDataArray) {
            Vehicle vehicle = transformToVehicleObject(vehicleData);
            vehicleList.add(vehicle);
        }
        return vehicleList;*/
    	//Option2
    	return vehicleDataArray.stream()
    			.map(this :: transformToVehicleObject)
    			.filter(vehicle -> vehicle != null)
    			.collect(Collectors.toList());
    	
    	/*List<Vehicle> vehicleList = new ArrayList<>();
        for (String vehicleData : vehicleDataArray) {
            try {
                Vehicle vehicle = transformToVehicleObject(vehicleData);
                vehicleList.add(vehicle);
            } catch (IllegalArgumentException e) {
                System.err.println("Skipping invalid vehicle data: " + vehicleData);
            }
        }
        return vehicleList;*/
    }
    /**
	 * Transforms a vehicle string into a {@link Vehicle} object.
	 * @param vehicleAsString vehicle data as string
	 * @return {@link Vehicle} object
	 */
	 private Vehicle transformToVehicleObject(String vehicleAsString) {
		// TODO transform the vehicle as string into a vehicle object
			// Hint: use the split(String) method of a String to define where to split the 
			// String. In this case split on every comma (,)
	        // Split the string by comma
	        String[] vehicleData = vehicleAsString.split(",");
	        
	        if (vehicleData.length != 10) {
	            //throw new IllegalArgumentException("Invalid vehicle data format: " + vehicleAsString);
	        	 System.out.println("Skipping invalid vehicle data: " + vehicleData);
	             return null;
	        }
	        try {
	        	
	        int id = Integer.parseInt(vehicleData[0].trim());
	        String manufacturer = vehicleData[1].trim();
	        String model = vehicleData[2].trim();
	        int horsePower = Integer.parseInt(vehicleData[3].trim());
	        double price = Double.parseDouble(vehicleData[4].trim());
	        String color = vehicleData[5].trim();
	        int mileage = Integer.parseInt(vehicleData[6].trim());
	        int productionYear = Integer.parseInt(vehicleData[7].trim());	      
	        String fuelType = vehicleData[8].trim();
	        String transmission = vehicleData[9].trim();
	       

	        return new Vehicle(id, manufacturer, model, horsePower, price, color, mileage, productionYear, fuelType, transmission);
	    } catch (NumberFormatException e) {
            System.out.println("Skipping invalid vehicle data: " + vehicleData);
            return null;
        }
	 }        
}
