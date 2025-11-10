public class Main {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling", 499);
        b.display();

        Circle c = new Circle();
        c.displayRadius();

        Person p1 = new Person("Rahul", 22);
        Person p2 = new Person(p1);
        p2.show();

        HotelBooking h1 = new HotelBooking("Krishna", "Deluxe", 3);
        h1.showBooking();

        LibraryBook lb = new LibraryBook("OOP Concepts", "Kathy Sierra", 350, true);
        lb.borrowBook();
        lb.checkStatus();

        CarRental cr = new CarRental("Arjun", "Swift", 5);
        cr.showRentalDetails();
    }
}
