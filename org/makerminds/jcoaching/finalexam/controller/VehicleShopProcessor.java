package org.makerminds.jcoaching.finalexam.controller;


import java.util.Iterator;
import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for processing business processes.
 * 
 * @author <Eduard-Shahu>
 *
 */
public class VehicleShopProcessor {
	
	
	/**
	 * responsible to sell a specified vehicle by id
	 * @param vehiclesList
	 * @param vehicleChosenId
	 */
	public void sellVehicle(List<Vehicle> vehiclesList, int vehicleChosenId) throws IllegalArgumentException {
		// TODO selling a vehicle means to remove it from the available vehicle list
		// Hint: use while loop to safely remove an oject from a lst
		boolean vehicleFound = false;
		Iterator<Vehicle> interator = vehiclesList.iterator();
		while(interator.hasNext()) {
			Vehicle vehicle = interator.next();
	        if (vehicle.getId() == vehicleChosenId) {
	        	interator.remove();
	            vehicleFound = true;
	            break;
		
            }
        }
        if (!vehicleFound) {
           throw new IllegalArgumentException("Vehicle with ID " + vehicleChosenId + " was found");
        }
        System.out.println("Vehicle with ID " + vehicleChosenId + " not found.");
        
    }
	    
}
