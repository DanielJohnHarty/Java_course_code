/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstexercises;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Daniel
 */
public class main {
    public static void main(String [ ] args){
        System.out.println("Main function running...\n\n");
        Car c = new Car(4);
        System.out.println("This car has "+ c.get_num_wheels()+" wheels.");
        c.setWheels(17);
        System.out.println("This car has "+ c.get_num_wheels()+" wheels.");
        
        
        myNumber myNum = new myNumber(10.0f);
        myNum.plus(5f);
        myNum.plus(5);
        myNum.plus(534543.43543543);
        myNum.minus(7.5f);
        myNum.divdeby(3.5f);
        myNum.multiplyby(1.25f);
        
        myNum.set_value(10);
        
        
        System.out.println("Testing to string method\n");
        System.out.println(myNum.get_string_value());
        
        myNumber myNum2 = new myNumber(10);
        System.out.println(myNum2.equals(10.0f));
        System.out.println(myNum2.equals(000010.0000));
        System.out.println(myNum2.equals(myNum));
    }
}
