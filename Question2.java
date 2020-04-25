import java.util.Scanner;
import java.lang.Math;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    Scanner in = new Scanner(System.in);

    System.out.println("What is your height(M)");
    double height = in.nextDouble();

    System.out.println("What is your weight(KG)");
    double weight = in.nextDouble();

    double bmi = weight/Math.pow(height,2);

    System.out.println("Your BMI is "+bmi);
  }
}
