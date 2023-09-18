package org.java.shop;

public class Televisori extends Prodotto{
	
	private String dimensioni;
	private boolean smart;
	
	public Televisori(String codice, String nome, String marca, float prezzo, int iva, String dimensioni, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		setDimensioni(dimensioni);
		setSmart(smart);
	}
	
	public String getDimensioni() {
		return dimensioni;
	}
	
	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public boolean getSmart() {
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
}
