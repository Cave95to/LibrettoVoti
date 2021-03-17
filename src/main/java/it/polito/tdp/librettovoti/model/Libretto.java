package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libretto {
	
	private List<Voto> voti;
	private Map<String, Voto> votiMap; //la chiave è il nome dell'esame poi oggetto è voto nella sua interezza (nome esame, data ecc)
	
	public Libretto() {
		this.voti = new ArrayList<>();
		this.votiMap = new HashMap<>();
	}

	public void add(Voto voto) {
		this.voti.add(voto);
		this.votiMap.put(voto.getNomeCorso(), voto);
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
		/* for (Voto v : this.voti) {
			if (nomeCorso.equals(v.getNomeCorso()))
				return v;
		}
		return null;
		*/
		return this.votiMap.get(nomeCorso);
	}

	public boolean esisteDuplicato(Voto v) {
		/* for (Voto voto : this.voti) {
			if (voto.getNomeCorso().equals(v.getNomeCorso()) && voto.getVoto()==v.getVoto())
				return true;
		}
		return false;
		*/
		Voto trovato = this.votiMap.get(v.getNomeCorso());
		if (trovato==null)
			return false;
		if (trovato.getVoto()==v.getVoto())
			return true;
		else
			return false;
	}
	
	public boolean esisteConflitto(Voto v) {
		/*for (Voto voto : this.voti) {
			if (voto.getNomeCorso().equals(v.getNomeCorso()) && voto.getVoto()!=v.getVoto())
				return true;
		}
		return false;
		*/
		Voto trovato = this.votiMap.get(v.getNomeCorso());
		if (trovato==null)
			return false;
		if (trovato.getVoto()!=v.getVoto())
			return true;
		else
			return false;
	}
}
