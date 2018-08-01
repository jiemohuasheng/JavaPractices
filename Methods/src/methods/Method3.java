
package methods;

public class Method3 {
    private int x, y, z;
    
    public double calculateAvg(double a, double b, double c) {
        System.out.println("Returned by double");
        return (a + b + c)/3;
    }
    
    public double calculateAvg(double a, double b) {
        System.out.println("Returned by double");
        return (a + b)/2;
    }
    
    public int calculateAvg(int a, int b, int c) {
        System.out.println("Returned by int");
        return (a + b + c)/2;
    }
    
    public static void main(String[] args) {
        Method3 m = new Method3();
        System.out.println(m.calculateAvg(2, 4));
    }
}
