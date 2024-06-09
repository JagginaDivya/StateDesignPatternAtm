public class ATMMachineContext {
    private State state;

    public ATMMachineContext() {
        // Initial state is Idle
        this.state = new IdleConcreteState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCard() {
        state.insertCard();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void enterPin() {
        state.enterPin();
    }

    public void requestCash() {
        state.requestCash();
    }
}
