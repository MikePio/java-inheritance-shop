package org.java.shop;

public class Smartphone extends Prodotto{

	private String imei; 
	private int memoria;

	public Smartphone(String codice, String nome, String marca, float prezzo, int iva, String imei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		setImei(imei);
		setMemoria(memoria);
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
}
