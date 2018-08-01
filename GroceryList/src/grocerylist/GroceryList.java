package grocerylist;
import java.util.Scanner;

/**
 *
 * @author zhu143
 * The total price of 5 items using array
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] prices = new double[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the prices of 5 items:");
        prices[0] = in.nextDouble();
        prices[1] = in.nextDouble();
        prices[2] = in.nextDouble();
        prices[3] = in.nextDouble();
        prices[4] = in.nextDouble();
        double total = prices[0] + prices[1] + prices[2]+ prices[3] + prices[4];
        System.out.println("The total price of the 5 items is: " + total);
        System.out.printf("The total price of the 5 items is: $%5.2f", total); //format the total 
        
    }
    
}
