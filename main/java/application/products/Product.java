package application.products;

import application.Payment;

abstract class Product implements Payment {

    protected String name;

    public Product(String name) {
        this.name = name;

        System.out.println("Created: " + this.getName());
    }

    public String getName() {
        return this.name;
    }

    /* If the payment is for a physical product,
       generate a packing slip for shipping. */
    @Override
    public void process_payment() {
        generate_slip();
    }

    protected void generate_slip() {
        System.out.println("Generating packing slip for " + this.name);
        // todo.
    }
}
