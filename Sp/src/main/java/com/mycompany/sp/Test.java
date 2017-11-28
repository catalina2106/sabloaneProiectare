/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sp;

/**
 *
 * @author Catalina
 */
public class Test {

    public static void main(String[] args) {

        Sectiune cap1 = new Sectiune("cap 1");
        Paragraf par1 = new Paragraf("par 1");

        par1.setStrategy(new LeftAlign());
        par1.executeStrategy("ceva");
        
        par1.setStrategy(new RightAlign());
        par1.executeStrategy("ceva");
        
        //cap1.setStrategy(new CenterAlign());

    }
}
