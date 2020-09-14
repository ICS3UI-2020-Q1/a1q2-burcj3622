import java.util.Scanner;
 
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
   Scanner input = new Scanner(System.in);
  
   //asks for number to divivde
    System.out.println("Please enter in two integers, on seperate lines, to divide.");
  
  // Variable A is one number needed for division
  int A = input.nextInt();

  //variable B is the second number needed for division 
  int B = input.nextInt();

// declare and calculate the division
System.out.println( A+ "/" + B +" is " + A / B + " with a remainder of " + A % B );
}
}

