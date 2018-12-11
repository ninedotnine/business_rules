package application.accounts;

import application.Payment;

public class AccountMembership extends Account implements Payment {

    public AccountMembership(String name, String email) {
        super(name, email);
    }

    /* If the payment is for a membership, activate that membership. */
    @Override
    public void process_payment() {
        super.process_payment();
        activate();
    }

    private void activate() {
        System.out.println("Activating membership for " + this.name +
                " to " + this.email);
        // todo.
    }
}
