import java.util.Random;

public class methode_overloading {
    public static void main(String args[]){
        System.out.println(addNumbers(2.,5));
        System.out.println(addNumbers(2.64,5.564));
        System.out.println(addNumbers(2,5,8));
        System.out.println(addNumbers());
    }
    public static int addNumbers(int a,int b){
        return a+b;
    }
    public static double addNumbers(double a,double b){
        return a+b;
    }
    public static int addNumbers(int a,int b,int c){
        return a+b+c;
    }
    public static double addNumbers() {
        Random random = new Random();
        return random.nextDouble(100); // Generates a random integer between 0 and 99
    }
}
