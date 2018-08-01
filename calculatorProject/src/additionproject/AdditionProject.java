package additionproject;

/**
 *
 * @author zhu143
 * add a and b if a < b
 */
public class AdditionProject {
    //global variables
    int a, b, c;  
    
    //Constructor
    public AdditionProject(int x, int y){ //local variables
        a = x;//assign the local variables to global variables
        b = y;
    }
    
    //Method
    public void add(){
        c = a + b;
        System.out.println(c);      
    }
    
    public void compare(){
        if(a>b){
            System.out.println("a should be smaller than b");
        }
        else{
            add();
        }
    }
    
    public static void main(String[] args) {
        AdditionProject second = new AdditionProject(3,8);
        second.compare();
    }
    
}
