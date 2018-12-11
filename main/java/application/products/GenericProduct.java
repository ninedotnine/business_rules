package application.products;

import application.Payment;

public class GenericProduct extends Product implements Payment {
    public GenericProduct(String name) {
        super(name);
    }

    /* If the payment is for a physical product or a book,
       generate a commission payment to the agent. */
    @Override
    public void process_payment() {
        super.process_payment();
        generate_commission_payment();
    }

    private void generate_commission_payment() {
        System.out.println("Generating a commission payment for " + getName());
        // todo.
    }
}



