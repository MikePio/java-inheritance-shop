package org.java.shop;

public class Prodotto {
	
	private String codice;
	private String nome; 
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto(String codice, String nome, String marca, float prezzo, int iva) {
		
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
		
	}
	
	// get = lettura
	public String getCodice(){
		return codice;
	}
	
	// get = lettura
	public String getNome() {
		return nome;
	}
	// set = scrittura
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public float calcoloPrezzoConIva(float prezzo, int iva) {
		float prezzoConIva = prezzo + (prezzo * iva / 100);
		// System.out.println(prezzoConIva);
		return prezzoConIva;
	}

	@Override
	public String toString() {
		return "Nome prodotto: " + getNome() + "\ncodice: " + getCodice() + "\nmarca: " + getMarca() + "\nprezzo: " + getPrezzo() + "\nmarca: " + getMarca() + "\niva: " + getIva() + "\nPrezzo + iva: " + calcoloPrezzoConIva(prezzo, iva);
	}
	
	
	

}
