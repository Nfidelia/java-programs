import java.util.*;
 
public class countstring {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String username = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + username);
     System.out.print("Enter the age: ");
        int age = myObj.nextInt();
        System.out.println("Age is: " + age);
    
        int stringLength = username.length();

        System.out.println("Then the number of characters is: " + stringLength);

       

        if(age % 2 == 0)
            System.out.println ("Your current age is an even number");
        else
            System.out.println( "Your current age is an odd number");
    }
}