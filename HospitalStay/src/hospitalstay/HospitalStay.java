/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalstay;
import java.util.Scanner;

/**
 *
 * @author zhu143
 */
public class HospitalStay {
    
    //declare variables
    double medication, services, total;
    String answer, ans;
    double overNight = 0;
    
    //calculate medication charges + lab services charges
    public double nonOvernight(){
        System.out.println("Enter the price for medication charges, lab services charges: ");
        Scanner in = new Scanner(System.in);
        medication = in.nextDouble();
        services = in.nextDouble();
        total = medication + services;
        return total;
    }
    //create a method to calculate the total charge
    //if overnight stay 
    public double totalCharge(){
        nonOvernight();
        Scanner in = new Scanner(System.in);
        System.out.println("Are you gonna stay overnight? Enter Y/N");
        answer = in.next();
        if(answer.equals("Y")){
            System.out.println("Enter the overnignt charge: ");
            overNight = in.nextDouble();
            System.out.println(total + overNight);
            return total + overNight;
        }
        else if(answer.equals("N")){
            System.out.println(total);
            return total;
        }
        else{
            return -1;
        }
        
    }
    
    public void nextPatient() {
        do {
            totalCharge();
            Scanner in = new Scanner(System.in);
            System.out.println("Do you want to compute price for another patient");
            System.out.println("Enter 'Y' for yes or 'N' for no.");
            ans = in.next();
        } while(ans.equals("Y"));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HospitalStay cost = new HospitalStay();
        cost.nextPatient();
        
    }
    
}
