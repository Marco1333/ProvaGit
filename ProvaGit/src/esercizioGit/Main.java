package esercizioGit;

import java.io.File;
import java.util.*;

//ESERCIZIO 3 - Degli utenti hanno un nome, cognome e codice fiscale.
//Creare una mappa che assegni ogni istanza di Utente a un singolo codice fiscale.
//Chiedere in ingresso un codice fiscale e stampare tutti i dati relativi 
//(nome, cognome e codice stesso)

public class Main {
	
	public static void main(String [] args) {
		boolean continua= true;
		Scanner tastiera = new Scanner(System.in);
		do {
		Utente utente1 = new Utente("Marco","Pisilli","PSLM1245");
		Utente utente2 = new Utente("Giuseppe","Verdi","VRDG629");
		Utente utente3 = new Utente("Mario","Rossi","RSSM571");
		
		Map<String, Utente> persona = new HashMap<String,Utente>();
		
		persona.put(utente1.getCf(), utente1);
		persona.put(utente2.getCf(),utente2);
		persona.put(utente3.getCf(), utente3);
			
		
		System.out.println("Inserisci il codice fiscale");//VRDG629
		String sceltaCF = tastiera.nextLine();
		System.out.println("Hai inserito il cf: "+sceltaCF);
		try {
		Utente valore = persona.get(sceltaCF);
		System.out.println("Valore "+valore.toString());
		
		
		}
		catch(Exception e) {
			System.out.println("Nessun riscontro");
		}
		System.out.println("");
		System.out.println("sono la nuova versione");
		System.out.println("Vuoi continuare? Y/N");
		String scelta = tastiera.next();
		if (scelta.equalsIgnoreCase("N"))continua=false;
		
	}while(continua);
		System.out.println("Grazie, Arrivederci");
		tastiera.close();
		System.exit(0);
	}	
}
//VRDG629
