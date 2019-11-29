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
public class myNumber {
    private Float value = new Float(0);
    
    public void set_value(float value){
        this.value = (float) value;
    }
    public myNumber(float value){
       this.value = value; 
       System.out.println("\n\nNew myNumber object initialised with vale: "+this.value+"\n");
    }
    
    // Plus methods with various argument types
    public void plus(float number){
        this.value += number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void plus(int number){
        this.value += number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void plus(double number){
        this.value += (float)number;
        System.out.println("    New value: "+this.value+"\n");
    }
    
    // Minus methods with various argument types
    public void minus(int number){
        this.value -= number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void minus(float number){
        this.value -= number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void minus(double number){
        this.value -= (float)number;
        System.out.println("    New value: "+this.value+"\n");
    }

    // Divideby methods with various argument types
    public void divdeby(int number){
        this.value /= number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void divdeby(float number){
        this.value /= number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void divdeby(double number){
        this.value /= (float)number;
        System.out.println("    New value: "+this.value+"\n");
    }
    
    // Multiplyby methods with various argument types
    public void multiplyby(int number){
        this.value *= number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void multiplyby(float number){
        this.value *= number;
        System.out.println("    New value: "+this.value+"\n");
    }
    public void multiplyby(double number){
        this.value *= (float)number;
        System.out.println("    New value: "+this.value+"\n");
    }

    // Get myNumber value as specific data type
    public int get_int_value(){
        return (int) (float)this.value;
    }
    public float get_float_value(){
        return (float) this.value;
    }
    public double get_double_value(){
        return (double) this.value;
    }    
    public String get_string_value(){
        return this.value.toString();
    }    
    
    // Equals methods
    public Boolean equals(int i){
        return i == Math.round(this.value);
    }
    public Boolean equals(float i){
        return i == this.value;
    }
    public Boolean equals(double i){
        return i == (float) this.value;
    }
    public Boolean equals(myNumber num){
        return num.get_float_value() == this.get_float_value();
    }
}    

