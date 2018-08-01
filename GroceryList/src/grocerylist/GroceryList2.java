/*
 * Using ecapsulation */
package grocerylist;

import java.util.Scanner;

/**
 *
 * @author zhu143
 */
public class GroceryList2 {
    //decalre variables
    private double[] prices = new double[5];
    //double[] prices = {1, 7, 8, 5, 0}; this is the other way to declare a array
     
    //create a method to get prices from users 
    public void getPrices(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price from 5 items: ");
        prices[0] = in.nextDouble();
        prices[1] = in.nextDouble();
        prices[2] = in.nextDouble();
        prices[3] = in.nextDouble();
        prices[4] = in.nextDouble();
    }
    
    //create a method to get the total price
    public double totalPrices(){
        double total = prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
        return total;
    }
    
    public static void main(String[] args){
        GroceryList2 my = new GroceryList2();
        my.getPrices();
        System.out.println("The total price is " + my.totalPrices());
    }
}
