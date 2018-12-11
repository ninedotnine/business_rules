package application;

import application.products.*;
import application.accounts.*;

public class Application {
    public static void main(String[] args) {
        /* i don't know what this application is supposed to do.
           for now, this is a test/demo. */
        demo();
    }

    private static void demo() {
        System.out.println("---");
        GenericProduct product = new GenericProduct("Ordinary Everyday Item");
        product.process_payment();

        System.out.println("---");
        Book book = new Book("An Interesting Book");
        book.process_payment();

        System.out.println("---");
        Video vid = new Video("An Incredible Video");
        vid.process_payment();

        System.out.println("---");
        Video learning_to_ski = new LearningToSki();
        learning_to_ski.process_payment();

        System.out.println("---");
        AccountMembership alice = new AccountMembership("Alice", "email@example.com");
        alice.process_payment();

        System.out.println("---");
        AccountUpgrade bob = new AccountUpgrade("Bob", "email2@example.com");
        bob.process_payment();
    }
}
