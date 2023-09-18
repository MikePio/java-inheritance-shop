package org.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		// Prodotto prodotto1 = new Prodotto("123465789", "prodotto", "LG", 100, 22);
		// Smartphone telefono1 = new Smartphone("654655658", "smartphone", "Samsung", 1499, 15, "IMEI123456", 64);
		// Televisori televisore1 = new Televisori("21651581", "televisore", "Sony", 1799, 8, "55x65", true);
		// Cuffie cuffie1 = new Cuffie("894969849", "cuffie", "Bose", 299, 20, "nera", false);		
		
		// System.out.println(prodotto1);
		// System.out.println(telefono1);
		// System.out.println(televisore1);
		// System.out.println(cuffie1);

		Scanner sc = new Scanner(System.in);
		System.out.print("Ogni numero rappresenta un prodotto: \n 1) Smartphone \n 2) Televisori \n 3) Cuffie \nInserisci un numero per indicare il prodotto da scegliere: ");
		int input = sc.nextInt();
		// System.out.println(input);
		
		// * Inserito sc.nextLine(); per risolvere un bug dello Scanner che si viene a creare nel momento in cui si passa da un int a una String
		sc.nextLine();

		// attributi della superclasse Prodotto
		String name = null;
		String codice = null;
		String marca = null;
		float prezzo = 0;
		int iva = 22;

		if(input == 1){
			String productType = "Smartphone";
			// attributi della sottoclasse Smartphone
			String imei = null;
			int memoria = 0;
			
			System.out.print("Inserisci nome del/dello/della " + productType + ": ");
			name = sc.nextLine();
			System.out.print("Inserisci codice del/dello/della " + productType + ": ");
			codice = sc.nextLine();
			System.out.print("Inserisci marca del/dello/della " + productType + ": ");
			marca = sc.nextLine();
			System.out.print("Inserisci prezzo del/dello/della " + productType + ": ");
			prezzo = sc.nextFloat();

			System.out.print("Inserisci il codice IMEI del/dello/della " + productType + ": ");
			// * Inserito sc.nextLine(); per risolvere un bug dello Scanner che si viene a creare nel momento in cui si passa da un float a una String
			sc.nextLine();
			imei = sc.nextLine();
			System.out.print("Inserisci la memoria del/dello/della " + productType + ": ");
			memoria = sc.nextInt();

			// nuovo oggetto 
			Smartphone smartphone = new Smartphone( codice, name, marca, prezzo, iva, imei, memoria); 

			// sarebbe il toString di 
			System.out.println(smartphone);

		}else if(input == 2){
			String productType = "Televisore";
			// attributi della sottoclasse Televisori
			String dimensioni = null;
			boolean smart = false;
			
			System.out.print("Inserisci nome del/dello/della " + productType + ": ");
			name = sc.nextLine();
			System.out.print("Inserisci codice del/dello/della " + productType + ": ");
			codice = sc.nextLine();
			System.out.print("Inserisci marca del/dello/della " + productType + ": ");
			marca = sc.nextLine();
			System.out.print("Inserisci prezzo del/dello/della " + productType + ": ");
			prezzo = sc.nextFloat();

			System.out.print("Inserisci le dimensioni del/dello/della " + productType + ": ");
			// * Inserito sc.nextLine(); per risolvere un bug dello Scanner che si viene a creare nel momento in cui si passa da un float a una String
			sc.nextLine();
			dimensioni = sc.nextLine();
			System.out.print("Inserisci 's' se il " + productType + " è smart oppure 'n': ");
			String answer = sc.nextLine();
			smart = ((answer.toLowerCase().equals("s")) ? true : false );

			// nuovo oggetto 
			Televisori televisori = new Televisori( codice, name, marca, prezzo, iva, dimensioni, smart); 

			// sarebbe il toString di Televisori
			System.out.println(televisori);

		}else {
			String productType = "Cuffie";
			// attributi della sottoclasse Cuffie
			String colore = null;
			boolean wireless = false;
			
			System.out.print("Inserisci nome del/dello/della " + productType + ": ");
			name = sc.nextLine();
			System.out.print("Inserisci codice del/dello/della " + productType + ": ");
			codice = sc.nextLine();
			System.out.print("Inserisci marca del/dello/della " + productType + ": ");
			marca = sc.nextLine();
			System.out.print("Inserisci prezzo del/dello/della " + productType + ": ");
			prezzo = sc.nextFloat();
			
			System.out.print("Inserisci il colore del/dello/della " + productType + ": ");
			// * Inserito sc.nextLine(); per risolvere un bug dello Scanner che si viene a creare nel momento in cui si passa da un float a una String
			sc.nextLine();
			colore = sc.nextLine();
			System.out.print("Inserisci 's' se il " + productType + " è wireless oppure 'n': ");
			String answer = sc.nextLine();
			wireless = ((answer.toLowerCase().equals("s")) ? true : false );
			
			// nuovo oggetto 
			Cuffie cuffie = new Cuffie( codice, name, marca, prezzo, iva,  colore,  wireless); 

			// sarebbe il toString di Cuffie
			System.out.println(cuffie);
		}
		
	}
}
