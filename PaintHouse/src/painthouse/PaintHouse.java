package painthouse;
import java.util.Scanner;

/**
 *
 * @author zhu143
 * calculate the total surface area to be painted
 */
public class PaintHouse {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double houselength, housewidth, househeight, windowssize, doorssize, total;
        int windowsnum, doorsnum;
        Scanner in = new Scanner(System.in);
        System.out.println("The length of house: ");
        houselength = in.nextDouble();
        System.out.println("The width of house: ");
        housewidth = in.nextDouble();
        System.out.println("The height of house: ");
        househeight = in.nextDouble();
        System.out.println("The size of windows: ");
        windowssize = in.nextDouble();
        System.out.println("The number of windows: ");
        windowsnum = in.nextInt();
        System.out.println("The size of doors: ");
        doorssize = in.nextDouble();
        System.out.println("The number of doors: ");
        doorsnum = in.nextInt();
        total = (houselength *housewidth * househeight) - (windowssize * windowsnum) - (doorssize *doorsnum);
        System.out.println("The total painted area is: " + total);
    
    
    }
    
}
