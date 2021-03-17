package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		
		System.out.println("Test sui libretti \n");
		
		Libretto libretto = new Libretto();
		
		Voto voto1  = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 25));
		Voto voto2  = new Voto("Analisi 2", 25, LocalDate.of(2019, 2, 24));
		Voto voto3  = new Voto("Analisi 3", 23, LocalDate.of(2019, 2, 3));
		Voto voto4  = new Voto("Analisi 4", 25, LocalDate.of(2019, 2, 12));
		Voto voto5  = new Voto("Analisi 5", 29, LocalDate.of(2019, 2, 4));
		
		libretto.add(voto1);
		libretto.add(voto2);
		libretto.add(voto3);
		libretto.add(voto4);
		libretto.add(voto5);
		
		System.out.println("- Voti inseriti: \n");
		System.out.println(libretto);
		
		Libretto venticinque = libretto.LibrettoVotiUguali(25);
		System.out.println("- Voti pari a 25: \n");
		System.out.println(venticinque);
		
		Voto v = libretto.ricercaCorso("Analisi 3");
		System.out.println("- Ricerca voto per nome esame Analisi 3: \n");
		System.out.println(v);
		
		System.out.println("\n- Ricerca voti duplicati o conflitti: \n");
		
		Voto analisi = libretto.ricercaCorso("Analisi 1");
		
		Voto analisi_doppio = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 25));
		Voto analisi_conflitto = new Voto("Analisi 1", 28, LocalDate.of(2019, 2, 25));
		System.out.println(analisi + " doppione di " + analisi_doppio + "? -> "+ libretto.esisteDuplicato(analisi_doppio));
		System.out.println(analisi + " doppione di " + analisi_conflitto + "? -> "+ libretto.esisteDuplicato(analisi_conflitto));
		System.out.println(analisi + " conflitto di " + analisi_doppio + "? -> "+ libretto.esisteConflitto(analisi_doppio));
		System.out.println(analisi + " conflitto di " + analisi_conflitto + "? -> "+ libretto.esisteConflitto(analisi_conflitto));
	}

}
