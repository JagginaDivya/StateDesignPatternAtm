import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMMachineContext atmMachineContext = new ATMMachineContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine Simulation!");
        System.out.println("Available operations:");
        System.out.println("1. Insert Card");
        System.out.println("2. Eject Card");
        System.out.println("3. Enter PIN");
        System.out.println("4. Request Cash");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("\nEnter operation number (1-5): ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    atmMachineContext.insertCard();
                    break;
                case "2":
                    atmMachineContext.ejectCard();
                    break;
                case "3":

                    atmMachineContext.enterPin();
                    break;
                case "4":
                    atmMachineContext.requestCash();
                    break;
                case "5":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid operation number. Please enter a number from 1 to 5.");
            }
        }
    }
}
