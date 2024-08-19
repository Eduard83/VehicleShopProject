package org.makerminds.jcoaching.finalexam.console;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.makerminds.jcoaching.finalexam.controller.VehicleFileManager;
import org.makerminds.jcoaching.finalexam.controller.VehicleShopPrinter;
import org.makerminds.jcoaching.finalexam.controller.VehicleShopProcessor;
import org.makerminds.jcoaching.finalexam.controller.VehicleTransformer;
import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * providing main method to start the application.
 * 
 * @author <Eduard-Shahu>
 *
 */
public class VehicleShop {

	 private static final String VEHICLE_LIST_PATH = "src/main/resources/vehicle-list.txt"; // Update with the actual path

	    public static void main(String[] args) {
	    	try {

	        // File reading
	        VehicleFileManager vehicleFileManager = new VehicleFileManager(VEHICLE_LIST_PATH);
	        List<String> vehicleDataAsStringList = vehicleFileManager.importVehiclesFromFile();
	        
	        /*if (vehicleDataAsStringList == null || vehicleDataAsStringList.isEmpty()) {
	            System.out.println("No vehicle data found. Please check the file path and contents.");
	            return;
	        }*/


	        // Transformation into Vehicle Java Objects
	        VehicleTransformer vehicleTransformer = new VehicleTransformer();
	        List<Vehicle> vehicleList = vehicleTransformer.transformDataArrayToVehicleObjects(vehicleDataAsStringList);

	        // Printing available vehicles 
	        VehicleShopPrinter vehicleShopPrinter = new VehicleShopPrinter();
	        vehicleShopPrinter.printAvailableVehicles(vehicleList);
	        
	        if (vehicleList.isEmpty()) {
                return;
            }

	        // User interaction - selecting a vehicle to sell
	        Scanner scanner = new Scanner(System.in);
	        vehicleShopPrinter.printVehicleIdToSellRequest();
	        int vehicleChosenId = scanner.nextInt();

	        // Selling a vehicle
	        VehicleShopProcessor vehicleShopProcessor = new VehicleShopProcessor();
	        vehicleShopProcessor.sellVehicle(vehicleList, vehicleChosenId);

	        // Write new vehicle list back to file
	        vehicleFileManager.rewriteFile(vehicleList);

	        // Print sold vehicle information and new vehicle list
	        vehicleShopPrinter.printVehicleSoldMessage(vehicleChosenId);
	        vehicleShopPrinter.printAvailableVehicles(vehicleList);
	        scanner.close();
	    } catch (IOException e) {
            System.err.println("An error occurred while processing the vehicle file: " + e.getMessage());
            e.printStackTrace();
	    } catch (IllegalArgumentException e) {
	        System.err.println("Error: " + e.getMessage());
	    }
	}
}
	    