package org.makerminds.jcoaching.finalexam.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * managing the file.
 * 
 * @author <Eduard-Shahu>
 *
 */
public class VehicleFileManager {
	
	private final String filePath;
	
	public VehicleFileManager(String filePath) {
		this.filePath = filePath;
	}
		
	public List<String> importVehiclesFromFile() throws IOException {
		// TODO read vehicle-list-txt and transform to String array
		// Hint: use java.nio.file.Files and Paths class
		Path path = Paths.get(filePath);
		return Files.readAllLines(path);
    }
    
	public void rewriteFile(List<Vehicle> vehicleList) throws IOException {
		// TODO write back into vehicle-list-txt and transform to String array
		// TODO call method prepareTheVehicleForRewriting(StringBuffer, Vehicle)
		// Hint: use java.nio.file.Path and java.nio.file.Paths class
		Path path = Paths.get(filePath);
		List<String> vehicleStrings = new ArrayList<>();
	    for (Vehicle vehicle : vehicleList) {
	        vehicleStrings.add(prepareTheVehicleForRewriting(vehicle));
	    }
	    Files.write(path, vehicleStrings, StandardCharsets.UTF_8);
	    }
	
	public String prepareTheVehicleForRewriting(Vehicle vehicle) {
		StringBuilder sb = new StringBuilder();
		sb.append(vehicle.getId()).append(",")
        .append(vehicle.getManufacturer()).append(",")
        .append(vehicle.getModel()).append(",")
        .append(vehicle.getHorsePower()).append(",")
        .append(vehicle.getPrice()).append(",")
        .append(vehicle.getColor()).append(",")
        .append(vehicle.getMileage()).append(",")
        .append(vehicle.getProductionYear()).append(",")
        .append(vehicle.getFuelType()).append("\n")
        .append(vehicle.getTransmission()).append(",");
        
		
		return sb.toString();
		
	}
}
	

		   
		   

