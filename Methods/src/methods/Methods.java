package methods;
import java.util.Scanner;

public class Methods {
    private double x, y, z;
    
    //Create a method to get all values from the user
    public void getValues() {
        System.out.println("Enter the three numbers: ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
    }
    
    //Create a method to ompute the values
    public double average(){
         double avg = (x + y + z)/3;
         return avg;
    }
    
    public static void main(String[] args) {
        Methods myMethod = new Methods();
        myMethod.getValues();
        System.out.println(myMethod.average());
    }
     
}
