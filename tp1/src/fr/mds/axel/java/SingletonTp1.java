package fr.mds.axel.java;

import fr.mds.axel.java.entities.Entity1;
import fr.mds.axel.java.entities.ListEntity1;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", ListEntity1.getInstance().getListEntity1().stream().count()));

    System.out.println("Ajout de 2 entity1 dans la liste: ");
    
    ListEntity1.getInstance().addEntity1();
    ListEntity1.getInstance().addEntity1();
    
    System.out.println(String.format("Nombre d'Entity1 %d", ListEntity1.getInstance().getListEntity1().stream().count()));
    
    System.out.println("Suppression de 2 entity1 dans la liste: ");

    ListEntity1.getInstance().getListEntity1().remove((ListEntity1.getInstance().getListEntity1().size() - 1));
    ListEntity1.getInstance().getListEntity1().remove((ListEntity1.getInstance().getListEntity1().size() - 1));
    
    System.out.println(String.format("Nombre d'Entity1 %d", ListEntity1.getInstance().getListEntity1().stream().count()));

    for (Entity1 item : ListEntity1.getInstance().getListEntity1()) {
      System.out.println(item);
    }
  }

}
