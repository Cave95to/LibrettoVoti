package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}

	public void add(Voto voto) {
		this.voti.add(voto);
	}

	public String toString() {
		String s="";
		for (Voto v : this.voti) {
			s= s + v.toString() + "\n";
		}
		return s;
	}

	public Libretto LibrettoVotiUguali(int i) {
		Libretto l = new Libretto();
		for ( Voto v : this.voti) {
			if (v.getVoto()==i)
				l.add(v);
		}
		return l;
	}

	public Voto ricercaCorso(String nomeCorso) {
		for (Voto v : this.voti) {
			if (nomeCorso.equals(v.getNomeCorso()))
				return v;
		}
		return null;
	}

	
	

}
