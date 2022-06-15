import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Setup scanner
    Scanner input = new Scanner(System.in);

    //Clear any messages when starting
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    //Get user password and save it
    System.out.println("Type a password:");
    String password = input.nextLine();

    //Clear the console
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    //ask the user for their password
    System.out.println("Hello user please enter your password.");
    String attempt = input.nextLine();

    //Check if the password matches what the user just typed
    if(attempt.equals(password)){
      System.out.println("Welcome to the password keeper program.");
    }
    else{
      System.out.println("Password incorrect.");
    }
  }
}