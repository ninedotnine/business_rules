package application.accounts;

import application.Payment;

abstract class Account implements Payment {

    protected String name;
    protected String email;
    protected int account_id;

    protected int membership_status; // are there tiers of membership?

    private static int accounts_num = 1000; // reserve low numbers for internal use

    public Account(String name, String email) {
        this.name = name;

        // first check that email is valid
        validate_email(email);
        this.email = email;
        send_welcome_email();

        this.account_id = accounts_num;
        Account.accounts_num++;

        this.membership_status = 0;

        System.out.println("Created: " + this.getName());
    }

    public String getName() {
        return this.name;
    }

    /* If the payment is for a membership or upgrade,
       e-mail the owner and inform them of the activation/upgrade. */
    @Override
    public void process_payment() {
        send_inform_email();
    }

    private void validate_email(String email) {
        // todo.
    }


    private void send_welcome_email() {
        // todo.
    }


    private void send_inform_email() {
        System.out.println("Sending informative email for " + this.name +
                           " to " + this.email);
        // todo.
    }
}
