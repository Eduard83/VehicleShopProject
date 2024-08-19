package org.makerminds.jcoaching.finalexam.controller;

import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for printing vehicle shop data.
 * 
 * @author <Eduard-Shahu>
 *
 */
public class VehicleShopPrinter {
	
	public  void printAvailableVehicles(List<Vehicle> vehicleList) {
		// TODO Implement print available vehicles
		  System.out.println("\nAvailable Vehicles:");
	        System.out.println("============================================================================================================");
	        System.out.println("ID | Manufacturer | Model   | HorsePower | Price      | Color | Mileage | ProductionYear | FuelType | Transmission ");
	        System.out.println("============================================================================================================");

	        if (vehicleList.isEmpty()) {
	            System.out.println("No vehicles available for sale.");
	            return;
	        }

	        for (Vehicle vehicle : vehicleList) {
	            System.out.printf("%-3d | %-12s | %-7s | %-9d | %-10.2f | %-7s | %-7d | %-10d | %-8s | %-12s\n",
	                vehicle.getId(),
	                vehicle.getManufacturer(),
	                vehicle.getModel(),
	                vehicle.getHorsePower(),
	                vehicle.getPrice(),
	                vehicle.getColor(),
	                vehicle.getMileage(),
	                vehicle.getProductionYear(),
	                vehicle.getFuelType(),
	                vehicle.getTransmission()
	            );
	        }
	        System.out.println("============================================================================================================");
	    }

	    public void printVehicleSoldMessage(int vehicleChosenId) {
	        System.out.println("\nVehicle with ID " + vehicleChosenId + " was sold.");
	        System.out.println("============================================================================================================");
	    }

	    public void printVehicleIdToSellRequest() {
	        System.out.println("============================================================================================================");
	        System.out.println("\n\nPlease enter the number (ID) of the vehicle you want to sell: ");
	    }
	}
				