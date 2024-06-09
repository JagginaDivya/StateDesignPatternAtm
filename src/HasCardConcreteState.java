import java.util.Scanner;

public class HasCardConcreteState implements State {
    private ATMMachineContext atmMachineContext;

    public HasCardConcreteState(ATMMachineContext atmMachineContext) {
        this.atmMachineContext = atmMachineContext;
    }

    @Override
    public void handle() {
        System.out.println("Has Card ...");
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted...");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected...");
        atmMachineContext.setState(new IdleConcreteState(atmMachineContext));
    }

    @Override
    public void enterPin() {
        System.out.println("Enter PIN...");
        Scanner s = new Scanner(System.in);

        int pin = s.nextInt();
        if(pin==123) {
            System.out.println("Correct Pin...");
            atmMachineContext.setState(new PinEnteredConcreteState(atmMachineContext));
        }
        else {
            System.out.println("invalid pin");
        }

    }

    @Override
    public void requestCash() {
        System.out.println("Please enter PIN first...");
    }
}