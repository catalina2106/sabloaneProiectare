package com.mycompany.sp;

import java.util.Vector;

public class Paragraf extends AbstractElement {

    String nume;

    public Paragraf(String nume) {
        this.nume = nume;
    }

    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub

    }

    @Override
    public Element getElement(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vector<Element> getElement() {
        // TODO Auto-generated method stub
        return null;
    }

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void executeStrategy(String text) {
        if (getStrategy() != null) {
            strategy.print(text);
        }
    }

}
