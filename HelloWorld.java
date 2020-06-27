import java.util.Scanner; // import the Scanner class 

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int number = 77;
        int number2 = 10;
        System.out.println(number+number2);
        Scanner name = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter name:");
        System.out.println("Hello " + name);
     }
}