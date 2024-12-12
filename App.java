import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
    // Creating instance of an object
    Scanner Input = new Scanner(System.in); // Instance of a scanner

    String userInput = null;
    double sumOfNum = 0;
    int count = 0;

    try {
      do {
        // getting the input of a user
        System.out.print("Enter number (type \"Done\" to finish): ");
        // making all the string input into all caps especially 'done' to 'DONE'
        userInput = Input.nextLine().toUpperCase();

        if ("DONE".equals(userInput)) {
          break;
        }

        // converting all the numbers that the user typed into double
        double numberInput = Double.parseDouble(userInput);

        // assigning the user input into new variable for tracking-
        // the amount of user input
        sumOfNum += numberInput;
        ++count;
      } while (!"DONE".equals(userInput)); // Keep asking for user input until the user entered the command 'done'
      if (count > 0) {
        System.out.println("Sum of all numbers: " + Math.round(sumOfNum));
        // getting the average by dividing the sum into the lenght of the input
        double average = sumOfNum / count;
        System.out.println("Average: " + Math.round(average));
      } else {
        System.out.println("No numbers were entered");
      }
    } catch (NumberFormatException exception) {
      // if the user typed anything but not numbers or the command 'done'
      // this will handle all the errors so it won't crash
      if (!"DONE".equals(userInput)) {
        System.out.println("Invalid input!");
      }
    } finally {
      System.out.println("Program closed.");
      // closing the scanner so it won't leak memory
      Input.close();
    }
  }
}
