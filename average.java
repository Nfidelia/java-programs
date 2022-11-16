// Java Program to Enter Marks of Five units and Calculate average
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five units::\n");

        // To store the values of five units
        System.out.println("Enter the marks of the first units::\n");
        float sub_1 = in.nextFloat();
        System.out.println("Enter the marks of the second units::\n");
        float sub_2 = in.nextFloat();
        System.out.println("Enter the marks of the third units::\n");
        float sub_3 = in.nextFloat();
        System.out.println("Enter the marks of the forth units::\n");
        float sub_4 = in.nextFloat();
        System.out.println("Enter the marks of the fifth units::\n");
        float sub_5 = in.nextFloat();

//geting the total of the marks and calculating the average
        float total;
        float average;
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        average = (float)(total / 5.0);
      //displaying the avarage in two decimal place using string.format %.2f
        System.out.println("The Average marks = " + String.format("%.2f", average));
       
  
    }
}