import java.util.Scanner;

/**
 * returns the first digit of a given number
 * @author Rose
 */
public class Main {
  
  //create method to calculate the first digit of a given integer
  public static int firstDigit(int integer) { 

    //if statement to change the negative integer to positive if the given integer is negative
    if (integer < 0){
      integer = integer * -1;
    }
    
    //while loop to keep dividing until only the first digit is left
    while (integer >= 10){
      integer /= 10;
    }

    //return the first digit on screen
    return integer;
}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user for a number and store it in the variable in the parameter mentioned above
    System.out.println("Please enter an integer");
    int integer = input.nextInt();

    //print the first digit on the screen
    System.out.println("The first digit of " + integer + " is " + firstDigit(integer));
    
  }
}
