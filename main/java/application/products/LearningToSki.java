package application.products;

import application.Payment;

public class LearningToSki extends Video implements Payment {

    public LearningToSki() {
        super("Learning to Ski");
    }

    /* If the payment is for the video "Learning to Ski,"
       add a free "First Aid" video to the packing slip
       (the result of a court decision in 1997). */
    @Override
    public void process_payment() {
        super.process_payment();
        add_first_aid_video();
    }

    private void add_first_aid_video() {
        System.out.println("Including first aid video as required by law.");
        // todo.
    }
}


