package com.mycompany.sp;

import java.util.Vector;

class Sectiune implements Element {
	private String titlu;
	private Vector<Element> continut = new Vector<Element>();
	
	Sectiune(String titlu) {
		this.titlu = titlu;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public Vector<Element> getContinut() {
		return continut;
	}

	public void setContinut(Vector<Element> continut) {
		this.continut = continut;
	}
	public void add(Element e) {
		continut.add(e);
	}
	public Element getElement(int i) {
		return continut.get(i);
	}
	public void remove(Element e) {
		continut.remove(e);
		
	}
	public Vector<Element> getElement() {
		return continut;
	}
	public void print() {
		for(Element e: continut) {
			System.out.println(e);
		}
	}
}
