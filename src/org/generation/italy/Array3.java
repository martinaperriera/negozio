package org.generation.italy;

import java.util.Scanner; 

public class Array3 {
	
	public static void main(String[] args) {

	//scanner class declaration
	Scanner sc=new Scanner(System.in); 

	// start latogest.
	System.out.println("Inserisci quanti prodotti sono in vendita: ");
	final int DIMENSIONE_MAGAZZINO=sc.nextInt();
	sc.nextLine();
	
	// dichiarazione variabili e arrays
	String [] nomi=new String[DIMENSIONE_MAGAZZINO];
	double [] prezzo=new double [DIMENSIONE_MAGAZZINO];
	int [] quantitàDisponibile=new int[DIMENSIONE_MAGAZZINO];
	int quantitàDaAcquistare;
	int i=0;
	int indiceProdotto = i;
	String daCercare, risposta; 
	
	for (i=0; i<nomi.length; i++) { 
	System.out.println("Inserisci prodotto: ");
	nomi[i]=sc.nextLine().toLowerCase();
	
	System.out.println("Inserisci prezzo: ");
	prezzo[i]=sc.nextDouble();
	sc.nextLine();
	
	System.out.println("Inserisci la quantità: ");
	quantitàDisponibile[i]=sc.nextInt();
	sc.nextLine();

}
	//latouser
	do {
		System.out.println("Nome del prodotto da acquistare: ");
		daCercare=sc.nextLine();
	
		//start CICLO FOR per la ricerca dei prodotti
		for (i=0; i<nomi.length; i++) { 
			if (nomi[i].contains(daCercare)) {
				System.out.println("Il prodotto esiste: ");
			}
}			
		
			if (indiceProdotto!= -1) {
				System.out.println("Quantità da acquistare: ");
				quantitàDaAcquistare=sc.nextInt();
				sc.nextLine();
				
			// availability check
				if (quantitàDaAcquistare<=quantitàDisponibile[indiceProdotto]) {
				quantitàDisponibile[indiceProdotto]-=quantitàDaAcquistare; 
				
				double importoTotale= prezzo[indiceProdotto] * quantitàDaAcquistare;
				System.out.println("Acquisto andato a buon fine! " + importoTotale + " euro"); 
				}
				
				//sold out
				else { 
				System.out.println("Quantità insufficiente!");
				}
			}
				// unavailable
				else {
					System.out.println("Prodotto non trovato!"); 
				}
	
					//restart
					System.out.println("Vuoi cercare un altro prodotto?"); 
					risposta=sc.nextLine();
					if (risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("sì")) {
						System.out.println("Che prodotto cerchi? ");
						
					}
							
	} while (risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("sì")); 
	System.out.println("Grazie! Alla prossima!"); 
	sc.close();
	
	
	}
}

	

	

