import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) {
        banner();
        wantInstructions();
        intro();
        chooseCity();
    }

    // Prints opening banner
    private static void banner(){
        System.out.println("Banner");
    }

    // Asks player if they want instructions
    private static void wantInstructions(){
        Scanner instInput = new Scanner(System.in);
        System.out.println("Would you like instructions on how to play the game? Y/N");
        String resp = instInput.nextLine().toUpperCase();

        switch(resp) {
            case "Y":
                System.out.println("Here are the instructions.");
                break;
            case "N":
                break;
            default:
                System.out.println("Please enter a valid input.");
                wantInstructions();
        }
    }

    private static void intro(){
        System.out.println("This is the situation.");
    }

    private static void chooseCity() {
        Scanner cityInput = new Scanner(System.in);
        System.out.println("Where would you like to start the game? \n" +
                "Enter 1 for Atlanta \n" +
                "Enter 2 for Austin \n" +
                "Enter 3 for Seattle");

        // Check if this works
        //convert string input to integer
        // write switch case to start game in each city or re-prompt if invalid input

        int cityInt = Integer.parseInt(cityInput.nextLine());

        switch(cityInt) {
            case 1:
                System.out.println("Welcome to Atlanta");
                break;
            case 2:
                System.out.println("Welcome to Austin");
                break;
            case 3:
                System.out.println("Welcome to Seattle");
                break;
            default:
                System.out.println("Please enter a valid input.");
                chooseCity();
        }
    }
}
