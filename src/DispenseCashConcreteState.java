
// Dispense Cash State
public class DispenseCashConcreteState implements State {
    private ATMMachineContext atmMachineContext;

    public DispenseCashConcreteState(ATMMachineContext atmMachineContext) {
        this.atmMachineContext = atmMachineContext;
    }

    @Override
    public void handle() {
        System.out.println("Dispensing Cash ...");
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted...");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cannot eject card while dispensing cash...");
    }

    @Override
    public void enterPin() {
        System.out.println("PIN already entered...");
    }

    @Override
    public void requestCash() {
        System.out.println("Cash already dispensed...");
        atmMachineContext.setState(new IdleConcreteState(atmMachineContext));
    }
}