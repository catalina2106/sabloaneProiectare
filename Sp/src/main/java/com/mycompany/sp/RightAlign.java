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
public class RightAlign implements Strategy{
    @Override
    public void print(String text){
        System.out.println(text + "***");
    }
}
