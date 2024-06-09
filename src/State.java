public interface State {
    void handle();
    void insertCard();
    void ejectCard();
    void enterPin();
    void requestCash();
}
