import java.util.Scanner;

// Pin Entered State
public class PinEnteredConcreteState implements State {
    private ATMMachineContext atmMachineContext;

    public PinEnteredConcreteState(ATMMachineContext atmMachineContext) {
        this.atmMachineContext = atmMachineContext;
    }

    @Override
    public void handle() {
        System.out.println("PIN Entered ...");
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted...");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cannot eject card after PIN entered...");
    }

    @Override
    public void enterPin() {
       System.out.println("Pin already entered");
    }

    @Override
    public void requestCash() {
        System.out.println("Cash dispensed...");
        atmMachineContext.setState(new DispenseCashConcreteState(atmMachineContext));
    }
}
