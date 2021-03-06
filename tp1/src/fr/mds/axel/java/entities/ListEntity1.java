package fr.mds.axel.java.entities;

import java.util.ArrayList;
import java.util.List;

public class ListEntity1 {
	
	private ListEntity1() {
		this.listEntity1 = new ArrayList<>();
		this.lastId = 0;
		for (int i = 0; i < 20; i++) {
			this.addEntity1();
		}
	}
     
    private static ListEntity1 INSTANCE = null;
    private List<Entity1> listEntity1;
    private int lastId;
     
    public static synchronized ListEntity1 getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new ListEntity1(); 
        }
        return INSTANCE;
    }
    
    public List<Entity1> getListEntity1() {
		return listEntity1;
	}
    
    public void addEntity1() {
    	Entity1 entity1 = new Entity1();
    	this.lastId++;
    	entity1.setId(this.lastId);
    	entity1.setData("data " + this.lastId);
    	this.listEntity1.add(entity1);
    }
}
