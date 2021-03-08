package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		
		System.out.println("Test sui libretti");
		
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
		
		System.out.println(libretto);
		
		
	}

}
