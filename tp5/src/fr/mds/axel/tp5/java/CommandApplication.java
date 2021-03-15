package fr.mds.axel.tp5.java;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Command" afin d'avoir les éléments suivant :
*   - 1 : Le programme permettra de gérer des stocks d'élément :
*       - 1 : On définira GlobalStock comme possédant une liste de Stock
*       - 2 : On ne pourra rajouter dans un GlobalStock que des éléments de Stock configurer par leur nom et une
*           quantité initialement égale à zéro
*       - 3 : Un Stock, à part comme configuration d'un GlobalStock, sera toujours construit en prenant comme
*           informations un nom, une quantité et le GlobalStock au quel il appartient
*       - 4 : Un Stock pourra être acheté ou vendu
*   - 2 : Votre design pattern "Command" doit permettre :
*       - 1 : De concerver toutes les commandes d'achat et de vente
*       - 2 : D'appliquer en une fois toutes les commandes sur le GlobalStock qui leur est rattaché
*       - 3 : Attention il est possible de continuer à passer d'autre commandes d'achat et de vente avec les même objets
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       Stock [ Name: myItem,Quantity: 0]
*       Stock [ Name: apple,Quantity: 0]
*       Stock [ Name: pinapple,Quantity: 0]
*
*
*       Stock [ Name: myItem,Quantity: 20 ] bought
*       Stock [ Name: myItem,Quantity: 20 ] sold
*       Stock [ Name: apple,Quantity: 4 ] sold
*       Stock [ Name: pinapple,Quantity: 7 ] bought
*
*
*       Stock [ Name: myItem,Quantity: 0]
*       Stock [ Name: apple,Quantity: -4]
*       Stock [ Name: pinapple,Quantity: 7]
*/
public class CommandApplication {
  public static void main(String[] args) throws CloneNotSupportedException {
	  
	  GlobalStock globalStock = new GlobalStock();
	  globalStock.showStock();
	  
	  globalStock.bought(new ConcreteCommand(new Stock("myItem", 20)));
	  try {
		globalStock.sold(new ConcreteCommand(new Stock("myItem", 20)));
	} catch (CloneNotSupportedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  try {
		globalStock.sold(new ConcreteCommand(new Stock("apple", 4)));
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  globalStock.bought(new ConcreteCommand(new Stock("pineapple", 7)));
	  
	  System.out.println();
	  globalStock.showHistory();
	  System.out.println();
	  
	  globalStock.showStock();
  }
}
