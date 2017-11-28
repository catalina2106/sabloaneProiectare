package com.mycompany.sp;
import java.util.Vector;

class Carte {
	private String titlu;
	private Vector<Autor> autori;
	private Vector<Element> continut = new Vector<Element>();
	
	Carte() { }
	Carte(String titlu, Vector<Autor> autori) {
		this.titlu = titlu;
		this.autori = autori;
	}
	
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public Vector<Autor> getAutori() {
		return autori;
	}

	public void setAutori(Vector<Autor> autori) {
		this.autori = autori;
	}

	public Vector<Element> getContinut() {
		return continut;
	}

	public void setContinut(Vector<Element> continut) {
		this.continut = continut;
	}

	public void addElement(Element e) {
		continut.add(e);
	}
	
	public void print() {
		for(Element e: continut) {
			e.print();
		}
	}
}
