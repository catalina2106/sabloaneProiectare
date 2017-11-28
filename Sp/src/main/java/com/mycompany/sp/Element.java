package com.mycompany.sp;
import java.util.Vector;

interface Element {
	void add(Element e);
	void remove(Element e);
	Element getElement(int i);
	Vector<Element> getElement();
	void print();
}
