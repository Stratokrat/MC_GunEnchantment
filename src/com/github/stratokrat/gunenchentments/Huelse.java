package com.github.stratokrat.gunenchentments;

public class Huelse {
	
	private String name;
	private int ID;
	
	public Huelse(int ID){
		this.ID = ID;
		switch(ID) {
		case 1:	name = "Eisenhuelse";
		break;
		case 2: name = "Kupferhuelse";
		break;
		case 3: name = "Zinnhuelse";
		break;
		default: name = "unbekannte Huelse";
		break;
		}
	}
	
	public String getName() { return this.name; }
	public int getID() { return this.ID; }
	
}
