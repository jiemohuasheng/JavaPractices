/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

/**
 *
 * @author zhu143
 */
public class Methods2 {
    //Declare variables
    double x = 1, y = 1, z = 1; //Used encapsulation
    
    //Create a method to get inputs from user
    public void getValues(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }
    
    public void returnValues() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
   
    //Create a method to compute the average
    public double average(){
        double avg = (x + y + z)/3;
        return avg;
    }
    
    public static void main (String[] args){
        Methods2 myMethod = new Methods2();
        Methods2 myMethod2 = new Methods2();

        System.out.println("Before calling the method");
        myMethod.returnValues()
                ;
        myMethod.getValues(5, 6 ,9);// calling the method
        
        System.out.println("After calling the method");
        myMethod.returnValues();
        System.out.println(myMethod2.x);
        System.out.println("The average is " + myMethod.average());
    }
    
}
