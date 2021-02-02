package fr.mds.axel.java.builder;

import fr.mds.axel.java.interfaces.Building;
import fr.mds.axel.java.models.CityHall;
import fr.mds.axel.java.models.FireDepartment;
import fr.mds.axel.java.models.House;
import fr.mds.axel.java.models.Market;
import fr.mds.axel.java.models.PowerPlant;
import fr.mds.axel.java.models.School;
import fr.mds.axel.java.models.WaterTower;

public class BuildingBuilder {
	
	public static Building createBuilding(String simpleClassName) {
		Building building = null;
		
		switch(simpleClassName) {
			case "CityHall" : {
				building = new CityHall();
				break;
			}
			case "FireDepartment" : {
				building = new FireDepartment();
				break;
			}
			case "House" : {
				building = new House();
				break;
			}
			case "Market" : {
				building = new Market();
				break;
			}
			case "PowerPlant" : {
				building = new PowerPlant();
				break;
			}
			case "School" : {
				building = new School();
				break;
			}
			default: {
				building = new WaterTower();
			}
		}
		
		return building;
	}

}
