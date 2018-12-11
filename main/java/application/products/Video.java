package application.products;

import application.Payment;

public class Video extends Product implements Payment {
    /* This is not explictly mentioned, but let's assume that
       this firm sells other videos besides "Learning to Ski". */

    public Video(String name) {
        super(name);
    }

    /* No special rules for videos (yet). */
    public void process_payment() {
        super.process_payment();
    }
}



