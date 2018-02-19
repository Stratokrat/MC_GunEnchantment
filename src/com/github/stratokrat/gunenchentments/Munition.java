package com.github.stratokrat.gunenchentments;

public class Munition {
	
	private String name;
	private int ID;
	private boolean auswurf;
	private int huelseID;
	private int schaden;
	
	public Munition (int ID)
	{
		this.ID = ID;
		switch(ID){
		case 1:	
			this.name = "Eisenpatrone";
			this.auswurf = true;
			this.huelseID = 1;
			this.schaden = 50;
			break;
		case 2:
			this.name = "Kupferpatrone";
			this.auswurf = true;
			this.huelseID = 2;
			this.schaden = 25;
			break;
		case 3:
			this.name = "Zinnpatrone";
			this.auswurf = true;
			this.huelseID = 3;
			this.schaden = 10;
			break;
		default:
			this.name = "Blindgaenger";
			this.auswurf = false;
			this.huelseID = 0;
			this.schaden = 0;
			break;
		}
	}
	
	public String getName() {return this.name;}
	public int getID() {return this.ID;}
	public int getHuelsenID() {return this.huelseID;}
	public int getSchaden() {return this.schaden;}
	public boolean getAuswurf() {return this.auswurf;}

}
