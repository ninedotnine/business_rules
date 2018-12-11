package application.products;

import application.Payment;

public class Book extends GenericProduct implements Payment {

    public Book(String name) {
        super(name);
    }

    /* If the payment is for a book,
       create a duplicate packing slip for the royalty department. */
    @Override
    public void process_payment() {
        super.process_payment();
        generate_slip();
    }
}
