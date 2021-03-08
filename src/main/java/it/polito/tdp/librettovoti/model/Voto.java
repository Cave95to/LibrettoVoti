package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Voto {
	
	private String nomeCorso;
	private int voto;
	private LocalDate data;
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String toString() {
		String s = "";
		return s+"Esame di " + nomeCorso + ", superato con voto " + voto + ", in data " + data;
	}
	
	

}
