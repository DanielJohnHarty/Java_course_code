/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstexercises;

/**
 *
 * @author Daniel
 */
public class Car {
    
    private int wheels;
    public static int MODEL_ENGINE=8;
    
    public Car(int wh){
        if(wh<0){
            this.wheels=0;
        }else{
            this.wheels=wh;
        }
    }
    
    public void setWheels(int wheels){
        if (wheels>0){
            this.wheels = wheels;
        }else{
            System.out.println("You can only set a positive number of wheels.\n");
        }
    }
    
    public int get_num_wheels(){
        return this.wheels;
    }
}
