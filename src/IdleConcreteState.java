// Idle State
public class IdleConcreteState implements State {
    private ATMMachineContext atmMachineContext;

    public IdleConcreteState(ATMMachineContext atmMachineContext) {
        this.atmMachineContext = atmMachineContext;
    }

    @Override
    public void handle() {
        System.out.println("Machine in Idle State....");
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted...");
        atmMachineContext.setState(new HasCardConcreteState(atmMachineContext));
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject...");
    }

    @Override
    public void enterPin() {
        System.out.println("Please insert card first...");
    }

    @Override
    public void requestCash() {
        System.out.println("Please insert card first...");
    }
}