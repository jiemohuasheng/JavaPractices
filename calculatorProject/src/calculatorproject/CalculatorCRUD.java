/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproject;

/**
 *
 * @author zhu143
 */
public class CalculatorCRUD {
    //global variables
    int a, b, c;
    
    //constructors
    public CalculatorCRUD(int x, int y){//local variables
        a = x;
        b = y;
    }
    
    //methods
    public int check(){
        if(a <= 0 || b <= 0){
            return -1;
        } else {
            return 1;
        }
    }
    
    public void print() {
        System.out.println("a and b should be positive.");
    }
    
    public void add(){
        if (check() == 1) {
            c = a + b;
            System.out.println("The addition is " + c);
        } else {
            print();
        }
    }
    
    public void sub(){
        c = a - b;
        System.out.println("The subtraction is " + c);
    }
    
    public void mult(){
        c = a * b;
        System.out.println("The multiplication is " + c);
    }
    
    public void devide(){
        c = a / b;
        System.out.println("The devision is " + c);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorCRUD first = new CalculatorCRUD(5, 3);
        first.add();
        CalculatorCRUD second = new CalculatorCRUD(3, 10);
        second.sub();
        CalculatorCRUD third = new CalculatorCRUD(10, 4);
        third.mult();
        CalculatorCRUD forth = new CalculatorCRUD(3, 0);
        forth.devide();
    }
    
}
