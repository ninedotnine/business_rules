package application.accounts;

import application.Payment;

public class AccountUpgrade extends Account implements Payment {

    public AccountUpgrade(String name, String email) {
        super(name, email);
    }

    /* If the payment is an upgrade to a membership, apply the upgrade. */
    @Override
    public void process_payment() {
        super.process_payment();
        apply();
    }

    private void apply() {
        System.out.println("Applying upgrade for " + this.name);
        // todo.
    }
}

