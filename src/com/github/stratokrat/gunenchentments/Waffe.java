package com.github.stratokrat.gunenchentments;

public class Waffe {
	
	private String name;
	private int ID;
	private boolean automatik;
	private int ammo;
	private int firerate;
	private int rpm;
	private int magazin;
	private int ladedauer;
	private int magazin_inhalt;
	
	public Waffe (int ID){
		this.ID = ID;
		this.magazin_inhalt = 0;
		switch(ID){
		case 1:
			this.name = "Repetiergewehr";
			this.automatik = false;
			this.ammo = 1;
			this.firerate = 5;
			this.magazin = 4;
			this.ladedauer = 5;
			break;
		case 2:
			this.name = "Automatikgewehr";
			this.automatik = true;
			this.ammo = 2;
			this.rpm = 300;
			this.magazin = 32;
			this.ladedauer = 3;
			break;
		case 3:
			this.name = "Pistole";
			this.automatik = false;
			this.ammo = 3;
			this.firerate = 1;
			this.magazin = 8;
			this.ladedauer = 2;
			break;
		default:
			this.name = "Knarre";
			this.automatik = false;
			this.ammo = 0; 
			this.firerate = 0;
			this.magazin = 0;
			this.ladedauer = 0;
			break;
		}
	}
	
	public int getID(){
		return this.ID;
	}
	
	public int getAmmo(){
		// Returns the ID of the used ammunition.
		return this.ammo;
	}
	
	public boolean getAutomatik(){
		// Returns boolean, telling if the weapon fires fully automatic.
		return this.automatik;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getFirerate(){
		if(this.automatik == false){
			// Wenn die Waffe nicht vollautomatisch ist, wird die Feuerrate in Sekunden zwischen den Schüssen angegeben. 
			return this.firerate;
		}
		// Umrechnung für vollautomatische Waffen.
		else if(60/this.rpm < 1) {
			return (int)1;
		};
		return (int)60/this.rpm;
		}
	
	public int getMagazin() {
		// Gibt die Größe eines Magazins wieder.
		return this.magazin; 
		}
	
	public int getLadedauer() {
		// Gibt die Zeit in Sekunden wieder, die für das wechseln eines Magazins benötigt wird.
		return this.ladedauer;
	}
	
	public int getMagazinInhalt() {
		// Gibt die derzeitige Ladung des Magazins an.
		return this.magazin_inhalt;
	}
	
	public void setMagazinInhalt(int i) {
		// Ändert die derzeitige Ladung des Magazins.
		this.magazin_inhalt = i;
		return;
	}
	
	public void schuss() {
		// Verschießt einen Schuss.
		if(this.magazin_inhalt > 0)
			this.magazin_inhalt = this.magazin_inhalt - 1;
		return;
	}
	
}
