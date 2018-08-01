/*
 * This program demonstrates using a predefined method
 * It randomly generates two die values 100 times
 * and counts how many times we roll doubles
 */
package randomnumbers;
import java.util.Random;

/**
 *
 * @author zhu143
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1, die2, countDouble=0;
        Random rand = new Random();
        for(int i=0;i<100;i++){
            die1 = rand.nextInt(6)+1;
            die2 = rand.nextInt(6)+1;
            if(die1 == die2){
                countDouble++;
            }
        }
        System.out.println("I rolled " + countDouble + " doubles");
    }
    
}
