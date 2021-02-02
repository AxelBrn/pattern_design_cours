package fr.mds.axel.java;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.mds.axel.java.builder.BuildingBuilder;
import fr.mds.axel.java.interfaces.Building;
import fr.mds.axel.java.utils.ClassUtils;

/**
*
* @author tactfactory
*
* - Modifier le programme pour permettre de créer des Building au travers d'un design pattern "Factory" :
*   - 1 : Il existe 3 façon de créer des Building
*     - 1 : Créer aléatoirement pour toutes les classes du package courant qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites
*     - 2 : Créer depuis une chaine de caractère qui représente le "simpleName" de la classe à utiliser qui implémente
*         "Building", qui possède un constructeur vide, qui est publique et qui n'est pas abstraite
*     - 3 : Depuis une classe qui implémente "Building", qui possède un constructeur vide, qui est publique et qui
*         n'est pas abstraite
*   - 2 : Créer deux listes de building dans le point d'entré de l'application
*     - 1 : La première liste doit contenir 20 Building généré aléatoirement
*     - 2 : La deuxième doit contenir au moins une fois chaque classe qui implémente "Building", qui possède un
*         constructeur vide, qui sont publiques et qui ne sont pas abstraites. En utilisant soit les chaine de
*         caractères ou les classes
*/
public class FactoryTp1 {

  public static void main(String[] args) {
    randomTown();
    System.out.println("---------------------------");
    manualTown();
  }

  private static void manualTown() {
	  List<Building> town = new ArrayList<>();
	  try {
			Class<?>[] classes = ClassUtils.getClasses("fr.mds.axel.java.models");
			for(int i = 0; i < classes.length; i++) {
				if(classes[i].getConstructors().length > 0) {
					town.add(BuildingBuilder.createBuilding(classes[i].getSimpleName()));
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  for(int j = 0; j < town.size(); j++) {
		  System.out.println(town.get(j));
	  }
	  
  }

  private static void randomTown() {
	  List<Building> town = new ArrayList<>();
	  Random rand = new Random();
	  try {
		Class<?>[] classes = ClassUtils.getClasses("fr.mds.axel.java.models");
		int randomIndex;
		for(int i = 0; i < 20; i++) {
			do {
				randomIndex = rand.nextInt(classes.length);
			} while(classes[randomIndex].getConstructors().length == 0);
			town.add(BuildingBuilder.createBuilding(classes[randomIndex].getSimpleName()));
			System.out.println(town.get(i));
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
